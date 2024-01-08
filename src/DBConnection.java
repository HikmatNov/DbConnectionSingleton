public class DBConnection {
    private static final DBConnection dbConnection = new DBConnection();
    private DBConnection() {
    }

    public static DBConnection getDbConnection() {
        if(dbConnection == null) new DBConnection();
        return dbConnection;
    }
}
