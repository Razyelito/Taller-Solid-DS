/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procesos;

import Postres.*;
import Adicionales.Aderezo;
import java.util.ArrayList;
/**
 *
 * @author guill
 */
public class ManejadorDePrecio {
    
    public double calcularPrecioFinal(Postre p){
        double precioFinal;
        precioFinal = (p.getprecioParcial() + (p.getprecioParcial()*0.12)) + (p.getAderezos().size()*0.50);
        return precioFinal;
    }
    
   
    public String showPrecioFinal(Postre p){
        return "Precio Final: $" + calcularPrecioFinal(p);
    }

    
}
