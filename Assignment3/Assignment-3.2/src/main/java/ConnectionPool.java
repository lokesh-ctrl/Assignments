import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private static final String DB_DRIVER = "org.postgresql.Driver";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/foodmart";
    private static final String DB_USER_NAME = "foodmart";
    private static final String DB_USER_PASSWORD = "foodmart";
    private static final int MAX_CONNECTIONS = 5 ;

    List<Connection> availableConnections = new ArrayList<Connection>();
    private static int connections = 0;

    private Connection createNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DB_DRIVER);
        Connection connection = DriverManager.getConnection(DB_URL,DB_USER_NAME,DB_USER_PASSWORD);
        return connection;
    }

    private void addConnectionToThePool(Connection newconnection){
        availableConnections.add(newconnection);
    }

    private Connection getConnection() throws Exception {
        if (availableConnections.size()>0){
            Connection connection = availableConnections.get(0);
            availableConnections.remove(0);
            return connection;
        }
        else if (connections < MAX_CONNECTIONS){
            Connection newConnection = createNewConnection();
            connections++;
            return newConnection;
        }
        else {
            throw new Exception("ConnectionPoolLimitReached");
        }
    }

}


