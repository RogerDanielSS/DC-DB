package model;

public class PessoaFisica {
    private int id;
    private int cpf;
    private int id_pessoa;
    
    public PessoaFisica(){
        this.id_pessoa = getId_Pessoa();
    }

    public int getId() {
        return id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
