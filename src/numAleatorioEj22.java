import java.util.Scanner;
public class numAleatorioEj22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, indica la longitud de la serpiente: ");
        int longitud = teclado.nextInt();
        int numero = 0;
        int espacios = 12;

        for (int i = 1; i < longitud; i++) {

            numero = (int)(Math.random()*3)+1;

            if (i == 1) {

                for (int a = 0; a < espacios; a++) {

                    System.out.print(" ");

                }

                System.out.println("@");

            }

            switch (numero) {
                case 1:
                    espacios = espacios + 1;
                    break;
                case 2:
                    espacios = espacios - 1;
                    break;
                case 3:
                    break;
                default:
                    break;
            }

            for (int a = 0; a < espacios; a++) {

                System.out.print(" ");

            }

            System.out.println("*");

        }

    }
}
