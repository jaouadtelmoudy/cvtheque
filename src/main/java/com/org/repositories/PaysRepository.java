package com.org.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entities.Pays;

public interface PaysRepository extends JpaRepository<Pays, Long> {

}
