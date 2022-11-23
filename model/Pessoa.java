package model;

public class Pessoa {

    private int id;
    private String nome;
    private String endereco;

    public Pessoa(String id, String nome, String endereco) {
        this.id = Integer.parseInt(id);
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
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
/*
 * id int not null auto_increment,
 * nome varchar(60) not null,
 * endereco varchar (60) not null,
 */