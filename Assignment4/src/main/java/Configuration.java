interface Configuration {
    String getDbUrl();

    String getDbUserName();

    String getDbDriver();

    String getDbUserPassword();

    int getMaxConnections();
}
