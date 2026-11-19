package POO.Ejercicio11;

public class TarjetaRegalo {
    protected int codigo = (int)((Math.random()*90000) + 10000);
    protected double saldo;

    public TarjetaRegalo (double saldo) {
        this.saldo = saldo;
    }

    public void gastar(double gasto) {
        if (gasto > saldo) {
            System.out.print("¡Error!, saldo insuficiente");
        } else {
            this.saldo -= gasto;
        }
    }

    public TarjetaRegalo fusionarTarjeta (TarjetaRegalo t) { // método que devulve un nuevo objeto
        double saldoTotal = this.saldo + t.saldo;
        this.saldo = 0;
        t.saldo = 0;
        return new TarjetaRegalo(saldoTotal);
    }

    public String toString() {
        return "La tarjera " + codigo + " tiene un saldo de " + saldo;
    }
}