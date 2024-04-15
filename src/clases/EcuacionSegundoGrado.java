/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author estiben
 */
public class EcuacionSegundoGrado {
    double a,b,c;
    public EcuacionSegundoGrado(double a, double b, double c){
        this.a =a;
        this.b = b;
        this.c = c;
    }
    
    public String solucionesEcuacionGeneral () {
        double resultadoRaiz =  b * b - 4 * a * c;
        if(resultadoRaiz > 0) {
            double solPositiva = ((-b + Math.sqrt(resultadoRaiz))/(2*a));
            double solNegativa = ((-b - Math.sqrt(resultadoRaiz))/(2*a));
            return "x1 = " + solPositiva + " y " + "x2 = " + solNegativa;
        }
        else if(resultadoRaiz == 0) {
            double res = -b / (2*a);
            return "x1 =" + res;
        }
        return "No tiene soluciones reales";
    }
}
