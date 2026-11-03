package Funciones;
import java.util.Scanner;

public class funcionesEj18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime un numero en decimal: ");
        int numDecimal = sc.nextInt();

        int numTraducido = 1;

        if (numDecimal == 0) {
            numTraducido = 0;
        } else {

            while (numDecimal > 0) {
                numTraducido = Varias.pegaPorDetras(numTraducido, (numDecimal % 2));
                numDecimal = numDecimal / 2;
            }

            numTraducido = Varias.voltea(numTraducido);

            numTraducido = Varias.quitaPorDetras(numTraducido, 1);
        }

        System.out.println("El número en binario es: " + numTraducido);
    }
}
