import java.util.Scanner;
public class numAleatorioEj20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, indique la capacidad de la cuba en litros: ");
        int capacidad = teclado.nextInt();
        int agua = (int)(Math.random()*(capacidad))+0;;
        int contador = capacidad;

        for (int i = 0; i <= capacidad; i++) {

            if (i == capacidad) {

                System.out.println("******");

            } else if (agua >= contador) {

                System.out.println("*====*");
                contador--;

            } else {

                System.out.println("*    *");
                contador--;

            }

        }

        System.out.print("El nivel del agua es " + agua);

    }
}
