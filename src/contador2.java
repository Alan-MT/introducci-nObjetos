package src;

public class contador2 {
    
    private int contador;

        public contador2(int contador) {
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