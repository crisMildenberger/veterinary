/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinica.veterinaria.service;

import com.clinica.veterinaria.dto.DueñoDTO;
import com.clinica.veterinaria.model.Dueño;
import com.clinica.veterinaria.repository.IDueñoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DueñoService implements IDueñoService{

    @Autowired
    IDueñoRepository idr;
    
    @Override
    public List<Dueño> getDueños() {
    
        List<Dueño> listaDueños = idr.findAll();
        
        return listaDueños;
    
    }

    @Override
    public void saveDueño(Dueño due) {
        
    idr.save(due);
    }

    @Override
    public void editDueño(Dueño due) {
        
    idr.save(due);
    }

    @Override
    public void deleteDueño(Long id) {
     
    idr.deleteById(id);
    }

    @Override
    public Dueño findDueño(Long id) {
    
        Dueño due =    idr.findById(id).orElse(null);
    
        return due;
    }

    @Override
    public DueñoDTO getDTO(Long id) {
     
        DueñoDTO dueDTO= new DueñoDTO();
        Dueño due = this.findDueño(id);
        
        dueDTO.setNombre(due.getNombre());
        dueDTO.setApellido(due.getApellido());
        dueDTO.setNMascota(due.getPet().getNombre());
        dueDTO.setEspecie(due.getPet().getEspecie());
        dueDTO.setRaza(due.getPet().getRaza());
                
    
        return dueDTO;
    }

    
    
}
