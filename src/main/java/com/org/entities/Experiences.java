package com.org.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="experiences")
public class Experiences {
	 @Id
	 @GeneratedValue(strategy= GenerationType.AUTO)
	 private Long id;
	 @Column(name="societe")
	 private String societe;
	 @Column(name="poste")
	 private String poste;
	 @Column(name="dateDebut")
	 private Date dateDebut;
	 @Column(name="dateFin")
	 private Date dateFin;
	public Experiences(String societe, String poste, Date dateDebut, Date dateFin) {
		super();
		this.societe = societe;
		this.poste = poste;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	public Experiences() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSociete() {
		return societe;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	 

}
