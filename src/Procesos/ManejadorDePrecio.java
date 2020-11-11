/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procesos;

import Postres.Postre;
import Adicionales.Aderezo;
import java.util.ArrayList;
/**
 *
 * @author guill
 */
public class ManejadorDePrecio {
    
    public double calcularPrecioFinal(double precioParcial, Postre pos){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(pos.getAderezos().size()*0.50);
        return precioFinal;
    }
    
   
    /*public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal(Postre p);
    }*/

    
}
