import java.sql.*;

public class setA2{
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/dbtybca", "postgres", "");

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM Person");

            rsmd = rs.getMetaData();

            int columnCount = rsmd.getColumnCount();
            System.out.println("Number of columns: " + columnCount);
            System.out.println("Column details:");

            for (int i = 1; i <= columnCount; i++) {
                System.out.printf("Column %d: %s, SQL Type: %s%n",
                        i,
                        rsmd.getColumnName(i),
                        rsmd.getColumnTypeName(i));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
