/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamvc;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;

/**
 *
 * @author sam
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        

           
        Vista view= new Vista();
      
        Modelo model= new Modelo();
      
        
        
        Controlador ctrl = new Controlador(view, model);
        
        view.setVisible(true);
    }
    
}
