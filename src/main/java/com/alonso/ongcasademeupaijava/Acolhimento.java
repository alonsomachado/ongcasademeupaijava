/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alonso.ongcasademeupaijava;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alonso Machado
 */
@Entity
@Table(name = "acolhimento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Acolhimento.findAll", query = "SELECT a FROM Acolhimento a")
    , @NamedQuery(name = "Acolhimento.findByIdAcolhido", query = "SELECT a FROM Acolhimento a WHERE a.idAcolhido = :idAcolhido")
    , @NamedQuery(name = "Acolhimento.findByDataEntrada", query = "SELECT a FROM Acolhimento a WHERE a.dataEntrada = :dataEntrada")
    , @NamedQuery(name = "Acolhimento.findByDataSaida", query = "SELECT a FROM Acolhimento a WHERE a.dataSaida = :dataSaida")
    , @NamedQuery(name = "Acolhimento.findByMotivoInternacao", query = "SELECT a FROM Acolhimento a WHERE a.motivoInternacao = :motivoInternacao")
    , @NamedQuery(name = "Acolhimento.findByDrogasConsumidas", query = "SELECT a FROM Acolhimento a WHERE a.drogasConsumidas = :drogasConsumidas")
    , @NamedQuery(name = "Acolhimento.findByDoencaFamiliar", query = "SELECT a FROM Acolhimento a WHERE a.doencaFamiliar = :doencaFamiliar")
    , @NamedQuery(name = "Acolhimento.findByOutrasInformacoes", query = "SELECT a FROM Acolhimento a WHERE a.outrasInformacoes = :outrasInformacoes")
    , @NamedQuery(name = "Acolhimento.findByInternacaoAnterior", query = "SELECT a FROM Acolhimento a WHERE a.internacaoAnterior = :internacaoAnterior")
    , @NamedQuery(name = "Acolhimento.findByMotivoSaida", query = "SELECT a FROM Acolhimento a WHERE a.motivoSaida = :motivoSaida")
    , @NamedQuery(name = "Acolhimento.findByCpf", query = "SELECT a FROM Acolhimento a WHERE a.cpf = :cpf")
    , @NamedQuery(name = "Acolhimento.findByNome", query = "SELECT a FROM Acolhimento a WHERE a.nome = :nome")
    , @NamedQuery(name = "Acolhimento.findByDataNascimeto", query = "SELECT a FROM Acolhimento a WHERE a.dataNascimeto = :dataNascimeto")
    , @NamedQuery(name = "Acolhimento.findByRg", query = "SELECT a FROM Acolhimento a WHERE a.rg = :rg")
    , @NamedQuery(name = "Acolhimento.findByNaturalidade", query = "SELECT a FROM Acolhimento a WHERE a.naturalidade = :naturalidade")
    , @NamedQuery(name = "Acolhimento.findByNacionalidade", query = "SELECT a FROM Acolhimento a WHERE a.nacionalidade = :nacionalidade")
    , @NamedQuery(name = "Acolhimento.findByEscolaridade", query = "SELECT a FROM Acolhimento a WHERE a.escolaridade = :escolaridade")
    , @NamedQuery(name = "Acolhimento.findByProfissao", query = "SELECT a FROM Acolhimento a WHERE a.profissao = :profissao")
    , @NamedQuery(name = "Acolhimento.findByNomeMae", query = "SELECT a FROM Acolhimento a WHERE a.nomeMae = :nomeMae")
    , @NamedQuery(name = "Acolhimento.findByNomePai", query = "SELECT a FROM Acolhimento a WHERE a.nomePai = :nomePai")
    , @NamedQuery(name = "Acolhimento.findByNomeResponsavel", query = "SELECT a FROM Acolhimento a WHERE a.nomeResponsavel = :nomeResponsavel")
    , @NamedQuery(name = "Acolhimento.findByTelefoneResponsavel", query = "SELECT a FROM Acolhimento a WHERE a.telefoneResponsavel = :telefoneResponsavel")
    , @NamedQuery(name = "Acolhimento.findByRua", query = "SELECT a FROM Acolhimento a WHERE a.rua = :rua")
    , @NamedQuery(name = "Acolhimento.findByNumero", query = "SELECT a FROM Acolhimento a WHERE a.numero = :numero")
    , @NamedQuery(name = "Acolhimento.findByComplemento", query = "SELECT a FROM Acolhimento a WHERE a.complemento = :complemento")
    , @NamedQuery(name = "Acolhimento.findByBairro", query = "SELECT a FROM Acolhimento a WHERE a.bairro = :bairro")
    , @NamedQuery(name = "Acolhimento.findByCidade", query = "SELECT a FROM Acolhimento a WHERE a.cidade = :cidade")
    , @NamedQuery(name = "Acolhimento.findByEstado", query = "SELECT a FROM Acolhimento a WHERE a.estado = :estado")
    , @NamedQuery(name = "Acolhimento.findByCep", query = "SELECT a FROM Acolhimento a WHERE a.cep = :cep")})
