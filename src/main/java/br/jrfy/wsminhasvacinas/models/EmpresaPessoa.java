package br.jrfy.wsminhasvacinas.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_empresa_pessoa", schema="minhasvacinas")
public class EmpresaPessoa implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5145127456545211876L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ci_empresa_pessoa")
	private BigDecimal id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cd_empresa")
	private Empresa empresa;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cd_pessoa")
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name="cd_nivel")
	private Nivel nivel;
	
	@Basic(optional=false)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_criacao", insertable=false, updatable=false)
	private Date criacao;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public Date getCriacao() {
		return criacao;
	}

	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}
}
