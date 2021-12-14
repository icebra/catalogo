package com.ceg.catalogo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_TAG")
public class Tag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "titulo")
	private String titulo;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "categoria")
	private String categoria;

	@Column(name = "cor")
	private String cor;

	@Column(name = "moda")
	private String moda;

	@Column(name = "tamanho")
	private String tamanho;

	@Column(name = "quantidade")
	private String quantidade;

	@Column(name = "volume")
	private String volume;
}
