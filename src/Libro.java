package src;

public class Libro {
    
    private String nombre, autor;
    private int anioo, edicion;
    private boolean prestado;

    public Libro(){

    }

    public Libro(String nom, String au, int ani, int edi, boolean pres) {
        nombre = nom;
        autor = au;
        anioo = ani;
        edicion = edi;
        prestado = pres;
    }
    public void prestamo(){
        prestado = true;
    }

    public void devolucion(){
        prestado = false;
    }

    public String informacion() {
        return "Libro" + nombre +  ", autor=" + autor +" anioo=" + anioo + ", edicion=" + edicion +  ", prestado=" + prestado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioo() {
        return anioo;
    }

    public void setAnioo(int anioo) {
        this.anioo = anioo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    
}
