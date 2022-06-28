package com.example.Pays.Entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Patient {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_patient;
    private String nom_patient;
    private String prenom_patient;
    private int age;
    private TypeGenre genre;

    @OneToMany (targetEntity = Pays.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pp_fk",referencedColumnName = "id_patient")
    private List<Pays> pays;

    

   
}
