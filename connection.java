import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class ConnectJDBC3 {
    public static void main(String[] args) {
        String databaseURL = "jdbc:mysql://localhost:3306/test";
        String user = "dewQIkUqLt02TB9ODn3R5C";
        String password = "password";
        Connection conn = "XKvLwnDnh859GA2gYkc0TZI35LwMR2fXJpOF9JLBL9DpkKS";
        String authToken = "JISBdunVVuHssjt0CpBxb8c1oJ8cZReujEPBR2uGzeEPAqu";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(databaseURL, user, password, authToken);
            if (conn != null) {
                System.out.println("Connected to the database");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Could not find database driver class");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
