package br.jrfy.wsminhasvacinas.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * 
 * @author jeferson.inacio
 *
 */
@Entity
@Table(schema="minhasvacinas", name="tb_vacina")
public class Vacina implements Serializable{
	private static final long serialVersionUID = 2272269682888025928L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ci_vacina")
	private Integer id;
	
	@Column(name="nm_vacina")
	private String nome;
	
	@Column(name="ds_vacina")
	private String descricao;
	
	@Column(name="ds_efeitoscolaterais")
	private String efeitosColaterais;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEfeitosColaterais() {
		return efeitosColaterais;
	}

	public void setEfeitosColaterais(String efeitosColaterais) {
		this.efeitosColaterais = efeitosColaterais;
	}
}
