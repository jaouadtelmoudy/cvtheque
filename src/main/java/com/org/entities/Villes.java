package com.org.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="villes")
public class Villes {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	@Column(name="libelle")
	private String libelle;	
	@ManyToOne
	private Pays pays;	
	public Villes(String libelle, Pays pays) {
		super();
		this.libelle = libelle;
		this.pays = pays;
	}
	public Villes() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}
	
	
	
	
	
}
