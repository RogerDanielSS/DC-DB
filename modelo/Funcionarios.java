package modelo;

public class Funcionarios {
    int id;//chave primaria
    String nome;
    String senha;
    int cpf;
    int token;

    Funcionarios(){}

    Funcionarios(int id, String nome, String senha, int cpf, int token){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.token = token;
    }

    public String BuscarNome(String nome){
        String n = "";
        return n;
    }










    //gets e sets
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public int getCpf() {
        return cpf;
    }

    public int getToken() {
        return token;
    }

}
/*create table funcionario(
id int not null auto_increment,
nome varchar (60),
cpf NUMERIC(11) not null unique,
senha varchar (30),
token integer unique not null,
primary key (id)
)default charset = utf8; */