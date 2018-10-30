import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class ConnectionPool {

    private static final ConnectionPool INSTANCE = new ConnectionPool ( );
    private static int totalconnections = 0;
    final List<Connection> availableConnections = new ArrayList<Connection> ( );


    private ConnectionPool() {

    }

    public static ConnectionPool getInstance() {
        return INSTANCE;
    }

    private Connection createNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName ( DbConfiguration.getDbDriver ( ) );
        return DriverManager.getConnection ( DbConfiguration.getDbUrl ( ), DbConfiguration.getDbUserName ( ), DbConfiguration.getDbUserPassword ( ) );
    }

    public Connection getConnection() throws Exception {
        if (availableConnections.size ( ) > 0) {
            Connection connection = availableConnections.get ( 0 );
            availableConnections.remove ( 0 );
            return connection;
        } else if (totalconnections < DbConfiguration.getMaxConnections ( )) {
            Connection newConnection = createNewConnection ( );
            totalconnections++;
            return newConnection;
        } else {
            throw new Exception ( "ConnectionPoolLimitReached" );
        }
    }

    public void returnConnection(Connection connection) {
        availableConnections.add ( connection );
    }

}


