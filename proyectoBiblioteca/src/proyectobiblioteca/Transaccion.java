/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobiblioteca;

import java.time.LocalDate;

/**
 *
 * @author danie
 */
public class Transaccion {
    public static final int PRESTAMO = 1;
    public static final int DEVOLUCION =2;
    
    private int Id;
    private int tipo;
    private int IdCliente;
    private String isbn;
    private java.sql.Date fechaPrestamo;
    private java.sql.Date fechaDevolucion;
    private double multa;
    
    public Transaccion(int Id, int tipo, int IdCliente, String isbn, java.sql.Date fechaPrestamo,java.sql.Date fechaDevolucion, double multa){
        this.Id = Id;
        this.tipo = tipo;
        this.IdCliente = IdCliente;
        this.isbn = isbn;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.multa = multa;
        
        
        
        
      
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public java.sql.Date getFehaPrestamo() {
        return fechaPrestamo;
    }

    public void setFehaPrestamo(java.sql.Date fehaPrestamo) {
        this.fechaPrestamo = fehaPrestamo;
    }

    public java.sql.Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(java.sql.Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
    @Override
    public String toString() {
        return "Transaccion{" + "Id=" + Id + ", tipo=" + tipo + ", IdCliente=" + IdCliente + ", isbn='" + isbn + "'"
        + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", multa=" + multa + '}';
    }
    
}
