package Funciones;

public class funcionesEj51 {
    public static void main(String[] args) {
        int[] numeros = new int [10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = (int)(Math.random()*101)+2;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("El número " + numeros[i]);

            if (Varias.esPrimo(numeros[i])) {
                System.out.print(" es primo y ");
            } else {
                System.out.print(" no es primo y ");
            }

            if (Varias.esCapicua(numeros[i])) {
                System.out.print("es capicua\n");
            } else {
                System.out.print("no es capicua\n");
            }
        }
    }
}
