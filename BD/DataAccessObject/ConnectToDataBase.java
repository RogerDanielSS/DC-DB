package bd.dataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectToDataBase {
  String server_url = "jdbc:mysql://localhost/disk_cacamba";

  public Connection SampleConnection() throws SQLException {

    Connection connection = DriverManager.getConnection(this.server_url, "root", "");

    try {
      String sql_commandLine = "insert into venda (id_produto, id_atend, quantidade, dataV) values(1,1,7,'2022-11-20')";

      PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);

      genericSearch.execute();

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return connection;
  }

  =======}catch(

  SQLException e)
  {
      e.printStackTrace();
    }
}

>>>>>>>Roger}
