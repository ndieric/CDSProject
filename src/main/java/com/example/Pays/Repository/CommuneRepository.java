package com.example.Pays.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Pays.Entites.Commune;

public interface CommuneRepository extends JpaRepository<Commune,Integer> {
    
}
