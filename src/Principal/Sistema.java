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
import java.util.ArrayList;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        // y cambiar el tipo de leche por Leche Deslactosada
        // Finalmente mostrar el precio final de cada uno
        
        
        ManejadorDeLeche mnj_leche = new ManejadorDeLeche();
        ManejadorDePrecio mnj_precio = new ManejadorDePrecio();
        
        LecheEntera leche = new LecheDeslactosada();
        Frutilla frutilla = new Frutilla();
        frutilla.setNombre("Frutilla");
        Crema crema = new Crema();
        crema.setNombre("Crema");
      
        ArrayList<Postre> arrPostres = new ArrayList<>();
        
        // Producir Helado
        System.out.println("----Creando Helado----");
        Postre helado_vainilla = new Helado("Vainilla",7.85);
        System.out.println(helado_vainilla);
        arrPostres.add(helado_vainilla);
       
        // Producir Pastel
        System.out.println("----Creando Pastel----");
        Postre pastel_chocolate = new Pastel("Chocolate",15.55);
        System.out.println(pastel_chocolate);
        arrPostres.add(pastel_chocolate);
        
        arrPostres.forEach(postre -> {
            if(postre instanceof Helado){
                System.out.println("----Añadiendo aderezos a Helado de "+postre.getSabor()+",cambiando leche"
                                    +" y mostrando su precio final----");
            }else if(postre instanceof Pastel){
                 System.out.println("----Añadiendo aderezo a Pastel de "+postre.getSabor()+ ", cambiando leche"
                         + " y mostrando su precio final----");
            }
            postre.anadirAderezo(postre,crema);
            postre.anadirAderezo(postre,frutilla);
            System.out.println(postre);
            mnj_leche.cambiarTipoLeche(leche,postre);
            System.out.println(mnj_precio.showPrecioFinal(postre));
            
        });        

    }
}
