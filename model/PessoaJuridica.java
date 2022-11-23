package model;

public class PessoaJuridica extends Pessoa {
    private int id;
    private int cnpj;

    public PessoaJuridica(String id_pessoa, String nome, String endereco, String cnpj) {
        super(id_pessoa, nome, endereco);
        this.cnpj = Integer.parseInt(cnpj);
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
