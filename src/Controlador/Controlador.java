/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
/**
 *
 * @author sam
 */
public class Controlador implements ActionListener{
    
    private Vista view;
    private Modelo model;
    
    int x,y;
    
    
   

    
    public Controlador(Vista view, Modelo model){
        this.view=view;
        this.model=model;
       
        
        
        this.view.btn_ingresar.addActionListener(this);
        
        this.view.txt_texto.addKeyListener(new KeyAdapter() { 
            
            public void keyPressed(KeyEvent event){
                if (event.getKeyCode()==KeyEvent.VK_ENTER) {
                    
                    model.accionarEvento(view);
                 
                    
                    
                    
                }
            }
        });
        
        
        this.view.lbl_cerrar.addMouseListener(new MouseAdapter() {
        
            
            
      
            @Override
            public void mouseClicked(MouseEvent evt){
                int respuesta=JOptionPane.showConfirmDialog(null, "¿Desea cerrar el programa?", "Confirmar", JOptionPane.YES_NO_OPTION);
                if (respuesta==0) {
                    System.exit(0);
                }
                
            
                       
            }
            
     
        
        
        }
        
        );
        
//         int ancho=this.view.pn_fondo.getWidth();
//    int alto=this.view.pn_fondo.getHeight();
//    String ruta="/img/dragon ball.jpg";
//    Imagen img= new Imagen(ancho,alto,ruta); 
//        
//    this.view.pn_fondo.add(img);
//    this.view.pn_fondo.repaint();
        
        
       
   
        
        
        
    
        
            
        }
    
    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e){

        
        
        if (e.getSource()==this.view.btn_ingresar) {
            
                  this.model.accionarEvento(view);
                
            
            
        }
        
        
        
              
       
    
    }

    
     

}



