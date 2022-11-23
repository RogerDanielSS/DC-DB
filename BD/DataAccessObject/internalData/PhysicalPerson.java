package bd.dataAccessObject.internalData;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bd.dataAccessObject.ConnectToDataBase;
import model.Pessoa;

public class PhysicalPerson {
    Connection connection;

    public ArrayList<Pessoa> genericSearchPessoa(String field, String searchKey) {
        connection = new ConnectToDataBase().ConnectionBD();

        try {
            String sql_commandLine = "select * from pessoa";

            if (field != "" && searchKey != "")
                sql_commandLine += " where " + field + " = '" + searchKey + "'";

            PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);

            ResultSet searchResult = genericSearch.executeQuery();

            //return getClientsList(searchResult);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getPessoaList(ResultSet searchResult) throws SQLException{

        ArrayList<Pessoa> persons = new ArrayList<>();
    
        while (searchResult.next()) {
          String id = searchResult.getString("id");
          String nome = searchResult.getString("nome");
          String endereco = searchResult.getString("endereco");
    
          //Pessoa person = new Pessoa(id_pessoa, "", "");
          //Cliente client = new Cliente(id, pessoa);

          //persons.add(client);
        } 
    
        return persons;
    }
}
