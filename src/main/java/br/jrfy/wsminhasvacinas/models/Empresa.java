package br.jrfy.wsminhasvacinas.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_empresa", schema="minhasvacinas")
public class Empresa implements Serializable{

	private static final long serialVersionUID = 3926724482996580656L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ci_empresa")
	private Integer id;
	
	@Column(name="nm_empresa")
	private String nome;
	
	@Column(name="nr_cnpj")
	private String cnpj;
	
	@Column(name="ds_logradouro")
	private String logradouro;
	
	@Column(name="nr_logradouro")
	private Integer numeroLogradouro;
	
	@Column(name="nr_cep")
	private String cep;
	
	@Basic(optional=false)
	@Column(name="dt_criacao", insertable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date criacao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public Integer getNumeroLogradouro() {
		return numeroLogradouro;
	}
	public void setNumeroLogradouro(Integer numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Date getCriacao() {
		return criacao;
	}
	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}
}
