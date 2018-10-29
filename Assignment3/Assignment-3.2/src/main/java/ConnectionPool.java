import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

class ConnectionPool {
    private static String DB_URL;
    private static String DB_USER_NAME;
    private static String DB_DRIVER;
    private static String DB_USER_PASSWORD;
    private static int MAX_CONNECTIONS;

    private static void init() {
        Properties properties = new Properties ( );
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream ( "src/main/resources/configuration.properties" );
            properties.load ( inputStream );
        } catch ( FileNotFoundException e ) {
            e.printStackTrace ( );
        } catch ( IOException e ) {
            e.printStackTrace ( );
        }
        DB_DRIVER = properties.getProperty ( "DB_DRIVER" );
        DB_URL = properties.getProperty ( "DB_URL" );
        DB_USER_NAME = properties.getProperty ( "DB_USER_NAME" );
        DB_USER_PASSWORD = properties.getProperty ( "DB_USER_PASSWORD" );
        MAX_CONNECTIONS = Integer.parseInt ( properties.getProperty ( "MAX_CONNECTIONS" ) );
    }

    private static final ConnectionPool INSTANCE = new ConnectionPool ( );

    private ConnectionPool() {
        ConnectionPool.init ( );
    }

    public static ConnectionPool getInstance() {
        return INSTANCE;
    }


    final List<Connection> availableConnections = new ArrayList<Connection> ( );
    private static int totalconnections = 0;

    private Connection createNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName ( DB_DRIVER );
        return DriverManager.getConnection ( DB_URL, DB_USER_NAME, DB_USER_PASSWORD );
    }

    public Connection getConnection() throws Exception {
        if (availableConnections.size ( ) > 0) {
            Connection connection = availableConnections.get ( 0 );
            availableConnections.remove ( 0 );
            return connection;
        } else if (totalconnections < MAX_CONNECTIONS) {
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


