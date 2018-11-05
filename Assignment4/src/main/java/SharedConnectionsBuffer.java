import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class SharedConnectionsBuffer {

    private final int MAX_LIMIT = 25;
    private final List<Connection> totalConnections = new ArrayList<Connection> ( );
    private Configuration configuration = new ConfigurationFromFile ( );
    private volatile Thread lastConsumer = null;
    private volatile int countOfContinousConsumesByAConsumer = 0;


    private Connection createNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName ( configuration.getDbDriver ( ) );
        return DriverManager.getConnection ( configuration.getDbUrl ( ), configuration.getDbUserName ( ), configuration.getDbUserPassword ( ) );
    }

    public synchronized void produceConnection() throws SQLException, ClassNotFoundException {
        while (totalConnections.size ( ) == MAX_LIMIT) {
            try {
                wait ( );
            } catch ( InterruptedException e ) {
                e.printStackTrace ( );
            }
        }
        System.out.println ( Thread.currentThread ( ).getName ( ) + " produced a Connection" );
        Connection connection = createNewConnection ( );
        totalConnections.add ( connection );
        notifyAll ( );
    }

    public synchronized Connection consumeConnection() {
        if (totalConnections.size ( ) == 0 || isSelfishConsumer ( Thread.currentThread ( ) )) {
            if (totalConnections.size ()==0){
                notifyAll ();
            }
            try {
                wait ( );
            } catch ( InterruptedException e ) {
                e.printStackTrace ( );
            }
        }
        Connection connection = totalConnections.get ( 0 );
        totalConnections.remove ( 0 );
        return connection;
    }

    private synchronized boolean isSelfishConsumer(Thread presentConsumer) {
        if (lastConsumer == presentConsumer) {
            countOfContinousConsumesByAConsumer++;
        } else {
            lastConsumer = presentConsumer;
            countOfContinousConsumesByAConsumer = 0;
        }
        return countOfContinousConsumesByAConsumer >= 2;
    }

    public void closeConnection(Connection connection) {
        System.out.println ( Thread.currentThread ( ).getName ( ) + " returned a connection" );
        try {
            connection.close ( );
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
    }
}


