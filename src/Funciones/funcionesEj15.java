package Funciones;

public class funcionesEj15 {
    public static void main(String[] args) {

        System.out.print("Los números primos son: ");

        for (int i = 0; i <1000; i++) {
            if (matematicas.Varias.esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
