import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

class SharedConnectionsBuffer {

    private final static SharedConnectionsBuffer sharedConnectionsBuffer = new SharedConnectionsBuffer ( );
    private final ArrayList<Connection> totalConnections = new ArrayList<Connection> ( );
    private Configuration configuration = new ConfigurationFromFile ( );
    private final int MAX_LIMIT = configuration.getMaxConnections ( );
    private volatile Thread lastConsumer = null;
    private volatile int countOfContinuousConsumesByAConsumer = 0;

    private SharedConnectionsBuffer() {
    }

    public static SharedConnectionsBuffer getInstance() {
        return sharedConnectionsBuffer;
    }

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

        Connection connection = createNewConnection ( );
        totalConnections.add ( connection );
        System.out.println ( Thread.currentThread ( ).getName ( ) + " produced a Connection" + "\tTotal Connections = " + totalConnections.size ( ) );
        notifyAll ( );
    }

    public synchronized Connection consumeConnection() {
        if (totalConnections.size ( ) == 0 || isSelfishConsumer ( Thread.currentThread ( ) )) {
            if (totalConnections.size ( ) == 0) {
                try {
                    System.out.println ( Thread.currentThread ( ).getName ( ) + "\t is waiting" );
                    wait ( );
                } catch ( InterruptedException e ) {
                    e.printStackTrace ( );
                }
            }
        }
        Connection connection = totalConnections.get ( 0 );
        totalConnections.remove ( 0 );
        System.out.println ( Thread.currentThread ( ).getName ( ) + "\tconsumed a connection" + "\ttotal connections" + totalConnections.size ( ) );
        if (totalConnections.size ( ) == 0) {
            notifyAll ( );
        }
        return connection;
    }

    private synchronized boolean isSelfishConsumer(Thread presentConsumer) {
        if (lastConsumer == presentConsumer) {
            countOfContinuousConsumesByAConsumer++;
        } else {
            lastConsumer = presentConsumer;
            countOfContinuousConsumesByAConsumer = 0;
        }
        return countOfContinuousConsumesByAConsumer >= 2;
    }

    public synchronized void closeConnection(Connection connection) {
        try {
            connection.close ( );
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
    }
}


