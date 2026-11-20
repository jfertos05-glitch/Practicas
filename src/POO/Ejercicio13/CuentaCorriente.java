package POO.Ejercicio13;

public class CuentaCorriente {
    protected long numCuenta = (long)(Math.random() * 9000000000L) + 1000000000L;
    protected double saldo = 0;

    public CuentaCorriente() {
        this.numCuenta = numCuenta;
    }

    public void ingresar(int numeroAIngresar) {
        this.saldo += numeroAIngresar;
    }

    public void gastar(int numeroAGastar) {
        this.saldo -= numeroAGastar;
    }

    public void transferencia (CuentaCorriente c, double cantidad) {
        this.saldo -= cantidad;
        c.saldo += cantidad;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "numCuenta=" + numCuenta + ", saldo=" + saldo + '}';
    }
}
