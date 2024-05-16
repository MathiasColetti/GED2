package com.colettialves.www.GED.services;

import com.colettialves.www.GED.models.Pessoa;
import com.colettialves.www.GED.repositories.PessoaReporitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    private final PessoaReporitory pessoaReporitory;

    @Autowired
    public PessoaService(PessoaReporitory pessoaReporitory) {
        this.pessoaReporitory = pessoaReporitory;
    }
    public Pessoa salvarPessoa(Pessoa pessoa) {
        return pessoaReporitory.save(pessoa);
    }
}
