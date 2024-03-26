package org.example.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping(value = "/api/v1/pessoa")
public class PessoaResource {


    @GetMapping
    public String listarPessoa(){
        log.info("Metodo GET");
        return "FAculdade senai fatesg";
    }

    @PostMapping
    public String qualquercoisa (@RequestBody String corpoDaMensagem){
        log.info("Metodo POST");
        log.debug("Objeto Recebido: []" , corpoDaMensagem);
        return "OBJETO RECEBIDO";
    }

}
