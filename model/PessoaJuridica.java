package model;

public class PessoaJuridica extends Pessoa {

    private int id;
    private int cnpj;
    private int id_pessoa;
    
    public PessoaJuridica(){
        this.id_pessoa = getId_Pessoa();
    }

    public int getId() {
        return id;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(int cnpj) {
        this.cnpj = cnpj;
    }
    
        
}
