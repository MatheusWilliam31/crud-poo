package com.mycompany.crudpoo.model;

import com.mycompany.crudpoo.enums.EnumTipoConta;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "conta")
public class Conta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    private Double valor;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_lancamento", nullable = false)
    private Date dataLancamento;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_pagamento", nullable = false)
    private Date dataPagamento;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_vencimento", nullable = false)
    private Date dataVencimento;
    
    @Column(name = "descricao", nullable = false, length = 100)
    private String descricao;
    
    @ManyToOne
    @Column(name = "person_id")
    private Pessoa person;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_conta", nullable = false)
    private EnumTipoConta tipoConta;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pessoa getPerson() {
        return person;
    }

    public void setPerson(Pessoa person) {
        this.person = person;
    }

    public EnumTipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(EnumTipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Conta)) {
            return false;
        }
        Conta other = (Conta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.crudpoo.model.Conta[ id=" + id + " ]";
    }
    
}
