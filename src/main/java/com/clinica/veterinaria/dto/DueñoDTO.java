/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinica.veterinaria.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DueñoDTO {
    
    private String nombre;
    private String apellido;
    private String nMascota;
    private String especie;
    private String raza;

    public DueñoDTO() {
    }

    public DueñoDTO(String nombre, String apellido, String nMascota, String especie, String raza) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nMascota = nMascota;
        this.especie = especie;
        this.raza = raza;
    }
    
    
    
    
}
