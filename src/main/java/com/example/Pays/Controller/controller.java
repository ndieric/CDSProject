package com.example.Pays.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Pays.Dto.PatientPays;
import com.example.Pays.Dto.PaysCommune;
import com.example.Pays.Entites.Commune;
import com.example.Pays.Entites.Patient;
import com.example.Pays.Entites.Pays;
import com.example.Pays.Repository.CommuneRepository;
import com.example.Pays.Repository.PatientRepository;
import com.example.Pays.Repository.PaysRepository;
import com.example.Pays.Repository.ZoneRepository;

import io.swagger.annotations.Api;

@Api()
@RestController
public class controller {

    @Autowired
    CommuneRepository communeRepository;

    @Autowired
    PaysRepository paysRepository;

    @Autowired
    ZoneRepository zoneRepository;

    @Autowired
    PatientRepository patientRepository;

    @PostMapping("/patient")
    public Patient ajout(@RequestBody PatientPays coco){
        return patientRepository.save(coco.getPatient());
        
        
    }

    @GetMapping("/trouver/{id}")
    public Patient trouver(@PathVariable Integer id){
        return patientRepository.findById(id).get();
        

    }
    @PutMapping("/trouver/{id}/{nom_pays}/modifier")
    public Pays modifier(@PathVariable Integer id,@PathVariable String nom_pays){
        Pays modif = paysRepository.findById(id).get();
        modif.setNom_pays(nom_pays);
        return paysRepository.save(modif);
        
    }

    @PutMapping("/trouver/{id}/capitale/{capitale}/modifier")
    public Pays modifierCaoitale(@PathVariable Integer id,@PathVariable String capitale){
    Pays cap = paysRepository.findById(id).get();
    cap.setCapitale(capitale);
        return paysRepository.save(cap);
}

@PutMapping("/trouver/{id}/capitale/code/{code_pays}/modifier")
public Pays modifierCode(@PathVariable Integer id,@PathVariable Integer code_pays){
    Pays cod = paysRepository.findById(id).get();
    cod.setCode_pays(code_pays);
    return paysRepository.save(cod);
}
@DeleteMapping("/trouver/{id}/supprimer")
public void Supprimer(@PathVariable Integer id){
     paysRepository.deleteById(id);
}
@GetMapping("/tous")
public List<Pays> trouverTousPays(){
    return paysRepository.findAll();
}



    }
    

