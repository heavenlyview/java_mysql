
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MiniProjectConnectMySQL_me2 {
    public static void main(String[] args)  {
        final String DB_URL = "jdbc:mysql://localhost/world";
        final String USER = "root";
        final String PASS = "tbrs00002b";
        String QUERY = "select Code, Name, Population, Region "+
                        "from country "+
                        "where 1=1 " +
                        "and Name Like '%an%' "
        ;
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);) {
        // Extract data from result set
        while (rs.next()) {
           // Retrieve by column name
           System.out.print("Code: " + rs.getString("Code"));
           System.out.print(", Name: " + rs.getString("Name"));
           System.out.print(", Population: " + rs.getInt("Population"));
           System.out.println(", Region: " + rs.getString("Region"));
        }
     } catch (SQLException e) {
        e.printStackTrace();
     } 
     
     return;

    }
}
