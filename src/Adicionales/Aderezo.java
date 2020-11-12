/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author Pedro Mendoza
 */
public abstract class Aderezo {
    //MALVAVISCOS,FRUTILLA,CREMA
    public String nombre;

    public String getNombre() {
        return nombre;
    }
    
    public abstract void setNombre(String nombre);

    @Override
    public  String toString(){
        String ustring= nombre.toUpperCase(); 
        return ustring;
    }
    
}
