package org.example.model;

import lombok.Getter;
import lombok.Setter;

public class Email {
    @Setter
    @Getter
    private String enderecoEmail;

    private String email;

    // Construtor, getters e setters
    public Email (String nome, int idade, String email) {
        this.enderecoEmail = enderecoEmail;

    }
    //Super Pra fisico e Juridico
    public Email(String enderecoEmail) {
    }

}
