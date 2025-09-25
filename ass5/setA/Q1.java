import java.sql.*;

public class Q1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/dbtybca", "postgres", "mit@2025");

            if (conn == null) {
                System.out.println("Connection failed");
            } else {
                System.out.println("Connection successful");
                stmt = conn.createStatement();

                rs = stmt.executeQuery("SELECT * FROM person");

                while (rs.next()) {
                    System.out.println("PID: " + rs.getInt(1));
                    System.out.println("Name: " + rs.getString(2));
                    System.out.println("Gender: " + rs.getString(3));
                    System.out.println("Birth year: " + rs.getInt(4)); // Changed from rs.getInt(1) to rs.getInt(4)
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred.");
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
