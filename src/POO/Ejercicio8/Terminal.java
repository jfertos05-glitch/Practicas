package POO.Ejercicio8;

public class Terminal {
    protected String numero;
    protected int tiempo;

    public Terminal (String num) {
        this.numero = num;
    }

    public void llamar (Terminal t, int duracion) {
        System.out.println("La llamada a durado " + duracion + " segundos.");
        this.tiempo = this.tiempo + duracion;
        t.tiempo = t.tiempo + duracion;
    }

    public String getNumero() {
        return numero;
    }

    public int getTiempo() {
        return tiempo;
    }

    public String toString(){
        return numero + " - " + tiempo + " segundos de conversación";
    }
}