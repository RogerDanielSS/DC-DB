package model;

public class Veiculo {
  private int id;
  private int carga_max;
  private String marca;
  private String modelo;

  public Veiculo() {
  }

  // gets and sets
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCarga_max() {
    return carga_max;
  }

  public void setCarga_max(int carga_max) {
    this.carga_max = carga_max;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

}
/*
 * id int not null auto_increment,
 * carga_max integer,
 * marca varchar (60),
 * modelo varchar (60),
 */