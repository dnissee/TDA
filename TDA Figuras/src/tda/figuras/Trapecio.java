/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda.figuras;

/**
 *
 * @author capis
 */
public class Trapecio extends FigurasGeometricas{ // Clase hija
    // Atributos
    private double BaseMayor;
    private double BaseMenor;
    private double Altura;
    private double Laterales;   

    // Constructor
    public Trapecio(double BaseMayor, double BaseMenor, double Altura, double Laterales) {
        this.BaseMayor = BaseMayor;
        this.BaseMenor = BaseMenor;
        this.Altura = Altura;
        this.Laterales = Laterales;
    }
    
    // Implementación de los métodos de la superclase
    @Override
    public double getArea() {
       return((BaseMayor+BaseMenor)/2)*Altura; // Devuelve el valor del área en base a los parametros que recibe el constructor
    }

    @Override
    public double getPerimetro() {
       return((2*Laterales) + BaseMayor + BaseMenor); // Devuelve el valor del perimetro en base a los parametros que recibe el constructor
    }
    
}
