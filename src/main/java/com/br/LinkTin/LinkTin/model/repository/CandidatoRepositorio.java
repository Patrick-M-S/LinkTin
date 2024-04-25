package com.br.LinkTin.LinkTin.model.repository;

import com.br.LinkTin.LinkTin.model.domain.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatoRepositorio extends JpaRepository<Candidato, Long> {
}
