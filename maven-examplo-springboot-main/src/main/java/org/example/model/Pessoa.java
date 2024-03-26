package org.example.model;

import lombok.Getter;
import lombok.Setter;

public class Pessoa {
    @Setter
    @Getter
    private String nome;

    // Construtor, getters e setters
    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;

    }
//Super Pra fisico e Juridico
    public Pessoa(String nome) {
    }

}


