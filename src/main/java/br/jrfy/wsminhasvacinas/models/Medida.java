package br.jrfy.wsminhasvacinas.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_medida", schema="minhasvacinas")
public class Medida implements Serializable{
	
	private static final long serialVersionUID = 3230259280236870113L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ci_medida")
	private BigDecimal id;
	
	@Column(name="nr_valor")
	private Float valor;
	
	@Column(name="dt_criacao")
	private Date criacao;
	
	@ManyToOne
	@JoinColumn(name="cd_tpmedida")
	private TpMedida tpMedida;
	
	@ManyToOne
	@JoinColumn(name="cd_cartaovacina")
	private CartaoVacina cartaoVacina;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Date getCriacao() {
		return criacao;
	}

	public void setCriacao(Date criacao) {
		this.criacao = criacao;
	}

	public TpMedida getTpMedida() {
		return tpMedida;
	}

	public void setTpMedida(TpMedida tpMedida) {
		this.tpMedida = tpMedida;
	}

	public CartaoVacina getCartaoVacina() {
		return cartaoVacina;
	}

	public void setCartaoVacina(CartaoVacina cartaoVacina) {
		this.cartaoVacina = cartaoVacina;
	}
}
