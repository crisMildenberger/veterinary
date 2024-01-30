/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clinica.veterinaria.service;

import com.clinica.veterinaria.model.Mascota;
import java.util.List;

/**
 *
 * @author crisj
 */
public interface IMascotaService {
    
    public List<Mascota> getMascotas();
    
    public void saveMascota(Mascota pet);
    
    public void editMascota(Mascota pet);
    
    public void deleteMascota (Long id);
    
    public Mascota findMascota(Long id);
    
    public List<Mascota> getCanichePerro();
    
}
