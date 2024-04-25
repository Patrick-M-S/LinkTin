package com.br.LinkTin.LinkTin.model.domain;

import java.util.Date;
import java.util.Objects;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_candidato")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Date dataNascimento;
    private char genero;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "candidato_dados_id")
    private CandidatoDados candidatoDados;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public CandidatoDados getCandidatoDados() {
        return candidatoDados;
    }

    public void setCandidatoDados(CandidatoDados candidatoDados) {
        this.candidatoDados = candidatoDados;
    }
    @Override
    public String toString() {
        return "Candidato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidato candidato)) return false;
        return Objects.equals(getId(), candidato.getId()) && Objects.equals(getNome(), candidato.getNome()) && Objects.equals(getEmail(), candidato.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getEmail());
    }

}
