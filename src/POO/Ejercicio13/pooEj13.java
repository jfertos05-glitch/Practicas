package POO.Ejercicio13;

public class pooEj13 {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente();
        CuentaCorriente cuenta3 = new CuentaCorriente();
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        cuenta1.ingresar(2000);
        cuenta2.gastar(600);
        cuenta3.ingresar(75);
        cuenta1.gastar(55);
        cuenta2.transferencia(cuenta3, 100);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
    }
}
