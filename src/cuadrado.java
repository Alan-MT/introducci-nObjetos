package src;

import java.util.Scanner;

public class cuadrado {

    private  double lado;

    public cuadrado(){
        System.out.println("ingrese el lado del cuadrado");
        Scanner scan = new Scanner(System.in);
        lado = scan.nextDouble();
    }
    public double Area(){
        double resultado = lado*lado;
        return resultado;
    }
    
    public double perimetro(){
        double resultado = 4*lado;
        return resultado;
    }
}
