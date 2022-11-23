package model;

public class Pessoa {
  int id;
  String nome;
  String endereco;

  public Pessoa(String id, String nome, String endereco){
    this.id = Integer.parseInt(id);
    this.nome = nome;
    this.endereco = endereco;
  }
}
