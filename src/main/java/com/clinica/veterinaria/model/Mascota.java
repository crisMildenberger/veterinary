/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinica.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Mascota {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private String color;
   
    public Mascota() {
    }

    public Mascota(Long idMascota, String nombre, String especie, String raza, String color) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
       
    }

   
    
    
}
