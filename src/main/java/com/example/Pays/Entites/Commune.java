package com.example.Pays.Entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Commune {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_commune;
    private String nom_commune;
    


    @OneToMany (targetEntity = Zone.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cz_fk",referencedColumnName = "id_commune")
    private List<Zone> zone;



    
}
