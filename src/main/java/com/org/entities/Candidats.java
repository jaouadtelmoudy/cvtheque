package com.org.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Candidats")
public class Candidats {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="dateNaissance")
	private Date dateNaissance;
	@Column(name="adresse")
	private String adresse;
	@Column(name="email")
	private String email;	
	@ManyToOne	
	private Pays pays;	
	@OneToMany	
	private List<Langues> langues;
	@OneToMany
	private List<Formations> formations;	
	@OneToMany
	private List<Loisirs> loisirs;
	@OneToMany
	private List<Experiences> experiences;
	

	public Candidats() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Pays getPays() {
		return pays;
	}
	public void setPays(Pays pays) {
		this.pays = pays;
	}
	public List<Langues> getLangues() {
		return langues;
	}
	public void setLangues(List<Langues> langues) {
		this.langues = langues;
	}
	public List<Formations> getFormations() {
		return formations;
	}
	public void setFormations(List<Formations> formations) {
		this.formations = formations;
	}
	public Candidats(String nom, String prenom, Date dateNaissance, String adresse, String email, Pays pays,
			List<Langues> langues, List<Formations> formations, List<Loisirs> loisirs) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.email = email;
		this.pays = pays;
		this.langues = langues;
		this.formations = formations;
		this.loisirs = loisirs;
	}
	public List<Loisirs> getLoisirs() {
		return loisirs;
	}
	public void setLoisirs(List<Loisirs> loisirs) {
		this.loisirs = loisirs;
	}
	public List<Experiences> getExperiences() {
		return experiences;
	}
	public void setExperiences(List<Experiences> experiences) {
		this.experiences = experiences;
	}
	
    

	

}
