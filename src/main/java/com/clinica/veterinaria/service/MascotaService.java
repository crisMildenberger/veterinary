/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinica.veterinaria.service;

import com.clinica.veterinaria.model.Mascota;
import com.clinica.veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    IMascotaRepository imr;

   
    public List<Mascota> getMascotas() {
       
        List<Mascota> listaMascota= imr.findAll();
    
        return listaMascota;
    
    }

   
    public void saveMascota(Mascota pet) {
       imr.save(pet);
    }

   
    public void editMascota(Mascota pet) {
    imr.save(pet);
    }

  
    public void deleteMascota(Long id) {
        imr.deleteById(id);
    }

    
    public Mascota findMascota(Long id) {
      Mascota pet = imr.findById(id).orElse(null);
    
      return pet;
    }

    @Override
    public List<Mascota> getCanichePerro() {
       
     String dog= "Perro";
     String caniche= "Caniche";    
     
    List<Mascota> listaMascotas = this.getMascotas();
    List <Mascota> listaCaniche = new ArrayList();
    
    for(Mascota aux:listaMascotas){
        
        String especie = aux.getEspecie();
        String raza = aux.getRaza();
        
        if(especie.contains(dog)&& raza.contains(caniche)){
            listaCaniche.add(aux);
        }
        
    }
    
    return listaCaniche;
    
    
    }
    
    

  
    
    
    
}
