package org.example.model;

public class PessoaBuilder {
    private String nome;

    public PessoaBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Pessoa createPessoa() {
        return new Pessoa(nome);
    }
}