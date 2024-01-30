/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinica.veterinaria.controller;

import com.clinica.veterinaria.dto.DueñoDTO;
import com.clinica.veterinaria.model.Dueño;
import com.clinica.veterinaria.service.DueñoService;
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
public class DueñoControllers {
    
    @Autowired
    DueñoService dueSer;
    
    
    @GetMapping("/dueños/traer")
    public List<Dueño> getDueños(){
        List<Dueño> listaDueños = dueSer.getDueños();
        
        return listaDueños;
    }
    
    @GetMapping("/dueño/dto/{id}")
    public DueñoDTO getDTO(@PathVariable Long id){
        
       return dueSer.getDTO(id);
        
        
    }
    @PostMapping ("/dueño/crear")
    public String saveDueño(@RequestBody Dueño due){
        
        dueSer.saveDueño(due);
        
        return "Dueño creado exitosamente mi rey";
    }
    
    @PutMapping("/dueño/editar")
    public Dueño editDueño(@RequestBody Dueño due){
        
        dueSer.editDueño(due);
        
        return dueSer.findDueño(due.getIdDueno());
        
        
    }
    
    
    @DeleteMapping("/dueño/borrar/{id}")
    public String deleteDueño(@PathVariable Long id){
        
        dueSer.deleteDueño(id);
        
        return "Borrado con exito MiRey";
    }
    
}
