
package Modelo;

import Vista.Vista;

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
    
    
    public void invertirCadena(){
        
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
    
    
    public void accionarEvento(Vista view){
        
         if (view.txt_texto.getText().isBlank()) {
                
                       view.lbl_mensaje.setText("La caja está en blanco, por favor introduzca una palabra");
                       view.lbl_comprobado.setText("");            }
                 
                   
                   
         else if (!view.txt_texto.getText().isBlank()) {
             
                   if (esNumerico(texto)==true) {
                       
                       
                        this.setTexto(view.txt_texto.getText());
        
                         this.eliminarEspacios(this.getTexto());
             
                         this.invertirCadena();
            
             
                 
                 
                         view.lbl_mensaje.setText(this.getInvertida());
                 
                 if (this.getInvertida().equals(this.getTexto2())){
                     view.lbl_comprobado.setText("Palabra Palíndroma");
           
             }
                 
                  else{
                     view.lbl_comprobado.setText("No es una palabra Palíndroma");
          
        
             }
           
                 /*Volvemos las cadenas a su estado original que es cadenas en blanco*/
                
                 this.setTexto("");
                 this.setTexto2("");
                 this.setInvertida("");
                       
                       
                       
                       
                 
             } // fin if anidado que va después del else if
                   
                   
                   else{
                       view.lbl_comprobado.setText("");
                       view.lbl_mensaje.setText("La cadena es totalmente numérica, ingrese una palabra con caracteres no numéricos");
                       
                       
                   }
                      
                   
                   
                   }      //fin else if
            
        
      
          
           
                    
        
        
    }
    
    
    public boolean esNumerico(String texto){
        boolean resultado;
        try {
            Integer.parseInt(texto);
            resultado= true;
        } catch (NumberFormatException e) {
            resultado= false;
            
        }
        
        return resultado;
    }
    
}
