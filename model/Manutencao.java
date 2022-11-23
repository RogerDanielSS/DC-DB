package model;

public class Manutencao {
    private int id;
    private float value;
    private String date_M;
    private String descricao;
    private int id_veiculo;
    
    public Manutencao() {}


    //gets and sets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }
    public String getDate_M() {
        return date_M;
    }
    public void setDate_M(String date_M) {
        this.date_M = date_M;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getId_veiculo() {
        return id_veiculo;
    }
    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    
}
/*id int not null auto_increment,
valor float,
descricao varchar (300),
data_M date,
id_veiculo int not null, */