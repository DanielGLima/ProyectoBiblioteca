/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobiblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author danie
 */
public class GestorTransacciones {
     private List<Transaccion> listaTransacciones;
    private GestorLibros gestorLibros;
    
    public GestorTransacciones(GestorLibros gestorLibros){
        this.listaTransacciones = new ArrayList<>();
        this.gestorLibros = gestorLibros;
        }
    
    //metodo de ordenamiento de collections
    public void ordenarPrestamoPorFecha(){
        Collections.sort(listaTransacciones,(ordenPrestamo1,ordenPrestamo2) -> ordenPrestamo1.getFehaPrestamo().compareTo(ordenPrestamo2.getFehaPrestamo())) ;
        
    }
    
    public void registrarPrestamo(int Id, int IdCliente,String isbn, java.sql.Date fechaPrestamo){
        Libro libro = gestorLibros.buscarLibroPorISBN(isbn);
        if (libro != null && libro.getCantidadDisponible()>0){
            Transaccion transaccion = new Transaccion(Id, Transaccion.PRESTAMO, IdCliente, isbn, fechaPrestamo, null, 0);
            listaTransacciones.add(transaccion);
            libro.setCantidadDisponible(libro.getCantidadDisponible()-1);   
        }
    }
    
    public void registrarDevolucion(int Id, int IdCliente, String isbn, java.sql.Date fechaDevolucion, double multa){
        for (Transaccion transaccion:listaTransacciones){
            if (transaccion.getId()== Id && transaccion.getTipo()==Transaccion.PRESTAMO) {
                transaccion.setTipo(Transaccion.DEVOLUCION);
                transaccion.setFechaDevolucion(fechaDevolucion);
                transaccion.setMulta(multa);
                gestorLibros.actualizarCantidadDiponible(transaccion.getIsbn(), 1);
                break;   
            }
        }
    }
}
