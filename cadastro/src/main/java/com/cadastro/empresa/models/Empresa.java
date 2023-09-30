
package com.cadastro.empresa.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "empresa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Empresa implements Serializable{

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    private List<Cnaes> cnaes_secundarios;
    private String uf;
    private Integer cep;
    @Id
    private String cnpj;
    private String pais;
    private String email;
    private String porte;
    private String bairro;
    private String numero;
    private String ddd_fax;
    private String municipio;
    private String logradouro;
    private Integer cnaeFiscal;
    private Integer codigoPais;
    private String complemento;
    private Integer codigoPorte;
    private String razaoSocial;
    private String nomeFantasia;
    private Integer capitalSocial;
    private String dddTelefone1;
    private String dddTelefone2;
    private boolean opcaoPeloMei;
    private String descricaoPorte;
    private Integer codigoMunicipio;
    private String naturezaJuridica;
    private String situacaoEspecial;
    private boolean opcaoPeloSimples;
    private Integer situacaoCadastral;
    private String dataOpcaoPeloMei;
    private String dataExclusaoDoMei;
    private String cnaeFiscalDescricao;
    private Integer codigoMunicipioIbge;
    private String dataInicioAtividade;
    private String dataSituacaoEspecial;
    private String dataOpcaoPeloSimples;
    private String dataSituacaoCadastral;
    private String nomeCidadeNoExterior;
    private Integer codigoNaturezaJuridica;
    private String dataExclusaoDoSimples;
    private Integer motivoSituacaoCadastral;
    private String enteFederativoResponsavel;
    private Integer identificadorMatrizFilial;
    private Integer qualificacaoDoResponsavel;
    private String descricaoSituacaoCadastral;
    private String descricaoTipoDeLogradouro;
    private String descricaoMotivoSituacaoCadastral;
    private String descricaoIdentificadorMatrizFilial;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Qsa> qsa;

}
