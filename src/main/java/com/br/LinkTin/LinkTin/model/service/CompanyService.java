package com.br.LinkTin.LinkTin.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.br.LinkTin.LinkTin.model.domain.Company;
import com.br.LinkTin.LinkTin.model.repository.CompanyRepository;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    
    @Autowired
    private CompanyRepository companyRepository;
    
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
