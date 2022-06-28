package com.example.Pays.Dto;

import com.example.Pays.Entites.Commune;
import com.example.Pays.Entites.Zone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CommuneZone {
    private Commune commune;
    private Zone zone;
    
}
