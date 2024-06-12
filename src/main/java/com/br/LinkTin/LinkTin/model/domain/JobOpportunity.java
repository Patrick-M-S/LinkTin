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

    @Override
    public String toString() {
        return "JobOpportunity{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", workMode='" + workMode + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", level='" + level + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobOpportunity that = (JobOpportunity) o;
        return Objects.equals(id, that.id) && Objects.equals(jobTitle, that.jobTitle) && Objects.equals(workMode, that.workMode) && Objects.equals(location, that.location) && Objects.equals(salary, that.salary) && Objects.equals(level, that.level) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, jobTitle, workMode, location, salary, level, description);
    }
}
