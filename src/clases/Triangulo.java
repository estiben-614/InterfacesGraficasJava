/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.DecimalFormat;

public class Triangulo {
    double lado;
    
    public Triangulo(){
    }
    
    public Triangulo(double lado){
        this.lado=lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    public void setLado(double lado){
        this.lado=lado;
    }
    
    public double calcularPerimetro(){
        return 3*(lado);
    }
    
    public String calcularAltura(){
        double area, lado;
        lado=getLado();
        
        area =lado * (Math.sqrt(3) / 2);
        DecimalFormat f = new DecimalFormat("#.##");
        return f.format(area);
    }
    
    public double calcularArea(){
        double lado;
        lado=getLado();
        
        return Math.pow(lado, 2)/2;
    }
}
