/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import java.util.ArrayList;
import Adicionales.Aderezo;

/**
 *
 * @author Pedro Mendoza
 */
public class Helado extends Postre{
     private double precio;
    
    public Helado(String sabor,double precio){
        super(sabor,precio);
    }
    

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + super.getSabor() + ", precioParcial=" + super.getprecioParcial() + ", aderezos=" + super.getAderezos() + '}';
    }
	
}
