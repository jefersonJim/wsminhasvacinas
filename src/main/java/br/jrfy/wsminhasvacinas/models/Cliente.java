package br.jrfy.wsminhasvacinas.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cliente", schema="minhasvacinas")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 4207857219853408041L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ci_cliente")
	private Integer id;
	
	@Column(name="nm_cliente")
	private String nome;
	
	@Column(name="nr_cpf")
	private String cpf;
	
	@Column(name="nr_telefone")
	private String telefone;
	
	@Column(name="nr_celular")
	private String celular;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
