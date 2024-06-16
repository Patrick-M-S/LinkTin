package com.br.LinkTin.LinkTin.model.controller;

import com.br.LinkTin.LinkTin.model.domain.Company;
import com.br.LinkTin.LinkTin.model.domain.JobOpportunity;
import com.br.LinkTin.LinkTin.model.domain.UserInfo;
import com.br.LinkTin.LinkTin.model.service.JobOpportunityService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/jobopportunitys")
@Tag(name = "Job Opportunity Controller", description = "Controladora relacionada a operações de " +
        "vagas de empresas")
public class JobOpportunityController {

    private final JobOpportunityService jobOpportunityService;

    @Autowired
    public JobOpportunityController(JobOpportunityService jobOpportunityService) {
        this.jobOpportunityService = jobOpportunityService;
    }

    @GetMapping
    @Operation(summary = "Lista todas as vagas", description = "Retorna uma lista de todas as vagas cadastradas.")
    public List<JobOpportunity> getAllJobOpportunitys() {
        return jobOpportunityService.findAll();
    }

    @PostMapping
    @Operation(summary = "Cadastra informações da vaga para uma empresa especificada"
            , description = "Cadastra informações da vaga para uma empresa especificada")
    public ResponseEntity<JobOpportunity> createJobOpportunity(@RequestParam Long companyId, @RequestBody JobOpportunity jobOpportunity) {
        JobOpportunity createdJobOpportunity = jobOpportunityService.createJobOpportunity(companyId, jobOpportunity);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdJobOpportunity);
    }
    @PutMapping("/{id}")
    @Operation(summary = "Atualiza informações da vaga especificada", description = "Atualiza informações da vaga especificada")
    public ResponseEntity<JobOpportunity> updateJobOpportunity(@PathVariable Long id, @RequestBody JobOpportunity jobOpportunity) {
        JobOpportunity updatedJobOpportunity = jobOpportunityService.updateJobOpportunity(id, jobOpportunity);
        if (updatedJobOpportunity != null) {
            return ResponseEntity.ok(updatedJobOpportunity);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "Deleta a vaga da empresa relacionado ao ID informado"
            , description = "Deleta os dados profissionais do usuário candidato relacionado ao ID informado")
    public void deleteJobOpportunity(@PathVariable Long id) {
        jobOpportunityService.deleteById(id);
    }
}
