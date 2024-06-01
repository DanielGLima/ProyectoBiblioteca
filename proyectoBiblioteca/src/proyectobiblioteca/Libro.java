/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobiblioteca;

/**
 *
 * @author danie
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String editorial;
    private int cantidadDisponible;

    public Libro(String isbn, String titulo, String autor, int anioPublicacion, String editorial, int cantidadDisponible){
    this.ISBN = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.anioPublicacion = anioPublicacion;
    this.editorial = editorial;
    this.cantidadDisponible = cantidadDisponible;
    
    }
    
    public String getIsbn() {
        return ISBN;
    }

    public void setIsbn(String isbn) {
        this.ISBN = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    @Override
    public String toString(){
        return "Libro{" +
                "ISBN=' " + ISBN + '\'' +
                ", titulo=' " + titulo + '\''+
                ", autor=' " + autor + '\'' +
                ", anioPublicacion=' " + anioPublicacion + '\'' +
                ", editorial' " + editorial + '\''+
                ", cantidadDisponible' " + cantidadDisponible + 
                ']';
                
                
        
    }
 
}
