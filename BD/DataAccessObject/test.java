package bd.dataAccessObject;

import java.util.ArrayList;

import bd.dataAccessObject.internalData.ClientDTO;
import model.Cliente;

public class test {
  public static void main(String[] args) throws Exception { // inicio do metodo main
    ClientDTO db = new ClientDTO();

    ArrayList<Cliente> clientes = db.genericSearchClient("id", "1");

    Cliente cliente = clientes.get(0);

    System.out.println(cliente.getId());
  }// fim do metodo main

}
