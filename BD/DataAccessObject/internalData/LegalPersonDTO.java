package bd.dataAccessObject.internalData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bd.dataAccessObject.ConnectToDataBase;
import model.Pessoa;
import model.PessoaFisica;

public class LegalPersonDTO {
    Connection connection;

    public ArrayList<Pessoa> getLegalPersons(String id_pessoa) {
        connection = new ConnectToDataBase().ConnectionBD();

        try {
            String sql_commandLine = "select * from pessoa, pessoa_juridica where pessoa.id = id_pessoa and id_pessoa = "
                    + id_pessoa;

            PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);

            ResultSet searchResult = genericSearch.executeQuery();

            return getLegalPersonList(searchResult);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<Pessoa>();
    }

    private ArrayList<Pessoa> getLegalPersonList(ResultSet searchResult) throws SQLException {

        ArrayList<Pessoa> physicalPersons = new ArrayList<>();

        while (searchResult.next()) {
            String id = searchResult.getString("pessoa.id");
            String nome = searchResult.getString("pessoa.nome");
            String endereco = searchResult.getString("pessoa.endereco");
            String cnpj = searchResult.getString("pessoa_fisica.cnpj");

            PessoaFisica physicalPerson = new PessoaFisica(id, nome, endereco, cnpj);

            physicalPersons.add(physicalPerson);
        }

        return physicalPersons;
    }
}
