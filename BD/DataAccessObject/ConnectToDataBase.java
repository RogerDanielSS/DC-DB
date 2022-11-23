package bd.dataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ConnectToDataBase {
  String server_url = "jdbc:mysql://localhost/disk_cacamba?autoReconnect=true&useSSL=false";

  public void SampleConnection() throws SQLException {

    try {
      String sql_commandLine = "insert into venda (id_produto, id_atend, quantidade, dataV) values(1,1,7,'2022-11-20')";

      Connection connection = DriverManager.getConnection(this.server_url, "root", "");

      PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);
      genericSearch.execute();

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public Connection ConnectionBD() {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection(this.server_url, "root", "");
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return connection;
  }
}
