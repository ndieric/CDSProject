package com.example.Pays.Dto;

import com.example.Pays.Entites.Commune;
import com.example.Pays.Entites.Pays;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaysCommune {
    private Pays pays;
    private Commune commune;



    
    
}
