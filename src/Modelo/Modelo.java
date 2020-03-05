/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author sam
 */
public class Modelo {
    
    private String texto="",invertida="",texto2="";
    



    
    
    
    
    public String getTexto() {
        return texto;
    }

    
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    public String getInvertida(){
    
        return invertida;
    }
    
    
    public void setInvertida(String invertida){
    
        this.invertida=invertida;
    }
    
    
    
    public String getTexto2(){
    
        return texto2;
    
    }
    
    public void setTexto2(String texto2){
        this.texto2=texto2;
    
    
    }
    
    
    public void invertir(){
        
        for (int i =this.texto.length()-1; i >=0; i--) {
            if (this.texto.charAt(i)!=' ') {
                invertida+=this.texto.charAt(i);
            }
        }
        
    }
    
    public void eliminarEspacios(String texto){
        
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i)!=' ') {
                texto2+=this.texto.charAt(i);
            }
        }
    
    }   
    
    
}
