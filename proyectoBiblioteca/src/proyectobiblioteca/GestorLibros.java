/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobiblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author danie
 */
public class GestorLibros {
        private List<Libro> listaDeLibros;
    
        //metodo de ordenamiento de collections
    public void ordenarLibroPorIsbn(){
        Collections.sort(listaDeLibros,(ordenLibro1,ordenLibro2) -> ordenLibro1.getIsbn().compareTo(ordenLibro2.getIsbn())) ;
        
    }
    
    public GestorLibros() {
        this.listaDeLibros = new ArrayList<>();
    }
    
    public void agregarLibro(Libro Libro){
        listaDeLibros.add(Libro);
    }
    
    
    //Metodo utilizado para buscar un libro por ISBN
    public Libro buscarLibroPorISBN(String ISBN){
        for (Libro Libro : listaDeLibros){
            if(Libro.getIsbn().equals(ISBN)){
                return Libro;
            }
        }
        return null;
    }
    
    //Metodo utilizado para buscar un libro por su titulo
    //Aplicando un .toLowerCase que convierte la busqueda en minuscula para que no sea sensible en la busqueda
    public List<Libro> buscarLibroPorTitulo(String titulo){
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro Libro : listaDeLibros){
            if(Libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                librosEncontrados.add(Libro);
            }
        }
        return librosEncontrados;
    }
    
    
    
    //Metodo para actualizar la cantidad de libros disponibles
    
    public void actualizarCantidadDiponible (String ISBN, int cantidadDisponible){
        Libro libro = buscarLibroPorISBN(ISBN);
        if(libro != null){
            libro.setCantidadDisponible(libro.getCantidadDisponible() + cantidadDisponible);    
        }
    }
}
