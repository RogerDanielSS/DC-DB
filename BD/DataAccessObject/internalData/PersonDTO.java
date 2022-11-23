package bd.dataAccessObject.internalData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bd.dataAccessObject.ConnectToDataBase;
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

            // return getClientsList(searchResult);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getPersonList(ResultSet searchResult) throws SQLException {

        ArrayList<Pessoa> persons = new ArrayList<>();

        while (searchResult.next()) {
            String id = searchResult.getString("id");

            Pessoa physicalPerson = getPhysicalsPerson(id);

            persons.add(physicalPerson);
        }

        return persons;
    }

    private ArrayList<Pessoa> getPhysicalsPerson(String id_pessoa) {
        connection = new ConnectToDataBase().ConnectionBD();

        try {
            String sql_commandLine = "select * from pessoa, pessoa_fisica where id = id_pessoa and id_pessoa = "
                    + id_pessoa;

            PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);

            ResultSet searchResult = genericSearch.executeQuery();

            return getPhysicalPersonList(searchResult);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<Pessoa>();
    }

    public ArrayList<Pessoa> getPhysicalPersonList(ResultSet searchResult) throws SQLException {

        ArrayList<Pessoa> physicalPersons = new ArrayList<>();

        while (searchResult.next()) {
            String id = searchResult.getString("pessoa.id");
            String nome = searchResult.getString("pessoa.nome");
            String endereco = searchResult.getString("pessoa.endereco");
            String cpf = searchResult.getString("pessoa_fisica.cpf");

            PessoaFisica physicalPerson = new PessoaFisica(id, nome, endereco, cpf);

            physicalPersons.add(physicalPerson);
        }

        return physicalPersons;
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
