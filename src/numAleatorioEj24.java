import  java.util.Scanner;
public class numAleatorioEj24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numeroIntroducido = teclado.nextLong();
        long numero = numeroIntroducido;
        int longitud = 0;
        long resultado = 0;

        do {
            numero = numero / 10;
            longitud++;

        } while (numero > 0);

        numero = numeroIntroducido;

        int digitoElegido = (int)(Math.random()*longitud)+1;

        for (int i = 0; i < digitoElegido; i++) {

            if (i == digitoElegido - 1) {

                resultado = numero % 10;

            } else {

                numero = numero / 10;

            }

        }

        System.out.println("El digito que ha salido es " + resultado);
    }
}
