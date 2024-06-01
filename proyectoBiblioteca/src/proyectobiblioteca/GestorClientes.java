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
public class GestorClientes {
    private List<Cliente> listaClientes;
        
            //metodo de ordenamiento de collections
    public void ordenarClientePorNombre(){
        Collections.sort(listaClientes,(ordenCliente1,ordenCliente2) -> ordenCliente1.getNombre().compareTo(ordenCliente2.getNombre())) ;
        
        
    }
        
        public GestorClientes(){
            this.listaClientes = new ArrayList<>();
        }
        
        //metodo para agregar un cliente
        public void agregarCliente(Cliente cliente){
            listaClientes.add(cliente);
        }
        
        //metodo para buscar cliente por Id
        //utilizando un bucle for-each-loop que recorre el arreglo 
        public Cliente busquedaClientePorId(int Id){
            for(Cliente cliente:listaClientes){
                if(cliente.getId()==Id){
                    return cliente;
                }
            }
      return null;
        }
        
        //metodo para buscar cliente por numero de Identificacion
        public Cliente busquedaClientePorIdentificacion(int NoIdentificacion){
            for(Cliente cliente:listaClientes){
                if(cliente.getNoIdentificacion()== NoIdentificacion){
                    return cliente;
                }
            }
            return null;
        }
}
