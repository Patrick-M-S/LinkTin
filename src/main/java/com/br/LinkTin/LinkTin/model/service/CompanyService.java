package com.br.LinkTin.LinkTin.model.service;

import com.br.LinkTin.LinkTin.model.domain.CompanyDTO;
import com.br.LinkTin.LinkTin.model.domain.JobOpportunity;
import com.br.LinkTin.LinkTin.model.domain.JobOpportunityDTO;
import com.br.LinkTin.LinkTin.model.repository.JobOpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.LinkTin.LinkTin.model.domain.Company;
import com.br.LinkTin.LinkTin.model.repository.CompanyRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private JobOpportunityRepository jobOpportunityRepository;

    public List<CompanyDTO> findAllCompaniesWithJobs() {
        List<CompanyDTO> result = new ArrayList<>();

        // Buscar todas as empresas
        List<Company> companies = companyRepository.findAll();

        for (Company company : companies) {
            // Para cada empresa, buscar as oportunidades de emprego correspondentes
            List<JobOpportunity> jobOpportunities = jobOpportunityRepository.findByCompanyId(company.getId());

            // Converter JobOpportunity para JobOpportunityDTO
            List<JobOpportunityDTO> jobOpportunityDTOs = jobOpportunities.stream()
                    .map(job -> new JobOpportunityDTO(job.getId(), job.getJobTitle(), job.getWorkMode(), job.getLocation(), job.getSalary(), job.getLevel(), job.getDescription()))
                    .collect(Collectors.toList());

            // Adicionar ao resultado
            result.add(new CompanyDTO(company.getId(), company.getEmail(), company.getPassword(), company.getName(), company.getCnpj(), company.getAddress(), company.getToken(), company.getPicture(), jobOpportunityDTOs));
        }

        return result;
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }
    
    public Optional<Company> findById(Long id) {
        return companyRepository.findById(id);
    }
    
    public Company save(Company company) {
        return companyRepository.save(company);
    }
    
    public void deleteById(Long id) {
        companyRepository.deleteById(id);
    }
}
