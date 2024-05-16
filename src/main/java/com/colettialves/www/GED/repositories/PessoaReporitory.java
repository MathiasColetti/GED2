package com.colettialves.www.GED.repositories;

import com.colettialves.www.GED.models.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PessoaReporitory extends JpaRepository<Pessoa, Long> {
}
