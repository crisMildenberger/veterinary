/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.clinica.veterinaria.service;

import com.clinica.veterinaria.dto.DueñoDTO;
import com.clinica.veterinaria.model.Dueño;
import java.util.List;

/**
 *
 * @author crisj
 */
public interface IDueñoService {
    
    public List<Dueño> getDueños();
    
    public void saveDueño(Dueño due);
    
    public void editDueño(Dueño due);
    
    public void deleteDueño (Long id);
    
    public Dueño findDueño(Long id);
    
    public DueñoDTO getDTO(Long id);
    
}
