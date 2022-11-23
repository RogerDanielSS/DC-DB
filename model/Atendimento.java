package model;

public class Atendimento {
    private int id;
    private Employeers funcionario;
    private String endereco;
    private Cliente cliente;

    
    public Atendimento(String id2, Employeers funcionario, String endereco, Cliente cliente) {
        this.id = id;
        this.funcionario = funcionario;
        this.endereco = endereco;
        this.cliente = cliente;
    }

    public Atendimento() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Employeers getfuncionario() {
        return funcionario;
    }
    public void setId_funcionario(Employeers funcionario) {
        this.funcionario = funcionario;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setId_cliente(Cliente cliente) {
        this.cliente = cliente;
    }





    
}
/*id int not null auto_increment,
id_cliente int not null,
id_funcionario int not null,
endereco varchar (60) not null, */