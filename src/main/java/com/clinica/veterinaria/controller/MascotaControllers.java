/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinica.veterinaria.controller;

import com.clinica.veterinaria.model.Mascota;
import com.clinica.veterinaria.service.MascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaControllers {
     @Autowired
    MascotaService masSer;
    
    
    @GetMapping("/mascotas/traer")
    public List<Mascota> getMascotas(){
        List<Mascota> listaMascotas = masSer.getMascotas();
        
        return listaMascotas;
    }
    
    @GetMapping ("/mascota/traer/perro/caniche")
    public List<Mascota> getCanichePerro(){
    
    List<Mascota> listaCanichePerro=masSer.getCanichePerro();
    
    return listaCanichePerro;
    
}
    
    @PostMapping ("/mascota/crear")
    public String saveMascota(@RequestBody Mascota pet){
        
        masSer.saveMascota(pet);
        
        return "Mascota creado exitosamente mi rey";
    }
    
    @PutMapping("/mascota/editar")
    public Mascota editMascota(@RequestBody Mascota pet){
        
        masSer.editMascota(pet);
        
        return masSer.findMascota(pet.getIdMascota());
        
        
    }
    
    
    @DeleteMapping("/mascota/borrar/{id}")
    public String deleteMascota(@PathVariable Long id){
        
        masSer.deleteMascota(id);
        
        return "Borrado con exito MiRey";
    }
    

}
