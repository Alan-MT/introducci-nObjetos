package src;

import java.util.Scanner;

public class cuadrado {

    public cuadrado(){
        System.out.println("ingrese el lado");
        Scanner scan = new Scanner(System.in);
        double lado = scan.nextDouble();
    }
    public double Area(double lado){
        double resultado = lado*lado;
        return resultado;
    }
    
    public double perimetro(double lado){
        double resultado = 4*lado;
        return resultado;
    }
}
