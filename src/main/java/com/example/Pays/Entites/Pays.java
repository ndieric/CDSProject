package com.example.Pays.Entites;

import java.util.List;

import javax.persistence.CascadeType;
//import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Pays {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_pays;
    private String nom_pays;
    private String capitale;
    private int code_pays;

    @OneToMany (targetEntity = Commune.class , cascade = CascadeType.ALL)
    @JoinColumn(name = "pc_fk",referencedColumnName = "id_pays")
    private List<Commune> commune;

   
    
}
