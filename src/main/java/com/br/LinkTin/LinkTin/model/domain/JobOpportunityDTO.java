package com.br.LinkTin.LinkTin.model.domain;

public class JobOpportunityDTO {
    private Long id;
    private String jobTitle;
    private String workMode;
    private String location;
    private Double salary;
    private String level;
    private String description;

    public JobOpportunityDTO(Long id, String jobTitle, String workMode, String location, Double salary, String level, String description) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.workMode = workMode;
        this.location = location;
        this.salary = salary;
        this.level = level;
        this.description = description;
    }

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

    // getters and setters
}


