interface DbConfiguration {
    String DB_URL = null;
    String DB_USER_NAME = null;
    String DB_DRIVER = null;
    String DB_USER_PASSWORD = null;
    int MAX_CONNECTIONS = 0;
    String getDbUrl();
    String getDbUserName();
    String getDbDriver();
    String getDbUserPassword();
    int getMaxConnections();
}
