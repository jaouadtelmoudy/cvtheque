package com.org.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="offres")
public class Offres {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name="intitulite")
	private String intitulite;
	@Column(name="description")
	private String description;
	@Column(name="dateCreation")
	private Date dateCreation;
	@Column(name="dateFin")
	private Date dateFin;	
	private String status;
	@ManyToOne
	private Organisme organisme;
    
	@ManyToOne
	private Candidats candidats;
	
	
	
	
	public Offres(String intitulite, String description, Date dateCreation, Date dateFin, String status,
			Organisme organisme, Candidats candidats) {
		super();
		this.intitulite = intitulite;
		this.description = description;
		this.dateCreation = dateCreation;
		this.dateFin = dateFin;
		this.status = status;
		this.organisme = organisme;
		this.candidats = candidats;
	}
	public Offres() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIntitulite() {
		return intitulite;
	}
	public void setIntitulite(String intitulite) {
		this.intitulite = intitulite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Organisme getOrganisme() {
		return organisme;
	}
	public void setOrganisme(Organisme organisme) {
		this.organisme = organisme;
	}
	public Candidats getCandidats() {
		return candidats;
	}
	public void setCandidats(Candidats candidats) {
		this.candidats = candidats;
	}
	
	
	
	
	

}
