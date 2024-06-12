package com.br.LinkTin.LinkTin.model.service;

import com.br.LinkTin.LinkTin.model.domain.JobOpportunity;
import com.br.LinkTin.LinkTin.model.repository.JobOpportunityRepository;
import com.br.LinkTin.LinkTin.model.repository.JobOpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobOpportunityService {
    
    @Autowired
    private JobOpportunityRepository jobOpportunityRepository;
    
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
