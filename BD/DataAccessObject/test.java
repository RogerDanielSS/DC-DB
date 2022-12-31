package BD.DataAccessObject;

import java.util.ArrayList;

import BD.DataAccessObject.internalData.PersonDTO;
import model.Pessoa;

public class test {
  public static void main(String[] args) throws Exception { // inicio do metodo main
     //ClientDTO db = new ClientDTO();

     //ArrayList<Cliente> clientes = db.genericSearchClient("id", "1");

     //Cliente cliente = clientes.get(0);

    PersonDTO db1 = new PersonDTO();

    ArrayList<Pessoa> pessoas = db1.genericSearchPessoa("id", "1");

    Pessoa pessoa = pessoas.get(0);

    //System.out.println(cliente.getId());
    System.out.println(pessoa.getNome());
  }// fim do metodo main

}
