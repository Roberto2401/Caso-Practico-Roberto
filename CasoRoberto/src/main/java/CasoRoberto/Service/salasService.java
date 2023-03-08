/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoRoberto.Service;

import CasoRoberto.Entity.salas;
import CasoRoberto.Repository.salasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roberto
 */
@Service
public class salasService implements IsalasService {
    
    @Autowired
    private salasRepository salasRepository;
    
    @Override
    public List<salas> listCountry() {
        return (List<salas>)salasRepository.findAll();
    }
   
}