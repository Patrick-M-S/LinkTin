package com.br.LinkTin.LinkTin.model.service;

import com.br.LinkTin.LinkTin.model.domain.*;
import com.br.LinkTin.LinkTin.model.repository.*;
import com.br.LinkTin.LinkTin.model.repository.JobOpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobOpportunityService {

    private final JobOpportunityRepository jobOpportunityRepository;
    private final CompanyRepository companyRepository;

    @Autowired
    public JobOpportunityService(JobOpportunityRepository jobOpportunityRepository, CompanyRepository companyRepository) {
        this.jobOpportunityRepository = jobOpportunityRepository;
        this.companyRepository = companyRepository;
    }

    public JobOpportunity createJobOpportunity(Long companyId, JobOpportunity jobOpportunity) {
        Company company = companyRepository.findById(companyId)
                .orElseThrow(() -> new IllegalArgumentException("Empresa não encontrada"));

        jobOpportunity.setCompany(company);

        return jobOpportunityRepository.save(jobOpportunity);
    }
    public List<JobOpportunity> findAll() {
        return jobOpportunityRepository.findAll();
    }
    
    public Optional<JobOpportunity> findById(Long id) {
        return jobOpportunityRepository.findById(id);
    }
    
    public JobOpportunity save(JobOpportunity jobOpportunity) {
        return jobOpportunityRepository.save(jobOpportunity);
    }
    
    public void deleteById(Long id) {
        jobOpportunityRepository.deleteById(id);
    }
}
