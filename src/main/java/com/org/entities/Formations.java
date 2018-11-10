package com.org.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="formations")
public class Formations {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	@Column(name="diplome")
	private String diplome;
	@Column(name="etablissement")
	private String etablissement;
	@Column(name="anneeScolaire")
	private int anneeScolaire;
	@Column(name="mention")
	private String mention;
	public Formations(String diplome, String etablissement, int anneeScolaire, String mention) {
		super();
		this.diplome = diplome;
		this.etablissement = etablissement;
		this.anneeScolaire = anneeScolaire;
		this.mention = mention;
	}
	public Formations() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	public int getAnneeScolaire() {
		return anneeScolaire;
	}
	public void setAnneeScolaire(int anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}
	public String getMention() {
		return mention;
	}
	public void setMention(String mention) {
		this.mention = mention;
	}
	
	
	

}
