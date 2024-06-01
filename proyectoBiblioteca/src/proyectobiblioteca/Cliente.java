/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobiblioteca;

/**
 *
 * @author danie
 */
public class Cliente {
    private int Id;
    private String Nombre;
    private String Direccion;
    private int Telefono;
    private int NoIdentificacion;
    
    //constructor
    public Cliente(int id,String Nombre,String Direccion,int Telefono,int NoIdentificacion){
        this.Id = Id;
        this.Nombre = Nombre;
        this.Direccion =  Direccion;
        this.Telefono = Telefono;
        this.NoIdentificacion = NoIdentificacion;
        
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getNoIdentificacion() {
        return NoIdentificacion;
    }

    public void setNoIdentificacion(int NoIdentificacion) {
        this.NoIdentificacion = NoIdentificacion;
    }
    
    public String toString(){
     return "Cliente{" + 
             "Id=" + Id +
             "Nombre=" + Direccion + '/' +
             "Telefono=" + Telefono + '/' +
             "NoIdenticicacion=" + NoIdentificacion + '/' +
             '}';
             
    }
}
