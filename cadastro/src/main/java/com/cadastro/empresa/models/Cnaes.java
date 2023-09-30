package com.cadastro.empresa.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cnaes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cnaes {

    @Id
    private Integer codigo;
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "empresa_cnpj", referencedColumnName = "cnpj")
    private Empresa empresa;
}

