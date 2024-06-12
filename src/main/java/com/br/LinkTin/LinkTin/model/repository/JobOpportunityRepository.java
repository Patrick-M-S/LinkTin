package com.br.LinkTin.LinkTin.model.repository;

import com.br.LinkTin.LinkTin.model.domain.Company;
import com.br.LinkTin.LinkTin.model.domain.JobOpportunity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobOpportunityRepository extends JpaRepository<JobOpportunity, Long> {
}
