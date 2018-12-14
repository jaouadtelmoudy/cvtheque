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
@Table(name="loisirs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loisirs {
 @Id
 @GeneratedValue(strategy= GenerationType.AUTO)
 private Long id;
 @Column(name="libelle")
 private String libelle;}