public class Acolhimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAcolhido")
    private Integer idAcolhido;
    @Column(name = "dataEntrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrada;
    @Column(name = "dataSaida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataSaida;
    @Size(max = 200)
    @Column(name = "motivoInternacao")
    private String motivoInternacao;
    @Size(max = 200)
    @Column(name = "DrogasConsumidas")
    private String drogasConsumidas;
    @Size(max = 45)
    @Column(name = "DoencaFamiliar")
    private String doencaFamiliar;
    @Size(max = 45)
    @Column(name = "OutrasInformacoes")
    private String outrasInformacoes;
    @Size(max = 100)
    @Column(name = "internacaoAnterior")
    private String internacaoAnterior;
    @Size(max = 200)
    @Column(name = "motivoSaida")
    private String motivoSaida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cpf")
    private long cpf;
    @Size(max = 120)
    @Column(name = "Nome")
    private String nome;
    @Column(name = "DataNascimeto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataNascimeto;
    @Size(max = 20)
    @Column(name = "Rg")
    private String rg;
    @Size(max = 45)
    @Column(name = "Naturalidade")
    private String naturalidade;
    @Size(max = 45)
    @Column(name = "Nacionalidade")
    private String nacionalidade;
    @Size(max = 45)
    @Column(name = "Escolaridade")
    private String escolaridade;
    @Size(max = 45)
    @Column(name = "Profissao")
    private String profissao;
    @Size(max = 45)
    @Column(name = "NomeMae")
    private String nomeMae;
    @Size(max = 45)
    @Column(name = "NomePai")
    private String nomePai;
    @Size(max = 100)
    @Column(name = "nomeResponsavel")
    private String nomeResponsavel;
    @Column(name = "telefoneResponsavel")
    private Long telefoneResponsavel;
    @Size(max = 120)
    @Column(name = "Rua")
    private String rua;
    @Column(name = "Numero")
    private Integer numero;
    @Size(max = 45)
    @Column(name = "Complemento")
    private String complemento;
    @Size(max = 45)
    @Column(name = "Bairro")
    private String bairro;
    @Size(max = 90)
    @Column(name = "Cidade")
    private String cidade;
    @Size(max = 45)
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Cep")
    private Integer cep;

    public Acolhimento() {
    }

    public Acolhimento(Integer idAcolhido) {
        this.idAcolhido = idAcolhido;
    }

    public Acolhimento(Integer idAcolhido, long cpf) {
        this.idAcolhido = idAcolhido;
        this.cpf = cpf;
    }

    public Integer getIdAcolhido() {
        return idAcolhido;
    }

    public void setIdAcolhido(Integer idAcolhido) {
        this.idAcolhido = idAcolhido;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public String getDrogasConsumidas() {
        return drogasConsumidas;
    }

    public void setDrogasConsumidas(String drogasConsumidas) {
        this.drogasConsumidas = drogasConsumidas;
    }

    public String getDoencaFamiliar() {
        return doencaFamiliar;
    }

    public void setDoencaFamiliar(String doencaFamiliar) {
        this.doencaFamiliar = doencaFamiliar;
    }

    public String getOutrasInformacoes() {
        return outrasInformacoes;
    }

    public void setOutrasInformacoes(String outrasInformacoes) {
        this.outrasInformacoes = outrasInformacoes;
    }

    public String getInternacaoAnterior() {
        return internacaoAnterior;
    }

    public void setInternacaoAnterior(String internacaoAnterior) {
        this.internacaoAnterior = internacaoAnterior;
    }

    public String getMotivoSaida() {
        return motivoSaida;
    }

    public void setMotivoSaida(String motivoSaida) {
        this.motivoSaida = motivoSaida;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimeto() {
        return dataNascimeto;
    }

    public void setDataNascimeto(Date dataNascimeto) {
        this.dataNascimeto = dataNascimeto;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Long getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(Long telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcolhido != null ? idAcolhido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acolhimento)) {
            return false;
        }
        Acolhimento other = (Acolhimento) object;
        if ((this.idAcolhido == null && other.idAcolhido != null) || (this.idAcolhido != null && !this.idAcolhido.equals(other.idAcolhido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alonso.ongcasademeupaijava.Acolhimento[ idAcolhido=" + idAcolhido + " ]";
    }
    
}
