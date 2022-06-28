package com.example.Pays.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Pays.Entites.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
    
}
//select p.id_patient,p.nom_patient,p.prenom_patient,p.age,p.genre,py.nom_pays,c.nom_commune,z.nom_zone from patient p,pays py,commune c join zone z
