/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamvc;

import Controlador.Controlador;
import Modelo.Imagen;
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
        
        

           Modelo model= new Modelo();
        Vista view= new Vista();
        Imagen img= new Imagen();
      
        
        
        Controlador ctrl = new Controlador(view, model);
        
        view.setVisible(true);
    }
    
}
