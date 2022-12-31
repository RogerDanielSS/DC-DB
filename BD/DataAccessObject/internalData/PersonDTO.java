package BD.DataAccessObject.internalData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BD.DataAccessObject.ConnectToDataBase;
import model.Pessoa;
import model.PessoaFisica;

public class PersonDTO {
    Connection connection;

    public ArrayList<Pessoa> genericSearchPessoa(String field, String searchKey) {
        connection = new ConnectToDataBase().ConnectionBD();

        try {
            String sql_commandLine = "select * from pessoa";

            if (field != "" && searchKey != "")
                sql_commandLine += " where " + field + " = '" + searchKey + "'";

            PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);

            ResultSet searchResult = genericSearch.executeQuery();

            return getPersonList(searchResult);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getPersonList(ResultSet searchResult) throws SQLException {

        ArrayList<Pessoa> persons = new ArrayList<>();

        while (searchResult.next()) {
            String id = searchResult.getString("id");
            PhysicalPersonDTO physicalPersonDTO =  new PhysicalPersonDTO();
            LegalPersonDTO legalPersonDTO = new LegalPersonDTO();

            ArrayList<Pessoa> physicalPersons = physicalPersonDTO.getPhysicalPersons(id);
            ArrayList<Pessoa> legalPersons = legalPersonDTO.getLegalPersons(id);

            persons.addAll(physicalPersons);
            persons.addAll(legalPersons);
        }

        return persons;
    }

    public void registration(Pessoa objPessoa) {// will be responsible to put the information
        // offered by the control to the bd

        String sql = "insert into administrador (nome, endereco) values (?,?)";
        connection = new ConnectToDataBase().ConnectionBD();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, objPessoa.getNome());
            preparedStatement.setString(2, objPessoa.getEndereco());

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
