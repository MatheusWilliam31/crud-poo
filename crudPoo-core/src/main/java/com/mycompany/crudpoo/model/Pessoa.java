package com.mycompany.crudpoo.model;

import com.mycompany.crudpoo.enums.EnumSexo;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 180, nullable = false)
    private String name;

    @Column(name = "cpf", length = 14, nullable = false, unique = true)
    private String cpf;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimeno", nullable = false)
    private Date dataNascimento;

    @Column(name = "telefone", length = 14, nullable = false)
    private String telefone;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    private EnumSexo sexo;

    @Column(name = "person_active")
    private Boolean pessoaAtiva;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public EnumSexo getSexo() {
        return sexo;
    }

    public void setSexo(EnumSexo sexo) {
        this.sexo = sexo;
    }

    public Boolean getPessoaAtiva() {
        return pessoaAtiva;
    }

    public void setPessoaAtiva(Boolean pessoaAtiva) {
        this.pessoaAtiva = pessoaAtiva;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.crudpoo.model.Pessoa[ id=" + id + " ]";
    }

}
