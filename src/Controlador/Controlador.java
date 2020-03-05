/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Imagen;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author sam
 */
public class Controlador implements ActionListener{
    
    private Vista view;
    private Modelo model;
    
    int x,y;
    
    
   
    
    /**
     *
     */
    
    public Controlador(){
      
    
        
  
    
    
    }
    
    public Controlador(Vista view, Modelo model, Imagen imagen){
        this.view=view;
        this.model=model;
       
        
        
        this.view.btn_ingresar.addActionListener(this);
        this.view.lbl_cerrar.addMouseListener(new MouseAdapter() {
        
      
            @Override
            public void mouseClicked(MouseEvent evt){
                System.exit(0);
            
            
            }
            
     
        
        
        }
        
        );
        
         int ancho=this.view.pn_fondo.getWidth();
    int alto=this.view.pn_fondo.getHeight();
    String ruta="/img/dragon ball.jpg";
    Imagen img= new Imagen(ancho,alto,ruta); 
        
    this.view.pn_fondo.add(img);
    this.view.pn_fondo.repaint();
        
        
       
   
        
        
        
    
        
            
        }
    
    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e){

        
        
        if (e.getSource()==this.view.btn_ingresar) {
            
                   if (this.view.txt_texto.getText().isBlank()) {
                
                       this.view.lbl_mensaje.setText("La caja está en blanco, por favor introduzca una palabra");
            }
                 
                   
                   
                   
          
           
                   else{
                   
                         model.setTexto(view.txt_texto.getText());
        
                         model.eliminarEspacios(model.getTexto());
             
                         model.invertir();
            
             
                 
                 
                         view.lbl_mensaje.setText(model.getInvertida());
                 
                 if (model.getInvertida().equals(model.getTexto2())){
                     view.lbl_comprobado.setText("Palabra Palíndroma");
           
             }
                 
                  else{
                     view.lbl_comprobado.setText("No es una palabra Palíndroma");
          
        
             }
           
                 /*Volvemos las cadenas a su estado original que es cadenas en blanco*/
                
                 this.model.setTexto("");
                 this.model.setTexto2("");
                 this.model.setInvertida("");
                   
                   
                   }       
                
               
          
            
          
            

             
              
        
        
       
            
            
        }
        
      
        
       
    
    }


}



