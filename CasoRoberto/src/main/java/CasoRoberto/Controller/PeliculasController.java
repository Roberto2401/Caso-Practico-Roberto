/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoRoberto.Controller;

import CasoRoberto.Entity.peliculas;
import CasoRoberto.Entity.salas;
import CasoRoberto.Service.IpeliculasService;
import CasoRoberto.Service.IsalasService;
import CasoRoberto.Service.peliculasService;
import CasoRoberto.Service.salasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class PeliculasController {
    
    @Autowired
    private IpeliculasService peliculasService;
    
    @Autowired
    private IsalasService salasService;
    
    @GetMapping("/peliculas")
    public String index(Model model){
        List<peliculas> listapeliculas = peliculasService.getAllpeliculas();
        model.addAttribute("titulo", "Tabla peliculas");
        model.addAttribute("peliculas", listapeliculas);
        return "peliculas";
        
        
    }
    @GetMapping("/peliculasN")
    public String crearpelicula(Model model){
         List<salas> listasalas = salasService.listCountry();
         model.addAttribute("peliculas", new peliculas());
         model.addAttribute("sala", listasalas);
         return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarpelicula(@PathVariable("id") Long idpeliculas){
        peliculasService.delete(idpeliculas);
        return "redirect:/peliculas";
        
        
    }
    
    @PostMapping("/save")
    public String guardarpelicula(@ModelAttribute peliculas peliculas){
        peliculasService.savepeliculas(peliculas);
        return "redirect:/peliculas";
    }
    @GetMapping("/editpeliculas/{id}")
    public String editarpeliculas(@PathVariable("id") Long idpeliculas, Model model){
         peliculas peliculas = peliculasService.getpeliculasById(idpeliculas);
        List<salas> listaLugares = salasService.listCountry();
        model.addAttribute("peliculas", peliculas);
        model.addAttribute("sala", listaLugares);
        return "crear";
    }
}