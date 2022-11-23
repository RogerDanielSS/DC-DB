package model;

public class Pessoa {
    private int id_Pessoa;
    private String nome;
    private String endereco;

    public Pessoa(){}

    public int getId_Pessoa() {
        return id_Pessoa;
    }
    public void setId_Pessoa(int id_Pessoa) {
        this.id_Pessoa = id_Pessoa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
}
/*id int not null auto_increment,
nome varchar(60) not null,
endereco varchar (60) not null, */