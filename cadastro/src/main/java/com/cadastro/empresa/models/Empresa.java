
package com.cadastro.empresa.models;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "empresa")
public class Empresa implements Serializable{

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Cnaes> cnaes_secundarios = new ArrayList<Cnaes>();
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
    private Integer cnae_fiscal;
    private Integer codigo_pais;
    private String complemento;
    private Integer codigo_porte;
    private String razaoSocial;
    private String nome_fantasia;
    private Integer capital_social;
    private String ddd_telefone_1;
    private String ddd_telefone_2;
    private boolean opcao_pelo_mei;
    private String descricao_porte;
    private Integer codigo_municipio;
    private String natureza_juridica;
    private String situacao_especial;
    private boolean opcao_pelo_simples;
    private Integer situacao_cadastral;
    private String data_opcao_pelo_mei;
    private String data_exclusao_do_mei;
    private String cnae_fiscal_descricao;
    private Integer codigo_municipio_ibge;
    private String data_inicio_atividade;
    private String data_situacao_especial;
    private String data_opcao_pelo_simples;
    private String data_situacao_cadastral;
    private String nome_cidade_no_exterior;
    private Integer codigo_natureza_juridica;
    private String data_exclusao_do_simples;
    private Integer motivo_situacao_cadastral;
    private String ente_federativo_responsavel;
    private Integer identificador_matriz_filial;
    private Integer qualificacao_do_responsavel;
    private String descricao_situacao_cadastral;
    private String descricao_tipo_de_logradouro;
    private String descricao_motivo_situacao_cadastral;
    private String descricao_identificador_matriz_filial;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Qsa> qsa = new ArrayList<Qsa>();

    public List<Qsa> getQsa() {
        return qsa;
    }

    public void setQsa(List<Qsa> qsa) {
        this.qsa = qsa;
    }

    public List<Cnaes> getCnaes_secundarios() {
        return cnaes_secundarios;
    }

