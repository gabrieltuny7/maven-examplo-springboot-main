package org.example.model;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cnpj;
    }

    public void setCpf(String cpf) {
        this.cnpj = cnpj;
    }
}
