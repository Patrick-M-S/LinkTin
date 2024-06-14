package com.br.LinkTin.LinkTin.model.domain;

import java.util.List;

public class CompanyDTO {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String cnpj;
    private String address;
    private String token;
    private String picture;
    private List<JobOpportunityDTO> jobOpportunityList;

    public CompanyDTO(Long id, String email, String password, String name, String cnpj, String address, String token, String picture, List<JobOpportunityDTO> jobOpportunityList) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.cnpj = cnpj;
        this.address = address;
        this.token = token;
        this.picture = picture;
        this.jobOpportunityList = jobOpportunityList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public List<JobOpportunityDTO> getJobOpportunityList() {
        return jobOpportunityList;
    }

    public void setJobOpportunityList(List<JobOpportunityDTO> jobOpportunityList) {
        this.jobOpportunityList = jobOpportunityList;
    }
}


