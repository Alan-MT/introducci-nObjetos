package src;

public class Principal {
    
    public static void main(String[] args) {
        System.out.println("\nEjercicoi 1");
        Contador con = new Contador(5);
        Contador con1 = con;
        System.out.println("\nincremento de 5 es "+con.incrementar());
        System.out.println("\nEjercicoi 2");
        cuadrado cua = new cuadrado();
        cuadrado cua1 = cua;
        System.out.println("nel area del cuadrado es "+cua.Area());
        System.out.println("nEl perimetro del cuadrado es "+cua.perimetro());
        System.out.println("\nEjercicoi 3");
        circulo cir = new circulo(5.5);
        circulo cir1 = cir;
        cir1.setRadio(13.2);
        System.out.println("El area del circulo es "+cir.Area());
        System.out.println("El perimetro del ciruclo es "+cir.perimetro());
        System.out.println("\nEjercicoi 4");
        rectangulo rec = new rectangulo();
        rectangulo rec1 = rec;
        System.out.println("el area del rectangulo es "+rec.area());
        System.out.println("El perimetro del rectangulo es "+rec.perimetro());
        System.out.println("\nEjercicoi 5");
        contador2 con2 = new contador2(35);
        contador2 con3 = con2;
        System.out.println("El incremento del numero "+con2.getContador());
        System.out.println("incremto es "+con2.incrementar()+" decremento "+con2.descrementar());
        System.out.println("\nEjercicoi 6");
        Libro lib = new Libro("Señor de los anillo","J. R. R. Tolkien",1954,1,true);
        Libro lib1 = lib;
        System.out.println(lib.informacion());
        Fraccion fra = new Fraccion(5,6,8,7);
        Fraccion fra2 = fra;
        System.out.println("\nEjercicoi 7");
        System.out.println("5/6+8/7="+fra.sumar());
        System.out.println("5/6-8/7="+fra.restar());
        System.out.println("5/6*8/7="+fra.multiplicar());
        System.out.println("(5/6)/(8/7)="+fra.dividir());
        System.out.println("\nEjercicio Bono");
        System.out.println("Objeto 1");
        Persona per = new Persona();
        Persona per2 = per;
        System.out.println("el imc es "+per.calcularIMC());
        System.out.println("Si es true es mayor de dad sino es false "+per.mayorEdad(per.getEdad()));
        System.out.println("comprobar sexo ");
        System.out.println(per.toString());
        System.out.println("Objeto 2");
        Persona pe2 = new Persona("juan",15,'j');
        System.out.println("el imc es "+per.calcularIMC());
        System.out.println("Si es true es mayor de dad sino es false "+pe2.mayorEdad(pe2.getEdad()));
        System.out.println("comprobar sexo ");
        System.out.println(pe2.toString());
        System.out.println();
        System.out.println("Objeto 3");
        Persona per3 = new Persona("Alan", 22, 178, 169, 'H');

    }
}
