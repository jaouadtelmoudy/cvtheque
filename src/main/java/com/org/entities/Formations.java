package com.org.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="formations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
