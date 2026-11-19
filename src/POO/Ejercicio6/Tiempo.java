package POO.Ejercicio6;

public class Tiempo {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void suma(Tiempo t) {
        // Convertimos ambos tiempos a segundos
        int total1 = hora * 3600 + minuto * 60 + segundo;
        int total2 = t.hora * 3600 + t.minuto * 60 + t.segundo;

        int total = total1 + total2;

        // Convertimos los segundos a horas, minutos y segundos
        hora = total / 3600;
        minuto = (total % 3600) / 60;
        segundo = total % 60;
    }

    public void resta(Tiempo t) {
        // Convertimos ambos tiempos a segundos
        int total1 = hora * 3600 + minuto * 60 + segundo;
        int total2 = t.hora * 3600 + t.minuto * 60 + t.segundo;

        int total = total1 - total2;

        // Evitamos tiempos negativos
        if (total < 0) {
            total = 0;
        }

        // Convertimos los segundos a horas, minutos y segundos
        hora = total / 3600;
        minuto = (total % 3600) / 60;
        segundo = total % 60;
    }

    public String toString() {
        return hora + "h " + minuto + "m " + segundo + "s";
    }
}
