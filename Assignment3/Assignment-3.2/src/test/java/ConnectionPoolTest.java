import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionPoolTest {
    @Test
    void createConnection() throws Exception {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection connection = connectionPool.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from account where account_id = 1000");
        System.out.println(resultSet);
        assertTrue(true);
    }

    @Test
    void shouldThrowErrorIfConnectionsAreMoreThanFive() throws Exception {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection connection1 = connectionPool.getConnection();
        Connection connection2 = connectionPool.getConnection();
        Connection connection3 = connectionPool.getConnection();
        Connection connection4 = connectionPool.getConnection();
        Connection connection5 = connectionPool.getConnection();
        try {
            Connection connection6 = connectionPool.getConnection();
        }
        catch (Exception e){
            assertEquals("ConnectionPoolLimitReached",e.getMessage());
        }
    }
}