/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

public class TrianguloRectangulo {
    int base, altura;
    
    public TrianguloRectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    
    public double calcularArea(){
        return ((base*altura)/2f);
    }
    
    public double calcularHipotenusa(){
        return Math.sqrt(base*base +altura*altura);
    }
    
    public double calcularPerimetro(){
        return base + altura + calcularHipotenusa();
    }
    
    public String determinarTipoTriangulo(){
        if(base == altura && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())){
            return ("Equilatero");
        }
        else if((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())){
            return ("Escaleno");
        }
        else {
            return ("Isóceles");
        }
    }
}
