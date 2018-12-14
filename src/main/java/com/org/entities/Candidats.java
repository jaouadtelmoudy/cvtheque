package com.org.entities;

import java.util.Date;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Candidats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
	
	@OneToMany
	private List<Offres> offres;
}
