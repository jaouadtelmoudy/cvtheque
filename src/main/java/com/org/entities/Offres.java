package com.org.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="offres")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
