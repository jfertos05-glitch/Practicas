package Funciones;
import java.util.Scanner;

public class funcionesEj49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos términos quieres? ");
        int n = scanner.nextInt();

        String texto = "1";

        for (int i = 0; i < n; i++) {
            System.out.print(texto);
            if (i < n - 1) {
                System.out.print(", ");
            }

            String nuevoTexto = "";
            int j = 0;

            while (j < texto.length()) {
                char digito = texto.charAt(j);
                int contador = 0;

                // Contar cuántas veces se repite el dígito seguido
                while (j < texto.length() && texto.charAt(j) == digito) {
                    contador++;
                    j++;
                }

                nuevoTexto = nuevoTexto + contador + digito;
            }

            texto = nuevoTexto;
        }

        System.out.println();
    }
}
