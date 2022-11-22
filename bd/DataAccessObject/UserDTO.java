package bd.DataAccessObject;

public class UserDTO {
    private int id; //chave primaria
    private int cpf;
    private String senha;
    private String nome;
    private String email;

 






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
/*create table administrador(
 id integer not null auto_increment,
 email varchar(60) not null unique,
 cpf   NUMERIC(11),
 nome varchar(60) not null,
 senha varchar(60) not null,
 primary key(id)
) default charset = utf8;*/