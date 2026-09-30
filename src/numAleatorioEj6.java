import java.util.Scanner;
public class numAleatorioEj6 {
     static void main(String[] args) {

         Scanner teclado = new Scanner(System.in);
         int numIntento = 0;
         int numero = (int)(Math.random()*101)+0;
         int contador = 5;

        System.out.println("Por favor, piense un numero del 0 al 100");

        for (int i = 0; i < 5; i++) {

            numIntento = teclado.nextInt();

            if (numIntento > numero) {

                System.out.println("El número a adivinar es más pequeño");

            } else if (numIntento < numero){

                System.out.println("El número a adivinar es más grande");

            } else {

                System.out.println("¡Has acertado el número!");
                i = i +5;

            }

            contador--;

            if (numIntento != numero) {

                System.out.println("Te quedan " + contador + " intentos");

            }

        }

        System.out.println("El número era " +  numero);

    }
}
