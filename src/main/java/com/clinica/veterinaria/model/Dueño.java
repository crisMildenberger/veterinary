/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinica.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Dueño {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long idDueno;

    private long dni;
    private String nombre;
    private String apellido;
    private long cel;
    
    @OneToOne
    @JoinColumn(name="id_mascota", referencedColumnName="idMascota")
    private Mascota pet;

    public Dueño() {
    }

    public Dueño(Long idDueno, long dni, String nombre, String apellido, long cel, Mascota pet) {
        this.idDueno = idDueno;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cel = cel;
        this.pet = pet;
    }

  
    
    
}
