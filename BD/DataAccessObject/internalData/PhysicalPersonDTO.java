package BD.DataAccessObject.internalData;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import BD.DataAccessObject.ConnectToDataBase;
import model.Pessoa;
import model.PessoaFisica;

public class PhysicalPersonDTO {
    Connection connection;

    public ArrayList<Pessoa> getPhysicalPersons(String id_pessoa) {
        connection = new ConnectToDataBase().ConnectionBD();

        try {
            String sql_commandLine = "select * from pessoa, pessoa_fisica where pessoa.id = id_pessoa and id_pessoa = "
                    + id_pessoa;

            PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);

            ResultSet searchResult = genericSearch.executeQuery();

            return getPhysicalPersonList(searchResult);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<Pessoa>();
    }

    private ArrayList<Pessoa> getPhysicalPersonList(ResultSet searchResult) throws SQLException {

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
}
