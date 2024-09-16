/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda.figuras;

/**
 *
 * @author capis
 */
public class Rectangulo extends FigurasGeometricas{
    // Atributos
    private double Lado1;
    private double Lado2;
    
    // Constructor
    public Rectangulo(double Lado1, double Lado2){
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
    }
        
    // Implementación de los métodos de la superclase
    @Override
    public double getArea() {
        return Lado1*Lado2; // Devuelve el valor del área en base a los parametros que recibe el constructor
    }

    @Override
    public double getPerimetro() {
        return (2*Lado1)+(2*Lado2); // Devuelve el valor del perimetro en base a los parametros que recibe el constructor
    }
    
    
    
}
