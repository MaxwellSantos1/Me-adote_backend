package br.com.meadote.meadote.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meadote.meadote.models.Pessoa;
import br.com.meadote.meadote.services.PessoaService;

@RestController
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping("")
    public ResponseEntity<List<Pessoa>> findAll() {
        return ResponseEntity.ok(pessoaService.findAll());
    }

}
