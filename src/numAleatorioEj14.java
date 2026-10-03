import java.util.Scanner;
public class numAleatorioEj14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numIntento = 0;
        int contador = 5;
        String balanza = "";

        System.out.print("Por favor introduzca un número del 0 al 100: ");
        int numeroAdivinatorio = teclado.nextInt();

        System.out.println("");

        while (numeroAdivinatorio != numIntento && contador > 0) {

            if (contador == 5) {

                numIntento = (int)(Math.random()*101) + 0;

                System.out.println("El intento de número a sido " + numIntento);

            }

            if (numeroAdivinatorio != numIntento) {

                contador--;
                System.out.print("El número a adivinar es más pequeño o más grande (debes escribir 'pequeño' o 'grande'): ");
                balanza = teclado.nextLine();

                if (balanza.equals("grande")) {

                    numIntento = (int)(Math.random()*(100 - numIntento)) + numIntento;
                    System.out.println("El intento de número a sido " + numIntento);

                } else if (balanza.equals("pequeño")) {

                    numIntento = (int)(Math.random()*(100 - (100 - numIntento))) + 0;
                    System.out.println("El intento de número a sido " + numIntento);

                } else {

                    System.out.println("Palabra elegida no valida");
                    contador = contador - 5;

                }
            }

        }

        if (numeroAdivinatorio == numIntento) {

            System.out.print("¡el número a sido adivinado!");

        }
    }
}
