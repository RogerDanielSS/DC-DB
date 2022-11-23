package model;

public class Venda extends Atendimento{
  public Venda(String id, Employeers funcionario, String endereco, Cliente cliente) {
    super(id, funcionario, endereco, cliente);
  }
}
