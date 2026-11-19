package POO.Ejercicio10;

public class Ameba {
    protected int peso = 3;

    public Ameba() {
        this.peso = peso;
    }

    public void come(int cantidad) {
        this.peso += cantidad - 1;
    }

    public void come(Ameba a) {
        this.peso += a.peso -1;
        a.peso = 0;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String toString() {
        return "El peso es " + peso;
    }
}