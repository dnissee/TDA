/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tda.figuras;

import java.util.Scanner;

/**
 *
 * @author Emily
 */
public class TDAFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Teclear = new Scanner(System.in);
        FigurasGeometricas Figura; // Variable de tipo por referencia de la superclase 
        System.out.println("Bienvenido al programa de figuras geométricas");
        System.out.println("Por favor, selecciona una opción:");
        System.out.println("1. Rectángulo");
        System.out.println("2. Trapecio");
        System.out.println("3. Pentágono");
        int opcion = Teclear.nextInt();

        switch (opcion) {
            case 1:
                double Lado1, Lado2;
                System.out.println("Ingresa Lado1:");
                Lado1 = Teclear.nextDouble();
                System.out.println("\nIngresa Lado2:");
                Lado2 = Teclear.nextDouble();                
                Figura = new Rectangulo(Lado1, Lado2);
                System.out.println("Area del rectangulo: "+Figura.getArea()+"\nPerimetro del rectangulo: "+Figura.getPerimetro());
                break;
            case 2:
                double BaseMayor, BaseMenor, Altura, Laterales;
                System.out.println("Ingresa Base Mayor:");
                BaseMayor = Teclear.nextDouble();
                System.out.println("Ingresa Base Menor:");
                BaseMenor = Teclear.nextDouble();
                System.out.println("Ingresa Altura:");
                Altura = Teclear.nextDouble();
                System.out.println("Ingresa las Laterales:");
                Laterales = Teclear.nextDouble();
                Figura = new Trapecio(BaseMayor, BaseMenor, Altura, Laterales);
                System.out.println("Area del trapecio: "+Figura.getArea()+"\nPerimetro del traprecio: "+Figura.getPerimetro());
                break;
            case 3:
                double Lados, Apotema;
                System.out.println("Ingresa los lados:");
                Lados = Teclear.nextDouble();
                System.out.println("Ingresa el apotema:");
                Apotema = Teclear.nextDouble();
                Figura = new Pentagono(Lados, Apotema);
                System.out.println("Area del pentagono:"+Figura.getArea()+"\nPerimetro del trapecio: "+Figura.getPerimetro());
                break;
            default:
                System.out.println("Opción no válida. ¡Hasta luego!");
        }
    }
    
}
