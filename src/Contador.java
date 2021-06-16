package src;

public class Contador {
    private int incremento;
    private int decremento;

    public Contador(){
        
    }

    public Contador(int incremento, int decremento) {
        this.incremento = incremento;
        this.decremento = decremento;
    }

    public int incrementar(int incre){
        incre++;
        return incre;
    }

    public int descrementar(int decre){
        decre++;
        return decre;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public int getDecremento() {
        return decremento;
    }

    public void setDecremento(int decremento) {
        this.decremento = decremento;
    }

    
    
    
}