package com.cadastro.empresa.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "qsa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Qsa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_cnpj", referencedColumnName = "cnpj")
    private Empresa empresa;
    private String pais;
    private String nomeSocio;
    private Integer codigoPais;
    private String faixaEtaria;
    private String cnpjCpfDoSocio;
    private String qualificacaoSocio;
    private Integer codigoFaixaEtaria;
    private String dataEntradaSociedade;
    private Integer identificadorDeSocio;
    private String cpfRepresentanteLegal;
    private String nomeRepresentanteLegal;
    private Integer codigoQualificacaoSocio;
    private String qualificacaoRepresentanteLegal;
    private String codigoQualificacaoRepresentanteLegal;

}

