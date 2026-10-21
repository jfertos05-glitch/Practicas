package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class arrayEj08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrayMes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        int [] arrayTemperaras = new int [12];

        for (int i = 0; i < 12; i++) {
            System.out.print("Por favor, introduzca la temperatura del mes de " + arrayMes[i] + ": ");
            arrayTemperaras[i] = sc.nextInt();
        }

        for (int i = 0; i < 12; i++) {
            System.out.printf("%12s | %3d%n", arrayMes[i], arrayTemperaras[i]);
        }
    }
}
