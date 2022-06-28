package com.example.Pays.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Pays.Entites.Pays;

public interface PaysRepository extends JpaRepository<Pays,Integer> {
   
  
}
