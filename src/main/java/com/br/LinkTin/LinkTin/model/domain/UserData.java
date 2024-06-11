package com.br.LinkTin.LinkTin.model.domain;

import jakarta.persistence.*;

import java.sql.Clob;

@Entity
@Table(name = "tb_candidatodados")
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String habilidades;
    private boolean temEmprego;
    /*
    Importante: nesta versão o curriculo será armazenado em base64 em um banco SQL.
    Como alternativa podemos trabahar com um banco
    noSQl ou ainda subir estes
    arquivos em um servidor e a propriedade abaixo seria somente a URL com o tipo String
    */
    private Clob curriculo;
    private String especificacoesTrabalho;

    @OneToOne
    @JoinColumn(name = "candidato_dados_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public boolean isTemEmprego() {
        return temEmprego;
    }

    public void setTemEmprego(boolean temEmprego) {
        this.temEmprego = temEmprego;
    }

    public Clob getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(Clob curriculo) {
        this.curriculo = curriculo;
    }

    public String getEspecificacoesTrabalho() {
        return especificacoesTrabalho;
    }

    public void setEspecificacoesTrabalho(String especificacoesTrabalho) {
        this.especificacoesTrabalho = especificacoesTrabalho;
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    @Override
    public String toString() {
        return "UserData{" +
                "id=" + id +
                ", habilidades='" + habilidades + '\'' +
                ", temEmprego=" + temEmprego +
                ", curriculo=" + curriculo +
                ", especificacoesTrabalho='" + especificacoesTrabalho + '\'' +
                '}';
    }
}
