package bd.dataAccessObject.internalData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bd.dataAccessObject.ConnectToDataBase;
import model.Atendimento;
import model.Cliente;
import model.Employeers;

public class AtendimentoDTO {
    Connection connection;

    public ArrayList<Atendimento> genericSearchAtendimento(String field, String searchKey) {
        connection = new ConnectToDataBase().ConnectionBD();

        try {
            String sql_commandLine = "select * from atendimento";

            if (field != "" && searchKey != "")
                sql_commandLine += " where " + field + " = '" + searchKey + "'";

            PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);

            ResultSet searchResult = genericSearch.executeQuery();

            return getAtendimentoList(searchResult);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new ArrayList<Atendimento>();
    }


    public ArrayList<Atendimento> getAtendimentoList(ResultSet searchResult) throws SQLException {

        ArrayList<Atendimento> attendants = new ArrayList<>();

        while (searchResult.next()) {
            String id = searchResult.getString("id");
            String endereco = searchResult.getString("endereco");
            String id_cliente = searchResult.getString("id_cliente");
            String id_employee = searchResult.getString("id_funcionario");

            Cliente client = (new ClientDTO()).genericSearchClient("id",id_cliente).get(0);
            Employeers employee = (new EmployeeDTO()).genericSearchEmployee("id", id_employee).get(0);

            Atendimento attend = new Atendimento(id, employee, endereco, client);
            attendants.add(attend);
        }
        return attendants;
    }

    public void insertAtendimento(String field, String searchKey) {
        connection = new ConnectToDataBase().ConnectionBD();

        try {
            String sql_commandLine = "insert into atendimento (id_cliente, id_funcionario, endereco) values (1, 1, 'Mordor');";

            if (field != "" && searchKey != "")
                sql_commandLine += " where " + field + " = '" + searchKey + "'";

            PreparedStatement genericSearch = connection.prepareStatement(sql_commandLine);

            genericSearch.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
