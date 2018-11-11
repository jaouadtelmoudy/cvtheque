package com.org.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="organisme")
public class Organisme {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="raisonSociale")
	private String raisonSociale;
	@Column(name="secteur")
	private String secteur;
	@Column(name="dateCreation")
	private Date dateCreation;
	
	@OneToMany
	private List<Offres> offres;
	

	
	public Organisme(String raisonSociale, String secteur, Date dateCreation, List<Offres> offres) {
		super();
		this.raisonSociale = raisonSociale;
		this.secteur = secteur;
		this.dateCreation = dateCreation;
		this.offres = offres;
	}

	public Organisme() {
		super();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public String getSecteur() {
		return secteur;
	}
	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public List<Offres> getOffres() {
		return offres;
	}

	public void setOffres(List<Offres> offres) {
		this.offres = offres;
	}
	
	
	
	
	

}
