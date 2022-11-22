package bd.dataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDBD {
    Connection conn;
    PreparedStatement pstm;

<<<<<<< HEAD:bd/DataAccessObject/EmployeeDBD.java
    public void cadastrarFuncionario( EmployeeDBD objFuncionarioDBD){
=======
    public void cadastrarFuncionario(FuncionarioDBD objFuncionarioDBD) {
>>>>>>> main:bd/DataAccessObject/FuncionarioDBD.java
        String sql = "Insert into funcionario (nome_funcionario, endereco_funcionario";

        // conn = new ConnectToDataBase().SampleConnection();
    }
}
