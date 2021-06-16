package src;

import java.util.Scanner;

public class rectangulo {

    private double ladoA;
    private double ladoB;
    Scanner scan = new Scanner(System.in);

    public rectangulo(){
        System.out.println("ingrese el primer lado");
        double ancho =scan.nextInt();
        System.out.println("ingrese el segundo lado");
        ladoB = scan.nextInt();
        if (ladoA == ladoB) {
            System.out.println("Los dos lados son iguales");
        }
    }

    public double area(){
        double resultado = ladoB*ladoA;
        return resultado;
    }

    public double perimetro(){
        double resultado = 2*ladoB+2*ladoA;
        return resultado;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }


    
}
