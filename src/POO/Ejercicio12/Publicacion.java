package POO.Ejercicio12;

public class Publicacion {
    protected int ISBN;
    protected String Titulo;
    protected int anio;

    public Publicacion(int ISBN, String Titulo, int anio) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "ISBN=" + ISBN + ", Titulo='" + Titulo + '\'' + ", anio=" + anio;
    }
}