import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SharedConnectionsBuffer {

    private final List<Connection> totalConnections = new ArrayList<Connection> ( );
    private Configuration configuration = new ConfigurationFromFile ( );


    public Connection createNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName ( configuration.getDbDriver ( ) );
        return DriverManager.getConnection ( configuration.getDbUrl ( ), configuration.getDbUserName ( ), configuration.getDbUserPassword ( ) );
    }

    public void produceConnection() throws SQLException, ClassNotFoundException {
        Connection connection = createNewConnection ();
        totalConnections.add (connection);
    }

    public Connection consumeConnection(){
        Connection connection = totalConnections.get ( 0 );
        totalConnections.remove ( 0 );
        return connection;
    }
}


