package com.example.Pays.Entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


@Entity
public class Zone {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_zone;
    private String nom_zone;
}
