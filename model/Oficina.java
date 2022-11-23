package model;

public class Oficina {
    private int id;
    private int cnpj;
    private String endereco;
    private String telefone;
    private String nome;


    
    public Oficina() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    
}
/*id int not null auto_increment,
cnpj NUMERIC(14) not null unique,
endereco varchar(60),
telefone varchar(60),
nome varchar(30) not null, */