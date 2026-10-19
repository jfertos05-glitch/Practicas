package Arrays;
import java.util.Arrays;

public class arrayEj04 {
    public static void main(String[] args) {

        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < 20; i++) {
            numero[i] = (int)(Math.random()*100)+0;
        }

        for (int i = 0; i < 20; i++) {
            cuadrado[i] = numero[i]*numero[i];
        }

        for (int i = 0; i < 20; i++) {
            cubo[i] = numero[i]*numero[i]*numero[i];
        }

        System.out.printf("%8s | %8s | %8s%n", "Numero", "Cuadrado", "Cubo");
        System.out.println("----------------------------------------");

        for (int i = 0; i < 20; i++) {
            System.out.printf("%8d | %8d | %8d%n", numero[i], cuadrado[i], cubo[i]);
        }

    }
}
