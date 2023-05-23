import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DaoInterfaceImp implements DaoInterface {
    private static String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    private static String USERNAME = "root";
    private static String PASSWORD = "sani@1234";
     
    public void createDatabase() {
        try {
            Connection connection = connect();
                
            Statement state = connection.createStatement();

            ResultSet resultSet = connection.getMetaData().getCatalogs();
   
            while (resultSet.next()) {
                String databaseName = resultSet.getString(1);
                if(databaseName.equals("librarydb")) {
                    String sql = "DROP DATABASE librarydb";
                    state.executeUpdate(sql); 
                }
            }
            
            String sql = "CREATE DATABASE librarydb"; 
            state.executeUpdate(sql); 
        
            String useDatabaseSQL = "USE librarydb";
            state.executeUpdate(useDatabaseSQL);

            String createUserTableSQL = "CREATE TABLE USERS(UID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,"+
                    "USERNAME VARCHAR(20), PASSWORD VARCHAR(20), ADMIN BOOLEAN)";
            state.executeUpdate(createUserTableSQL);

            String insertUserSQL = "INSERT INTO USERS(USERNAME, PASSWORD, ADMIN) VALUES('admin','admin124',TRUE)";
            state.executeUpdate(insertUserSQL);

            String createBooksTableSQL = "CREATE TABLE BOOKS(BOOKNAME VARCHAR(50), GENRE VARCHAR(30), PRICE INT)";
            state.executeUpdate(createBooksTableSQL);

            String createIssuedTableSQL = "CREATE TABLE ISSUED(IID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,UID INT, BID INT, ISSUED_DATE VARCHAR(20), PERIOD INT)";
            state.executeUpdate(createIssuedTableSQL);

            String insertBooksSQL = "INSERT INTO BOOKS(BOOKNAME, GENRE, PRICE) VALUES" +
             "('War and Peace', 'Mystery', 200)," +
           "('The Guest Book', 'Fiction', 300)," +
          "('The Perfect Murder', 'Mystery', 150)," +
           "('Accidental Presidents', 'Biography', 250)";
          state.executeUpdate(insertBooksSQL);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }
}
