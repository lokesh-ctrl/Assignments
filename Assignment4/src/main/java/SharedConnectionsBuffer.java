import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SharedConnectionsBuffer {

    private final int MAX_LIMIT = 25;
    private List<Connection> totalConnections = new ArrayList<Connection> ( );
    private Configuration configuration = new ConfigurationFromFile ("/Users/rlokesh/Documents/Projects/Dialer_App/Assignment4/src/main/resources/configuration.properties");

    public Connection createNewConnection() throws ClassNotFoundException, SQLException {
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
        System.out.println ( Thread.currentThread ()+"produced a Connection" );
        Connection connection = createNewConnection ( );
        totalConnections.add ( connection );
        notifyAll ( );
    }

    public synchronized Connection consumeConnection() {
        if (totalConnections.size ()==0) {
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

    public void closeConnection(Connection connection){
        System.out.println ( Thread.currentThread ()+"returned a connection" );
        try {
            connection.close ();
        } catch ( SQLException e ) {
            e.printStackTrace ( );
        }
    }
}