    public void setCnaes_secundarios(List<Cnaes> cnaes_secundarios) {
        this.cnaes_secundarios = cnaes_secundarios;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd_fax() {
        return ddd_fax;
    }

    public void setDdd_fax(String ddd_fax) {
        this.ddd_fax = ddd_fax;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getCnae_fiscal() {
        return cnae_fiscal;
    }

    public void setCnae_fiscal(Integer cnae_fiscal) {
        this.cnae_fiscal = cnae_fiscal;
    }

    public Integer getCodigo_pais() {
        return codigo_pais;
    }

    public void setCodigo_pais(Integer codigo_pais) {
        this.codigo_pais = codigo_pais;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCodigo_porte() {
        return codigo_porte;
    }

    public void setCodigo_porte(Integer codigo_porte) {
        this.codigo_porte = codigo_porte;
    }

    public String getRazao_social() {
        return razaoSocial;
    }

    public void setRazao_social(String razao_social) {
        this.razaoSocial = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public Integer getCapital_social() {
        return capital_social;
    }

    public void setCapital_social(Integer capital_social) {
        this.capital_social = capital_social;
    }

    public String getDdd_telefone_1() {
        return ddd_telefone_1;
    }

    public void setDdd_telefone_1(String ddd_telefone_1) {
        this.ddd_telefone_1 = ddd_telefone_1;
    }

    public String getDdd_telefone_2() {
        return ddd_telefone_2;
    }

    public void setDdd_telefone_2(String ddd_telefone_2) {
        this.ddd_telefone_2 = ddd_telefone_2;
    }

    public boolean isOpcao_pelo_mei() {
        return opcao_pelo_mei;
    }

    public void setOpcao_pelo_mei(boolean opcao_pelo_mei) {
        this.opcao_pelo_mei = opcao_pelo_mei;
    }

    public String getDescricao_porte() {
        return descricao_porte;
    }

    public void setDescricao_porte(String descricao_porte) {
        this.descricao_porte = descricao_porte;
    }

    public Integer getCodigo_municipio() {
        return codigo_municipio;
    }

    public void setCodigo_municipio(Integer codigo_municipio) {
        this.codigo_municipio = codigo_municipio;
    }

    public String getNatureza_juridica() {
        return natureza_juridica;
    }

    public void setNatureza_juridica(String natureza_juridica) {
        this.natureza_juridica = natureza_juridica;
    }

    public String getSituacao_especial() {
        return situacao_especial;
    }

    public void setSituacao_especial(String situacao_especial) {
        this.situacao_especial = situacao_especial;
    }

    public boolean isOpcao_pelo_simples() {
        return opcao_pelo_simples;
    }

    public void setOpcao_pelo_simples(boolean opcao_pelo_simples) {
        this.opcao_pelo_simples = opcao_pelo_simples;
    }

    public Integer getSituacao_cadastral() {
        return situacao_cadastral;
    }

    public void setSituacao_cadastral(Integer situacao_cadastral) {
        this.situacao_cadastral = situacao_cadastral;
    }

    public String getData_opcao_pelo_mei() {
        return data_opcao_pelo_mei;
    }

    public void setData_opcao_pelo_mei(String data_opcao_pelo_mei) {
        this.data_opcao_pelo_mei = data_opcao_pelo_mei;
    }

    public String getData_exclusao_do_mei() {
        return data_exclusao_do_mei;
    }

    public void setData_exclusao_do_mei(String data_exclusao_do_mei) {
        this.data_exclusao_do_mei = data_exclusao_do_mei;
    }

    public String getCnae_fiscal_descricao() {
        return cnae_fiscal_descricao;
    }

    public void setCnae_fiscal_descricao(String cnae_fiscal_descricao) {
        this.cnae_fiscal_descricao = cnae_fiscal_descricao;
    }

    public Integer getCodigo_municipio_ibge() {
        return codigo_municipio_ibge;
    }

    public void setCodigo_municipio_ibge(Integer codigo_municipio_ibge) {
        this.codigo_municipio_ibge = codigo_municipio_ibge;
    }

    public String getData_inicio_atividade() {
        return data_inicio_atividade;
    }

    public void setData_inicio_atividade(String data_inicio_atividade) {
        this.data_inicio_atividade = data_inicio_atividade;
    }

    public String getData_situacao_especial() {
        return data_situacao_especial;
    }

    public void setData_situacao_especial(String data_situacao_especial) {
        this.data_situacao_especial = data_situacao_especial;
    }

    public String getData_opcao_pelo_simples() {
        return data_opcao_pelo_simples;
    }

    public void setData_opcao_pelo_simples(String data_opcao_pelo_simples) {
        this.data_opcao_pelo_simples = data_opcao_pelo_simples;
    }

    public String getData_situacao_cadastral() {
        return data_situacao_cadastral;
    }

    public void setData_situacao_cadastral(String data_situacao_cadastral) {
        this.data_situacao_cadastral = data_situacao_cadastral;
    }

    public String getNome_cidade_no_exterior() {
        return nome_cidade_no_exterior;
    }

    public void setNome_cidade_no_exterior(String nome_cidade_no_exterior) {
        this.nome_cidade_no_exterior = nome_cidade_no_exterior;
    }

    public Integer getCodigo_natureza_juridica() {
        return codigo_natureza_juridica;
    }

    public void setCodigo_natureza_juridica(Integer codigo_natureza_juridica) {
        this.codigo_natureza_juridica = codigo_natureza_juridica;
    }

    public String getData_exclusao_do_simples() {
        return data_exclusao_do_simples;
    }

    public void setData_exclusao_do_simples(String data_exclusao_do_simples) {
        this.data_exclusao_do_simples = data_exclusao_do_simples;
    }

    public Integer getMotivo_situacao_cadastral() {
        return motivo_situacao_cadastral;
    }

    public void setMotivo_situacao_cadastral(Integer motivo_situacao_cadastral) {
        this.motivo_situacao_cadastral = motivo_situacao_cadastral;
    }

    public String getEnte_federativo_responsavel() {
        return ente_federativo_responsavel;
    }

    public void setEnte_federativo_responsavel(String ente_federativo_responsavel) {
        this.ente_federativo_responsavel = ente_federativo_responsavel;
    }

    public Integer getIdentificador_matriz_filial() {
        return identificador_matriz_filial;
    }

    public void setIdentificador_matriz_filial(Integer identificador_matriz_filial) {
        this.identificador_matriz_filial = identificador_matriz_filial;
    }

    public Integer getQualificacao_do_responsavel() {
        return qualificacao_do_responsavel;
    }

    public void setQualificacao_do_responsavel(Integer qualificacao_do_responsavel) {
        this.qualificacao_do_responsavel = qualificacao_do_responsavel;
    }

    public String getDescricao_situacao_cadastral() {
        return descricao_situacao_cadastral;
    }

    public void setDescricao_situacao_cadastral(String descricao_situacao_cadastral) {
        this.descricao_situacao_cadastral = descricao_situacao_cadastral;
    }

    public String getDescricao_tipo_de_logradouro() {
        return descricao_tipo_de_logradouro;
    }

    public void setDescricao_tipo_de_logradouro(String descricao_tipo_de_logradouro) {
        this.descricao_tipo_de_logradouro = descricao_tipo_de_logradouro;
    }

    public String getDescricao_motivo_situacao_cadastral() {
        return descricao_motivo_situacao_cadastral;
    }

    public void setDescricao_motivo_situacao_cadastral(String descricao_motivo_situacao_cadastral) {
        this.descricao_motivo_situacao_cadastral = descricao_motivo_situacao_cadastral;
    }

    public String getDescricao_identificador_matriz_filial() {
        return descricao_identificador_matriz_filial;
    }

    public void setDescricao_identificador_matriz_filial(String descricao_identificador_matriz_filial) {
        this.descricao_identificador_matriz_filial = descricao_identificador_matriz_filial;
    }

}
