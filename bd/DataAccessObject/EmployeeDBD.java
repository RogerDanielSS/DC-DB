package bd.DataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDBD {
    Connection conn;
    PreparedStatement pstm;

    public void cadastrarFuncionario( EmployeeDBD objFuncionarioDBD){
        String sql = "Insert into funcionario (nome_funcionario, endereco_funcionario";

        //conn = new ConnectToDataBase().SampleConnection();
    }
}
