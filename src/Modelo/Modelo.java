
package Modelo;

import Vista.Vista;

/**
 *
 * @author sam
 */
public class Modelo {
    
    private String texto="",invertida="",texto2="";
    
    
    
    public Modelo(){
        //Vista view=new Vista();
        
        
    
    }

    /**
     *
     * @return
     */
    public String getTexto() {
        return texto;
    }

    /**
     *
     * @param texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    /**
     *
     * @return
     */
    public String getInvertida(){
    
        return invertida;
    }
    
    /**
     *
     * @param invertida
     */
    public void setInvertida(String invertida){
    
        this.invertida=invertida;
    }
    
    /**
     *
     * @return
     */
    public String getTexto2(){
    
        return texto2;
    
    }
    
    /**
     *
     * @param texto2
     */
    public void setTexto2(String texto2){
        this.texto2=texto2;
    
    
    }
    
    /**
     *
     */
    public void invertirCadena(){
        
        for (int i =this.texto.length()-1; i >=0; i--) {
            if (this.texto.charAt(i)!=' ') {
                invertida+=this.texto.charAt(i);
            }
        }
        
    }
    
    /**
     *
     * @param texto
     */
    public void eliminarEspacios(String texto){
        
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i)!=' ') {
                texto2+=this.texto.charAt(i);
            }
        }
    
    }   
    
    /**
     *
     * @param view
     */
    public void accionarEvento(Vista view){
        
         if (view.txt_texto.getText().isBlank()) {
                
                       view.lbl_mensaje.setText("La caja está en blanco, por favor introduzca una palabra");
                       view.lbl_comprobado.setText("");            }
             
              
         
         else if (!view.txt_texto.getText().isBlank()) {
             
                  if (esNumerico(view.txt_texto.getText())==true) {
                      
                      
                      
                      view.lbl_mensaje.setText("Es numerico");
                      view.lbl_comprobado.setText("");
                      
                 
             } //fin if
                  
                  
                  else{
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
                      
                      
                  }
                       
                       
                        
                       
                       
                       
                       
                 
             
                   
                   
               
                      
                   
                   
                   }      //fin else if
    }
    
    
    
    /*Método para comprobar si la cadena completa es numérica. Solo sirve para cadenas completas,
    por tanto, si combinamos letras y números, lo leerá como una cadena común y corriente*/

    /**
     *
     * @param texto
     * @return
     */

    
    public boolean esNumerico(String texto){ //Declaramos el método de tipo boolean al cual le pasamos como parámetro una cadena de texto
        boolean resultado; //Variable de tipo boolean para almacenar el resultado de la conversión de la cadena a numero
        
        /***Encerramos dentro de bloque try catch para atrapar la excepción 
        en caso de que la conversión de la cadena a número falle***/
        try {
            Integer.parseInt(texto); //Hacemos la conversión o parseo de la cadena;
            resultado= true; //Si resulta bien, el resultado será true
        } catch (NumberFormatException e) { //En caso de que ocurra la excepción en el parseo, atrapamos la excepción del formateo de números y el resultado será false
            resultado= false;
            
        }
        
        return resultado; /***Nos devuelve el resultado, sea falso o verdadero***/
    }
    
    

    
    
}
