package com.br.LinkTin.LinkTin.model.repository;

import com.br.LinkTin.LinkTin.model.domain.Candidato;
import com.br.LinkTin.LinkTin.model.domain.CandidatoDados;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoDadosRepositorio extends JpaRepository<CandidatoDados, Long> {
}
