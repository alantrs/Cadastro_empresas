package com.cadastro.empresa.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "qsa")
public class Qsa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_cnpj", referencedColumnName = "cnpj")
    @JsonBackReference
    private Empresa empresa;
    private String pais;
    private String nome_socio;
    private Integer codigo_pais;
    private String faixa_etaria;
    private String cnpj_cpf_do_socio;
    private String qualificacao_socio;
    private Integer codigo_faixa_etaria;
    private String data_entrada_sociedade;
    private Integer identificador_de_socio;
    private String cpf_representante_legal;
    private String nome_representante_legal;
    private Integer codigo_qualificacao_socio;
    private String qualificacao_representante_legal;
    private String codigo_qualificacao_representante_legal;

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Integer getIdentificador_de_socio() {
        return identificador_de_socio;
    }


    public void setIdentificador_de_socio(Integer identificador_de_socio) {
        this.identificador_de_socio = identificador_de_socio;
    }

    public String getNome_socio() {
        return nome_socio;
    }

    public void setNome_socio(String nome_socio) {
        this.nome_socio = nome_socio;
    }

    public String getCnpj_cpf_do_socio() {
        return cnpj_cpf_do_socio;
    }

    public void setCnpj_cpf_do_socio(String cnpj_cpf_do_socio) {
        this.cnpj_cpf_do_socio = cnpj_cpf_do_socio;
    }

    public Integer getCodigo_qualificacao_socio() {
        return codigo_qualificacao_socio;
    }

    public void setCodigo_qualificacao_socio(Integer codigo_qualificacao_socio) {
        this.codigo_qualificacao_socio = codigo_qualificacao_socio;
    }

    public String getData_entrada_sociedade() {
        return data_entrada_sociedade;
    }

    public void setData_entrada_sociedade(String data_entrada_sociedade) {
        this.data_entrada_sociedade = data_entrada_sociedade;
    }

    public String getCpf_representante_legal() {
        return cpf_representante_legal;
    }

    public void setCpf_representante_legal(String cpf_representante_legal) {
        this.cpf_representante_legal = cpf_representante_legal;
    }

    public String getNome_representante_legal() {
        return nome_representante_legal;
    }

    public void setNome_representante_legal(String nome_representante_legal) {
        this.nome_representante_legal = nome_representante_legal;
    }

    public String getCodigo_qualificacao_representante_legal() {
        return codigo_qualificacao_representante_legal;
    }

    public void setCodigo_qualificacao_representante_legal(String codigo_qualificacao_representante_legal) {
        this.codigo_qualificacao_representante_legal = codigo_qualificacao_representante_legal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public Integer getCodigo_pais() {
        return codigo_pais;
    }

    public void setCodigo_pais(Integer codigo_pais) {
        this.codigo_pais = codigo_pais;
    }

    public String getFaixa_etaria() {
        return faixa_etaria;
    }

    public void setFaixa_etaria(String faixa_etaria) {
        this.faixa_etaria = faixa_etaria;
    }

    public String getQualificacao_socio() {
        return qualificacao_socio;
    }

    public void setQualificacao_socio(String qualificacao_socio) {
        this.qualificacao_socio = qualificacao_socio;
    }

    public Integer getCodigo_faixa_etaria() {
        return codigo_faixa_etaria;
    }

    public void setCodigo_faixa_etaria(Integer codigo_faixa_etaria) {
        this.codigo_faixa_etaria = codigo_faixa_etaria;
    }

    public String getQualificacao_representante_legal() {
        return qualificacao_representante_legal;
    }

    public void setQualificacao_representante_legal(String qualificacao_representante_legal) {
        this.qualificacao_representante_legal = qualificacao_representante_legal;
    }
}

