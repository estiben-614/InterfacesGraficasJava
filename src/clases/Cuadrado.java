/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class Cuadrado {
    int lado;
    
    public Cuadrado(int lado){
        this.lado=lado;
    }
    
    public double calcularArea(){
        return lado*lado;
    }
    
    public double calcularPerimetro(){
        return 4*lado;
    }
        
}
