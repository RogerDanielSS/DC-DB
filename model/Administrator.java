package model;

public class Administrator {
    private int id; //chave primaria
    private int cpf;
    private String senha;
    private String nome;
    private String email;

    Administrator(){}






    //gets e sets
    public void setId(int id) {
        this.id = id;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public int getCpf() {
        return cpf;
    }
    public String getSenha() {
        return senha;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
}
