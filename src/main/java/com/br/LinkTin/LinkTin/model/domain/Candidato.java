package com.br.LinkTin.LinkTin.model.domain;

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
