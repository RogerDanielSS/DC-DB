package model;

public class PessoaFisica extends Pessoa {
    private int id;
    private long cpf;

    public PessoaFisica(String id_pessoa, String nome, String endereco, String cpf) {
        super(id_pessoa, nome, endereco);
        this.cpf = Long.parseLong(cpf);
    }

    public int getId() {
        return id;
    }

    public long getCpf() {
        return cpf;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
