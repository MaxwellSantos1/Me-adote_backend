package br.com.meadote.meadote.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meadote.meadote.models.Pessoa;
import br.com.meadote.meadote.repositories.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaService;

    public List<Pessoa> findAll() {
        return pessoaService.findAll();
    }
}
