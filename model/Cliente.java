package model;

public class Cliente {
  int id;
  Pessoa pessoa;

  public Cliente(String id, Pessoa pessoa){
    this.id = Integer.parseInt(id);
    this.pessoa = pessoa; 
  }

  public int getId() {
    return id;
  }
}
