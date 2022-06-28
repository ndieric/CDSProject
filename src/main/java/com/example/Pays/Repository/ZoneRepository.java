package com.example.Pays.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Pays.Entites.Zone;

public interface ZoneRepository extends JpaRepository<Zone,Integer> {
    
}
