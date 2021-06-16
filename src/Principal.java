package src;

public class Principal {
    
    public static void main(String[] args) {
        Contador con = new Contador();
        System.out.println("incremento de 5 es "+con.incrementar(5));
        System.out.println("El decremento de 5 es "+con.descrementar(5));
        cuadrado cua = new cuadrado();
        System.out.println("el area del cuadrado es "+cua.Area());
        System.out.println("El perimetro del cuadrado es "+cua.perimetro());
        circulo cir = new circulo(5.5);
        System.out.println("El area del circulo es "+cir.Area());
        System.out.println("El perimetro del ciruclo es "+cir.perimetro());
    }
}
