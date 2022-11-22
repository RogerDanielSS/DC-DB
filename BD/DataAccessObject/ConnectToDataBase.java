package bd.DataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConnectToDataBase {
  String server_url = "jdbc:mysql://localhost/disk_cacamba";
  
  Connection connection = null;
  public Connection SampleConnection () throws SQLException{
    
    try  {
      String sql_commandLine = "insert into venda (id_produto, id_atend, quantidade, dataV) values(1,1,7,'2022-11-20')";
    
      Connection connection = DriverManager.getConnection(this.server_url, "root", "");

      PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);
      genericSearch.execute();
    


    } catch (SQLException e) {e.printStackTrace();    
    }   
    
    return connection;
  } 
  
}
