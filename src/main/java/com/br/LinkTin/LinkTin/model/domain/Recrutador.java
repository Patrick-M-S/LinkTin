package com.br.LinkTin.LinkTin.model.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_recrutador")
public class Recrutador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String empresa;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getEmpresa() { return empresa; }

    public void setEmpresa(String empresa) { this.empresa = empresa; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recrutador that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getNome(), that.getNome()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getEmpresa(), that.getEmpresa());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getEmail(), getEmpresa());
    }

    @Override
    public String toString() {
        return "Recrutador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}
