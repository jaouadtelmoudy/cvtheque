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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="organisme")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
	
}
