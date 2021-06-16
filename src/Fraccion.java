package src;

public class Fraccion {
    
    private int numerador, denomiador, numerador2, denominador2, numeradores, denominadores;
    private double resultado;

    public Fraccion(int numerado, int denominador, int numera2, int denomi2){
        numerador = numerado;
        denomiador = denominador;
        numerador2 = numera2;
        denominador2 = denomi2;
    }

    public double sumar(){
        if (denomiador == denominador2) {
            numeradores = numerador+numerador2;
            resultado = numeradores/denomiador;
        }else {
            numeradores = numerador*denominador2+numerador2*denomiador;
            denominadores = denomiador*denominador2;
            resultado = numeradores/denominadores;
        }
        return resultado;
    }
    public double restar(){
        if (denomiador == denominador2) {
            numeradores = numerador-numerador2;
            resultado = numeradores/denomiador;
        }else {
            numeradores = numerador*denominador2-numerador2*denomiador;
            denominadores = denomiador*denominador2;
            resultado = numeradores/denominadores;
        }
        return resultado;
    }
    public double multiplicar(){
        numeradores = numerador*numerador2;
        denominadores = denomiador*denominador2;
        resultado = numeradores/denominadores;
        return resultado;
    }
    public double dividir(){
        numeradores = numerador*denominador2;
        denominadores = denomiador*numerador2;
        resultado = numeradores/denominadores;
        return resultado;
    }
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerado) {
        this.numerador = numerado;
    }

    public int getDenomiador() {
        return denomiador;
    }

    public void setDenomiador(int denomiador) {
        this.denomiador = denomiador;
    }

    public int getNumerador2() {
        return numerador2;
    }

    public void setNumerador2(int numerador2) {
        this.numerador2 = numerador2;
    }

    public int getDenominador2() {
        return denominador2;
    }

    public void setDenominador2(int denominador2) {
        this.denominador2 = denominador2;
    }
    

    
}
