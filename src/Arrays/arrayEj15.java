package Arrays;

import java.util.Scanner;

public class arrayEj15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ocupacion = new int[10];
        int clientes = 0;

        for (int i = 0; i < 10; i++) {
            ocupacion[i] = (int)(Math.random()*5)+0;
        }

        while (clientes != -1) {

            System.out.println("Mesas");

            for (int i = 0; i < 10; i++){
                System.out.printf("| %-2d", i+1);
            }

            System.out.println();
            System.out.println("Ocupación");

            for (int i = 0; i < 10; i++){
                System.out.printf("| %-2d", ocupacion[i]);
            }
            System.out.println();

            boolean capacidadAceptable = false;

            while (!capacidadAceptable) {

                System.out.print("Cuantas personas sois: ");
                clientes = sc.nextInt();

                if (clientes < 5) {
                    capacidadAceptable = true;
                } else {
                    System.out.println("Lo siento, no admitimos grupos de " + clientes + ", haga grupos de 4 personas como máximo e intente de nuevo");
                }

            }

            int contador = 0;
            while (contador < 5){

                for (int i = 0; i < 10; i++) {
                    if (ocupacion[i] == contador && (ocupacion[i] + clientes) < 5) {
                        ocupacion[i] = ocupacion[i] + clientes;
                        contador = contador + 10;
                    }
                }
                contador++;

            }

            if (contador == 5) {
                System.out.println("Lo siento, su grupo no cabe, intente dividir su grupo");
            }

        }
    }
}
