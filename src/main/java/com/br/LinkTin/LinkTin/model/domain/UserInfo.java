package com.br.LinkTin.LinkTin.model.domain;

import jakarta.persistence.*;

import java.sql.Clob;
import java.util.Objects;

@Entity
@Table(name = "userInfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skills;
    private String curriculum;
    private String level;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(id, userInfo.id) && Objects.equals(skills, userInfo.skills) && Objects.equals(curriculum, userInfo.curriculum) && Objects.equals(level, userInfo.level) && Objects.equals(user, userInfo.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, skills, curriculum, level, user);
    }
}
