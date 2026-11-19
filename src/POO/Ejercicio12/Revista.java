package POO.Ejercicio12;

public class Revista extends Publicacion {

    protected int numero;

    public Revista(int ISBN, String Titulo, int anio, int numero) {
        super(ISBN, Titulo, anio);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Número: " + numero;
    }
}