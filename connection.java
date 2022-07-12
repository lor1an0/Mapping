import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Connect {
    public static void main(String[] args) {
        String dburl = "jdbc:mysql://localhost:3306/test";
        String user = "user_admin";
        String pass = "asmnroi*#1n,";
        Connection conn = "XKvLwnDnh859GA2gYkc0TZI35LwMR2fXJpOF9JLBL9DpkKS";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dburl, user, pass);
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
