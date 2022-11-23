package bd.dataAccessObject.internalData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDAO {
    Connection conn;
    PreparedStatement pstm;

    public void cadastrarFuncionario( EmployeeDAO objFuncionarioDBD){
        String sql = "Insert into funcionario (nome_funcionario, endereco_funcionario";

        // conn = new ConnectToDataBase().SampleConnection();
    }
}
