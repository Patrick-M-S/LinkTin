package com.br.LinkTin.LinkTin.model.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.br.LinkTin.LinkTin.model.domain.Company;
import com.br.LinkTin.LinkTin.model.service.CompanyService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/companys")
@Tag(name = "Company Controller", description = "Controladora relacionada a operações das empresas")
public class CompanyController {
    
    @Autowired
    private CompanyService companyService;
    
    @GetMapping
    @Operation(summary = "Lista todas empresas", description = "Retorna uma lista de todas empresas.")
    public List<Company> getAllCompanyes() {
        return companyService.findAll();
    }
    
    @GetMapping("/{id}")
    @Operation(summary = "Retorna a empresa associada ao ID informado", description = "Retorna a empresa associada ao ID informado")
    public Optional<Company> getCompanyById(@PathVariable Long id) {
        return companyService.findById(id);
    }
    
    @PostMapping
    @Operation(summary = "Cadastra uma nova empresa", description = "Cadastra uma nova empresa")
    public Company createCompany(@RequestBody Company company) {
        return companyService.save(company);
    }
    
    @PutMapping("/{id}")
    @Operation(summary = "Atualiza dados da empresa associada ao ID informado", description = "Atualiza dados da empresa associada ao ID informado")
    public Company updateCompany(@PathVariable Long id, @RequestBody Company company) {
        company.setId(id);
        return companyService.save(company);
    }
    
    @DeleteMapping("/{id}")
    @Operation(summary = "Deleta a empresa associada ao ID informado", description = "Deleta a empresa associada ao ID informado")
    public void deleteCompany(@PathVariable Long id) {
        companyService.deleteById(id);
    }
}
