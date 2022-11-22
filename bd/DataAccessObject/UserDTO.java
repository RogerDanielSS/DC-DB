package bd.DataAccessObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Administrator;

public class UserDTO {
    private Connection connection;
    private PreparedStatement pstm;

    public ResultSet authenticationUser(Administrator objADM) {//verify login and password

        connection = new ConnectToDataBase().ConnectionBD();

        try{
            String sql = "select + from administrador where email = ? and senha = ?";
            PreparedStatement pstm =  connection.prepareStatement(sql);
            pstm.setString(1, objADM.getEmail());// 1 is related to the frist ? in the String sq1
            pstm.setString(2, objADM.getSenha());//2 is the second ? in the string sq1

            ResultSet rs = pstm.executeQuery();
            return rs; 

        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

    public void registration(Administrator objADM){// will be responsible to put the information 
        //offered by the control to the bd
        
        String sql = "insert into administrador (email, cpf, nome, senha) values (?,?,?,?,?)";
        connection = new ConnectToDataBase().ConnectionBD();

         try{
            pstm = connection.prepareStatement(sql);
            pstm.setString(1, objADM.getEmail());
            pstm.setInt(2, objADM.getCpf());
            pstm.setString(3, objADM.getNome());
            pstm.setString(4, objADM.getSenha());

            pstm.execute();
            pstm.close();

         }catch(SQLException e){

            e.printStackTrace();
         }
    }
    







}
/*create table administrador(
 id integer not null auto_increment,
 email varchar(60) not null unique,
 cpf   NUMERIC(11),
 nome varchar(60) not null,
 senha varchar(60) not null,
 primary key(id)
) default charset = utf8;*/