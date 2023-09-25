import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Q32 {
  public static void main(String[] args) {
    try {
      Class.forName("org.hsqldb.jdbc.JDBCDriver");
    } catch (Exception e) {
      System.err.println("ERROR: failed to load HSQLDB JDBC driver.");
      e.printStackTrace();
      return;
    }

    try (
        Connection conn = DriverManager.getConnection(
            "jdbc:hsqldb:file:/opt/db/testdb;shutdown=true", "SA", "");
        Statement stmt = conn.createStatement();) {
      String sql = "CREATE TABLE emp (id INTEGER, name VARCHAR(20), name2 VARCHAR(20))";
      System.out.println("===============tb");
      boolean rs = stmt.execute(sql);
      System.out.println(rs);
    } catch (Exception e) {
      System.out.println("===============tb err");
      System.out.println(e);
    }

    try (
        Connection conn = DriverManager.getConnection(
            "jdbc:hsqldb:file:/opt/db/testdb;shutdown=true", "SA", "");
        // Connection conn = ds.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into emp values(?,?,?)");
        Statement stmt = conn.createStatement();) {
      stmt.execute("delete from emp");
      String sql = "INSERT INTO emp VALUES (1, 'Zara', 'Ali')";
      stmt.executeUpdate(sql);

      ps.setObject(1, 2, JDBCType.INTEGER);
      ps.setObject(2, "201", JDBCType.VARCHAR);
      ps.setObject(3, "202", JDBCType.VARCHAR);
      ps.executeUpdate();

      ps.setInt(1, 3);
      ps.setString(2, "JSON");      
      ps.executeUpdate();

      ps.setString(1,"4");
      ps.executeUpdate();

      String sql1 = "select * from emp ";
      ResultSet rs = stmt.executeQuery(sql1);

      while (rs.next()) {
        System.out.println("tabel data=----------------------------");
        System.out.println(rs.getInt(1));
        System.out.println(rs.getString(2));
        System.out.println(rs.getString(3));
      }

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
