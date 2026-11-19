package POO.Ejercicio12;

public class Libro extends Publicacion implements Prestable {

    protected boolean prestado = false;

    public Libro(int ISBN, String Titulo, int anio) {
        super(ISBN, Titulo, anio);
    }

    @Override
    public void presta() {
        if (prestado == false) {
            System.out.println("¡Claro!, te prestamos el libro");
            prestado = true;
        } else {
            System.out.println("Ese libro ya ha sido prestado");
        }
    }

    @Override
    public void devuelve() {
        if (prestado == true) {
            System.out.println("¡Gracias por devolverlo!");
            prestado = false;
        } else {
            System.out.println("Ese libro no está prestado");
        }
    }

    @Override
    public boolean estaPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prestado: " + prestado;
    }
}