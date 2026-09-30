import java.util.Scanner;

public class numAleatorioEj17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, introduzca la altura (mínimo 4)");
        int altura = teclado.nextInt();
        System.out.println("Por favor, introduzca la anchura (mínimo 4)");
        int anchura = teclado.nextInt();
        int alturaPez = (int)(Math.random()*(altura-2))+1;
        int anchuraPez = (int)(Math.random()*(anchura-2))+1;


        for (int i = 0; i < altura; i++) {

            for (int a = 0; a < anchura; a++) {

                if (i == 0 || i == altura-1) {

                    System.out.print("*");

                } else {

                    if (a == 0 || a == anchura - 1) {

                        System.out.print("*");

                    } else {

                        if (a == anchuraPez && i == alturaPez) {

                            System.out.print("&");

                        } else {

                            System.out.print(" ");

                        }

                    }

                }

            }

            System.out.println("");

        }

    }
}
