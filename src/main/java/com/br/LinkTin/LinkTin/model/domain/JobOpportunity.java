package com.br.LinkTin.LinkTin.model.domain;

import java.util.Date;
import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "jobOpportunity")
    public class JobOpportunity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String jobTitle;
        private String workMode;
        private String location;
        private Double salary;
        private String level;
        private String description;
        @ManyToOne
        @JoinColumn(name = "company_id")
        private Company company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getWorkMode() {
        return workMode;
    }

    public void setWorkMode(String workMode) {
        this.workMode = workMode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
