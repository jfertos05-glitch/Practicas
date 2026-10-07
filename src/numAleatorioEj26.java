import java.util.Scanner;
public class numAleatorioEj26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca la altura: ");
        int altura = teclado.nextInt();
        System.out.print("por favor. introduzca la anchura: ");
        int anchura = teclado.nextInt();
        int bocadoAltura = (int)(Math.random()*altura)+1;
        int bocadoAnchura1 = (int)(Math.random()*anchura)+1;
        int bocadoAnchura2 = (int)(Math.random()*2)+1;

        if (bocadoAltura == 1 || bocadoAltura == altura) { //ya funciona

            for (int i = 0; i < altura; i++) {

                for (int a = 0; a < anchura; a++) {

                    if (a == bocadoAnchura1-1 && i == bocadoAltura - 1) {

                        System.out.print(" ");

                    } else {

                        System.out.print("*");

                    }
                }

                System.out.println("");

            }

        } else {

            for (int i = 0; i < altura; i++) {

                for (int a = 0; a < anchura; a++) {

                    if (bocadoAltura == i + 1 && bocadoAnchura2 == 1 && a == 0) {

                        System.out.print(" ");

                    } else {

                        if (bocadoAltura == i + 1 && bocadoAnchura2 == 2 && a == anchura - 1) {

                            System.out.print(" ");

                        } else {

                            System.out.print("*");

                        }

                    }

                }

                System.out.println("");

            }

        }
    }
}