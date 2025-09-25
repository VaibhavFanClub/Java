import java.sql.*;

public class setA3 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://127.0.0.1:5432/dbtybca";
        String user = "postgres";
        String password = ""; 

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "SELECT * FROM Country WHERE Region = 'West'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.printf("%-20s %-15s %-20s %-10s%n", "Name", "Continent", "Capital", "Region");
            System.out.println("---------------------------------------------------------------");

            while (rs.next()) {
                System.out.printf("%-20s %-15s %-20s %-10s%n",
                        rs.getString("Name"),
                        rs.getString("Continent"),
                        rs.getString("Capital"),
                        rs.getString("Region"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
