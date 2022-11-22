package bd.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDBD {
    Connection conn;
    PreparedStatement pstm;

    public void cadastrarFuncionario(FuncionarioDBD objFuncionarioDBD) {
        String sql = "Insert into funcionario (nome_funcionario, endereco_funcionario";

        // conn = new ConnectToDataBase().SampleConnection();
    }
}
