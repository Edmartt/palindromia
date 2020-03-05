/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author aprendiz
 */
public class Imagen extends javax.swing.JPanel{
 String ruta;
    

 public Imagen(int x,int y, String ruta){
     
     this.setSize(x,y);
     this.ruta=ruta;
     
 }
  
 public void paint(Graphics g){
     
     Dimension height =getSize();
     ImageIcon img= new ImageIcon(getClass().getResource(ruta));
     
     g.drawImage(img.getImage(), height.width, height.height, null);
     setOpaque(false);
     super.paintComponent(g);
 }
    
    
}
