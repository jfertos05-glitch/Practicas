import java.util.Scanner;

public class numAleatorioEj32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la longitud del sendero en metros: ");
        int longitudSendero = sc.nextInt();

        int espaciosPorDelante = 6;

        for (int i = 0; i < longitudSendero; i++) {

            for (int j = 0; j < espaciosPorDelante; j++) {
                System.out.print(" ");
            }

            System.out.print("|");

            int posicionObstaculo = -1;
            char obstaculo = '*'; // planta por defecto

            if ((int) (Math.random() * 2) == 0) { // hay obstáculo

                posicionObstaculo = (int) (Math.random() * 4);

                if ((int) (Math.random() * 2) == 0) { // piedra
                    obstaculo = 'O';
                }
            }

            for (int j = 0; j < 4; j++) {

                if (j == posicionObstaculo) {
                    System.out.print(obstaculo);
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println("|");

            espaciosPorDelante += (int) (Math.random() * 3) - 1;
        }
    }
}