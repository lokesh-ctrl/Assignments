import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationFromFile implements Configuration {
    private static final String DB_URL;
    private static String FILE_PATH = "src/main/resources/configuration.properties";
    private static String DB_USER_NAME;
    private static String DB_DRIVER;
    private static String DB_USER_PASSWORD;
    private static int MAX_CONNECTIONS;

    static {
        Properties properties = new Properties ( );
        InputStream inputStream;
        try {
            inputStream = new FileInputStream ( FILE_PATH );
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
    public ConfigurationFromFile(String filePath) {
        FILE_PATH = filePath;
    }
    public ConfigurationFromFile() {
        FILE_PATH = "src/main/resources/configuration.properties";
    }

    public String getDbUrl() {
        return DB_URL;
    }

    public String getDbUserName() {
        return DB_USER_NAME;
    }

    public String getDbDriver() {
        return DB_DRIVER;
    }

    public String getDbUserPassword() {
        return DB_USER_PASSWORD;
    }

    public int getMaxConnections() {
        return MAX_CONNECTIONS;
    }

}
