package POO.Ejercicio9;
import POO.Ejercicio8.Terminal;

public class Movil extends Terminal {
    protected String tarifa;
    protected double totalTarificado;

    public Movil(String num, String tarifa) {
        super(num);
        this.tarifa = tarifa;
    }

    @Override
    public void llamar(Terminal t, int segundosDeLlamada) {
        super.llamar(t, segundosDeLlamada);
        double minutos = (double) segundosDeLlamada / 60;
        switch (this.tarifa) {
            case "rata":
                this.totalTarificado += minutos * 0.06;
                break;
            case "mono":
                this.totalTarificado += minutos * 0.12;
                break;
            case "bisonte":
                this.totalTarificado += minutos * 0.30;
                break;
            default:
        }
    }


    @Override
    public String toString(){
        return numero + " - " + tiempo + " segundos de conversación" + " que son un total de " + totalTarificado;
    }

}