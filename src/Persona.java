package src;

import java.util.Scanner;

public class Persona {
    
    private String nombre;
    private int edad, dni;
    private double peso, altura;
    private char sexo = 'H';
    Scanner scan = new Scanner(System.in);

    public Persona(){
        System.out.println("ingrese su nombre");
        nombre = scan.nextLine();
        System.out.println("ingrese su edad");
        edad = scan.nextInt();
        System.out.println("ingres sexo H homber/M mujer");
        String sexo1 = scan.next();
        sexo = sexo1.charAt(0);
        System.out.println("ingrese su peso");
        peso = scan.nextDouble();
        System.out.println("ingrese su altura");
        altura = scan.nextDouble();

    }

    public Persona(String nombre, int edad,char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        dni = generarIDN();
    }

    public Persona(String nombre, int edad, double peso, double altura, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public boolean mayorEdad(int edad){
        boolean mayor;
        if (edad >= 18) {
            mayor = true;
        } else{
            mayor = false;
        }
        return mayor;
    }

    public void comprobarSexo(){
        if (sexo != 'F'|| sexo != 'f') {
            sexo = 'H';
        }
    }

    public String toString(){
        return "Nombre: "+nombre+" Edad: "+edad+" Peso: "+peso+" Altura: "+altura+" Sexo: "+sexo;
    }

    public int generarIDN(){
        int idn = (int)(Math.random() * (100000000 - 10000000) + 10000000);
        return idn;
    }

    public int calcularIMC(){
        int indice;
        double imc = peso/Math.pow(altura, 2);
        if (imc < 20) {
            indice = -1;
        } else if (imc <= 25) {
            indice = 0;
        } else {
            indice = 1;
        }
        return indice;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getDni() {
        return dni;
    }
        
}

