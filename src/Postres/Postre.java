/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;
import Adicionales.Aderezo;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public abstract class Postre {
    private String sabor;
    private ArrayList<Aderezo> aderezos;
    protected double precioParcial;
    
    public Postre(String sabor,double precio){
        aderezos= new ArrayList<>();
        this.sabor=sabor;
        precioParcial=precio;
    }
    
      public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }
    
    public String getSabor(){
        return sabor;
    }
    
    /**
     *
     * @return
     */
    
    public static void anadirAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().add(aderezo);
    }
    
    public static void quitarAderezo(Postre postre,Aderezo aderezo){
        postre.getAderezos().remove(aderezo);
    }
    
    public double getprecioParcial(){
        return this.precioParcial;
    }
}
