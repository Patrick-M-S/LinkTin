package com.br.LinkTin.LinkTin.model.service;

import com.br.LinkTin.LinkTin.model.domain.*;
import com.br.LinkTin.LinkTin.model.repository.*;
import com.br.LinkTin.LinkTin.model.repository.JobOpportunityRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
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

    @Transactional
    public JobOpportunity save(JobOpportunity jobOpportunity) {
        return jobOpportunityRepository.save(jobOpportunity);
    }

    public JobOpportunity updateJobOpportunity(Long id, JobOpportunity newJobOpportunity) {
        JobOpportunity existingJobOpportunity = jobOpportunityRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("JobOpportunity não encontrada"));

        // Atualizar os detalhes da JobOpportunity com os novos detalhes
        existingJobOpportunity.setJobTitle(newJobOpportunity.getJobTitle());
        existingJobOpportunity.setWorkMode(newJobOpportunity.getWorkMode());
        existingJobOpportunity.setLocation(newJobOpportunity.getLocation());
        existingJobOpportunity.setSalary(newJobOpportunity.getSalary());
        existingJobOpportunity.setLevel(newJobOpportunity.getLevel());
        existingJobOpportunity.setDescription(newJobOpportunity.getDescription());

        // Atualizar a empresa associada
        if (newJobOpportunity.getCompany() != null && newJobOpportunity.getCompany().getId() != null) {
            Company company = companyRepository.findById(newJobOpportunity.getCompany().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Company não encontrada"));
            existingJobOpportunity.setCompany(company);
        }

        // Salvar e retornar a JobOpportunity atualizada
        return jobOpportunityRepository.save(existingJobOpportunity);
    }
    
    public void deleteById(Long id) {
        jobOpportunityRepository.deleteById(id);
    }
}
