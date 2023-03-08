/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoRoberto.Service;

import CasoRoberto.Entity.peliculas;
import java.util.List;

/**
 *
 * @author Roberto
 */
public interface IpeliculasService {
    public List<peliculas> getAllpeliculas();
    public peliculas getpeliculasById (long id);
    public void savepeliculas(peliculas peliculas);
    public void delete (long id);
}
