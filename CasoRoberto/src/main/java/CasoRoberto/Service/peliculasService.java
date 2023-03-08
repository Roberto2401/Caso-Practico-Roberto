/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoRoberto.Service;

import CasoRoberto.Entity.peliculas;
import CasoRoberto.Repository.peliculasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Roberto
 */
@Service
public class peliculasService implements IpeliculasService{
    
    @Autowired
    private peliculasRepository peliculasRepository;

    @Override
    public List<peliculas> getAllpeliculas() {
   return (List<peliculas>)peliculasRepository.findAll();
    }

    @Override
    public peliculas getpeliculasById(long id) {
  return peliculasRepository.findById(id).orElse(null);
    }

    @Override
    public void savepeliculas(peliculas peliculas) {
      peliculasRepository.save(peliculas);
    }

    @Override
    public void delete(long id) {
    peliculasRepository.deleteById(id);
    }
    
}