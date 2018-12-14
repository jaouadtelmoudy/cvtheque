package com.org.entities;

import java.util.Date;

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
@Table(name="experiences")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
