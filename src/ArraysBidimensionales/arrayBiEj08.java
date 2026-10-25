package ArraysBidimensionales;
import java.util.Scanner;

public class arrayBiEj08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la columna (a-h): ");
        char columna = sc.next().charAt(0);

        System.out.print("Introduce la fila (1-8): ");
        int fila = sc.nextInt();

        System.out.println("El alfil puede moverse a las siguientes casillas:");

        for (char columnaCasilla = 'a'; columnaCasilla <= 'h'; columnaCasilla++) {
            for (int filaCasilla = 1; filaCasilla <= 8; filaCasilla++) {

                if (Math.abs(columna - columnaCasilla) == Math.abs(fila - filaCasilla)) {
                    if (columna != columnaCasilla || fila != filaCasilla) {

                        System.out.println(columnaCasilla + "" + filaCasilla);

                    }
                }
            }
        }
    }
}