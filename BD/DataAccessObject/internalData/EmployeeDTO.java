package bd.dataAccessObject.internalData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bd.dataAccessObject.ConnectToDataBase;
import model.Employeers;

public class EmployeeDTO {
    Connection connection;

    public ArrayList<Employeers> genericSearchEmployee(String field, String searchKey) {
        connection = new ConnectToDataBase().ConnectionBD();

        try {
            String sql_commandLine = "select * from atendimento";

            if (field != "" && searchKey != "")
                sql_commandLine += " where " + field + " = '" + searchKey + "'";

            PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);

            ResultSet searchResult = genericSearch.executeQuery();

            return getEmployeersList(searchResult);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<Employeers>();
    }

    private ArrayList<Employeers> getEmployeersList(ResultSet searchResult) throws SQLException {
    
        ArrayList<Employeers> employeers = new ArrayList<>();
    
        while (searchResult.next()) {
            int id = Integer.parseInt(searchResult.getString("id"));
            String nome = searchResult.getString("nome");
            int cpf = Integer.parseInt(searchResult.getString("cpf"));
            int token = Integer.parseInt(searchResult.getString("token"));
    
            Employeers worker = new Employeers(id, nome, nome, cpf, token);
            employeers.add(worker);
        } 
    
        return employeers;
        
      }
    
}  
