package src;

public class Contador {
    private int contador;

    public Contador(){
        
    }

    public Contador(int contador) {
        this.contador = contador;
    }


    public int incrementar(){
        contador++;
        return contador;
    }

    public int descrementar(){
        contador--;
        return contador;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    
   

    
}