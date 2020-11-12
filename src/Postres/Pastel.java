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
public class Pastel extends Postre{
    private double precioParcial;
    
       public Pastel(String sabor){
        super(sabor);
        this.precioParcial = 15.55;
    }
    


    @Override
    public String toString() {
        return "Pastel{" + "sabor=" + super.getSabor() + ", precioParcial=" + precioParcial + ", aderezos=" + super.getAderezos() + '}';
    }
    
    public double getprecioParcial(){
        return precioParcial;
    }
    
}
