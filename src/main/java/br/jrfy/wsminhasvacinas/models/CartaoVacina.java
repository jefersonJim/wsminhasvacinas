package br.jrfy.wsminhasvacinas.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
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
@Table(name="tb_cartaovacina", schema="minhasvacinas")
public class CartaoVacina implements Serializable{

	private static final long serialVersionUID = 6992623016609824127L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ci_cartaovacina")
	private BigDecimal id;
	
	@Column(name="nm_pet")
	private String nomePet;
	
	@Column(name="ds_especie")
	private String especie;
	
	@Column(name="ds_raca")
	private String raca;
	
	@Column(name="dt_nascimento")
	private Date nascimento;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="ds_cor")
	private String cor;
	
	@ManyToOne
	@JoinColumn(name="cd_pessoa")
	private Pessoa pessoa;
	@Basic(optional=false)
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dt_criacao")
	private Date criacao;	
	
	@Column(name="path_image")
	private String pathImage;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getNomePet() {
		return nomePet;
	}

	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Date getCriacao() {
		return criacao;
	}

	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}

	public String getPathImage() {
		return pathImage;
	}

	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}
}
