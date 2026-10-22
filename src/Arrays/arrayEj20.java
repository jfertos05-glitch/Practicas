package Arrays;
import java.util.Scanner;

public class arrayEj20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número total de reyes: ");
        int numReyes = sc.nextInt();
        sc.nextLine(); // Consume el salto de línea del nextInt
        String[] arrayReyes = new String[numReyes];

        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO");

        for (int i = 0; i < numReyes; i++) {
            arrayReyes[i] = sc.nextLine();
        }

        for (int i = 0; i < numReyes; i++) {
            int contadorRey = 0;

            for (int a = 0; a <= i; a++){
                if (arrayReyes[i].equals(arrayReyes[a])){
                    contadorRey++;
                }
            }
            System.out.print("\n" + arrayReyes[i] + " " + contadorRey + "º");
        }
    }
}
