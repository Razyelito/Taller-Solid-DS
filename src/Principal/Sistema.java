/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Adicionales.*;
import Postres.*;
import Procesos.*;
import Leche.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Descremada
        // Finalmente mostrar el precio final de cada uno
        LecheEntera leche = new LecheDeslactosada();
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        Frutilla frutilla = new Frutilla();
        frutilla.setNombre("Frutilla");
        Crema crema = new Crema();
        crema.setNombre("Crema");
        ManejadorDePrecio mnp = new ManejadorDePrecio();
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        Helado.anadirAderezo(helado_vainilla,crema);
        Helado.anadirAderezo(helado_vainilla, frutilla);
        System.out.println(helado_vainilla);
        mnj_leche.cambiarTipoLeche(leche, helado_vainilla);
        double pF = mnp.calcularPrecioFinal(helado_vainilla);
        String mensajePrecio = mnp.showPrecioFinal(helado_vainilla);
        System.out.println(mensajePrecio);
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        Pastel.quitarAderezo(pastel_chocolate, crema);
        Pastel.anadirAderezo(pastel_chocolate, frutilla);
        System.out.println(pastel_chocolate);
        mnj_leche.cambiarTipoLeche(leche, pastel_chocolate);
        double pF2 = mnp.calcularPrecioFinal(pastel_chocolate);
        String mensajePrecio2 = mnp.showPrecioFinal(pastel_chocolate);
        System.out.println(mensajePrecio2);
        
        
        
    }
}
