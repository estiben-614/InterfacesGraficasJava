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
public class Empleado2 {
    String nombre;
    double valorHora, numHorasTrabajadas;
    
    public Empleado2(){
        
    }
    
    public Empleado2(String nombre, double valorHora, double numHorasTrabajadas){
        this.nombre = nombre;
        this.valorHora = valorHora;
        this.numHorasTrabajadas = numHorasTrabajadas;
    }
    
    public double calcularSalario () {
        return numHorasTrabajadas * valorHora;
    }
    
    public String getNombre(){
        return nombre;
    }
}
