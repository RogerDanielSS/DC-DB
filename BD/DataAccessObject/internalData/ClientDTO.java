package bd.dataAccessObject.internalData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bd.dataAccessObject.ConnectToDataBase;
import model.Cliente;
import model.Pessoa;

public class ClientDTO {
    Connection connection;
    PreparedStatement preparedStatement;

    public ArrayList<Cliente> genericSearchClient(String field, String searchKey) {
        connection = new ConnectToDataBase().ConnectionBD();

        try {
            String sql_commandLine = "select * from cliente";

            if (field != "" && searchKey != "")
                sql_commandLine += " where " + field + " = '" + searchKey + "'";

            PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);

            ResultSet searchResult = genericSearch.executeQuery();

            return getClientsList(searchResult);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<Cliente>();
    }

    private ArrayList<Cliente> getClientsList(ResultSet searchResult) throws SQLException {
    
        ArrayList<Cliente> clients = new ArrayList<>();
    
        while (searchResult.next()) {
          String id = searchResult.getString("id");
          String id_pessoa = searchResult.getString("id_pessoa");
    
          Pessoa pessoa = new Pessoa(id_pessoa, "", "");
          Cliente client = new Cliente(id, pessoa);

          clients.add(client);
        } 
    
        return clients;
        
      }
}
