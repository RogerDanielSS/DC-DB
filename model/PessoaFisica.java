package model;

public class PessoaFisica extends Pessoa {
    private int id;
    private int cpf;

    public PessoaFisica(String id_pessoa, String nome, String endereco, String cpf) {
        super(id_pessoa, nome, endereco);
        this.cpf = Integer.parseInt(cpf);
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
