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
    private double precioParcial;
    
    public Helado(String sabor){
        super(sabor);
        this.precioParcial = 7.85;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(super.getAderezos().size()*0.50);
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Helado{" + "sabor=" + super.getSabor() + ", precioParcial=" + precioParcial + ", aderezos=" + super.getAderezos() + '}';
    }
    
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
}
