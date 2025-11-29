import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    static final String URL = "jdbc:mysql://127.0.0.1:3306/cinema";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("\n Database error: " + e.getMessage());
            return null;
        }
    }
}
