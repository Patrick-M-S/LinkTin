package com.br.LinkTin.LinkTin.model.domain;

import java.sql.Timestamp;

public class UserWithUserInfoDTO {
    private Long userId;
    private String name;
    private String email;
    private String password;
    private String cpf;
    private String address;
    private Timestamp birthDate;
    private char gender;
    private Long userInfoId;
    private String skills;
    private String curriculum;
    private String level;
    private String picture;

    // Getters e setters
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public UserWithUserInfoDTO(Long userId, String name, String email, String password, String cpf, String address, Timestamp birthDate, char gender, Long userInfoId, String skills, String curriculum, String level, String picture) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.address = address;
        this.birthDate = birthDate;
        this.gender = gender;
        this.userInfoId = userInfoId;
        this.skills = skills;
        this.curriculum = curriculum;
        this.level = level;
        this.picture = picture;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
