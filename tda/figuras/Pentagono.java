/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tda.figuras;

/**
 *
 * @author capis
 */
public class Pentagono extends FigurasGeometricas{
    // Atributos
    private double Lados;
    private double Apotema;
    
    // Constructor de la clase
    public Pentagono(double Lados, double Apotema) {
        this.Lados = Lados;
        this.Apotema = Apotema;
    }

    @Override
    public double getArea() {
        return (getPerimetro()*Apotema); // Devuelve el valor del área en base a los parametros que recibe el constructor
    }

    @Override
    public double getPerimetro() {
        return 5*Lados; // Devuelve el valor del perimetro en base a los parametros que recibe el constructor
    }
    
    
}
