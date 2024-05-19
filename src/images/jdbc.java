
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {

    public static Connection method() {
        String url = "jdbc:mysql://localhost:3306/bms";
        String username = "root";
        String password = "Sai123$$$";
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return con;
    }

    // Close the connection in the finally block
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
