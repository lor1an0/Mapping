import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Connect {
    public static void main(String[] args) {
        String dburl = "localhost:3306/test";
        String u = "dewQIkUqLt02TB9ODn3R5C";
        String p = "nWgR4gD5SjZ9dp0zpM43TbnKFB2YAWDjBHSe5azS09YHvDr";
        Connection conn = "XKvLwnDnh859GA2gYkc0TZI35LwMR2fXJpOF9JLBL9DpkKS";
        String authToken = "JISBdunVVuHssjt0CpBxb8c1oJ8cZReujEPBR2uGzeEPAqu";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dburl, u, p, authToken);
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
