public class Main {
    public static void main(String[] args) {
        var dbConnection = DBConnection.getDbConnection();
        var newDbConnection = DBConnection.getDbConnection();
        /* The next two lines approve that, no matter how many times you try to
        create a new object (dbConnection) it will have the same hashcode (place)
         */

        System.out.println(dbConnection);
        System.out.println(newDbConnection);
    }
}