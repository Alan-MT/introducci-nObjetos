package src;

public class Principal {
    
    public static void main(String[] args) {
        Contador con = new Contador(5);
        Contador con1 = con;
        System.out.println("incremento de 5 es "+con.incrementar());
        cuadrado cua = new cuadrado();
        cuadrado cua1 = cua;
        System.out.println("el area del cuadrado es "+cua.Area());
        System.out.println("El perimetro del cuadrado es "+cua.perimetro());
        circulo cir = new circulo(5.5);
        circulo cir1 = cir;
        cir1.setRadio(13.2);
        System.out.println("El area del circulo es "+cir.Area());
        System.out.println("El perimetro del ciruclo es "+cir.perimetro());
        rectangulo rec = new rectangulo();
        rectangulo rec1 = rec;
        System.out.println("el area del rectangulo es "+rec.area());
        System.out.println("El perimetro del rectangulo es "+rec.perimetro());
    }
}
