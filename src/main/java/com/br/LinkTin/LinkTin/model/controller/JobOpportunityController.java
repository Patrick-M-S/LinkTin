package com.br.LinkTin.LinkTin.model.controller;

import com.br.LinkTin.LinkTin.model.domain.JobOpportunity;
import com.br.LinkTin.LinkTin.model.domain.UserInfo;
import com.br.LinkTin.LinkTin.model.service.JobOpportunityService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/{id}")
    @Operation(summary = "Retorna vagas da empresa  especificado"
            , description = "Retorna vagas da empresa  especificado")
    public ResponseEntity<List<UserInfo> getUserInfoById(@PathVariable Long id) {
        UserInfo userInfo = userInfoService.getUserInfoById(id);
        if (userInfo != null) {
            return ResponseEntity.ok(userInfo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
