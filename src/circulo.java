package src;

public class circulo {

    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    public double Area(){
        double resultado = Math.PI*radio*radio;
        return resultado;
    }

    public double perimetro(){
        double perimetro = 2*radio*Math.PI;
        return perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double rad) {
        radio = rad;
    }

    
    
}
