import java.util.Scanner;

public class numAleatorioEj31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuánto dinero quiere apostar? ");
        int dinero = sc.nextInt();

        int dado1 = (int) (Math.random() * 6 + 1);
        int dado2 = (int) (Math.random() * 6 + 1);
        int suma = dado1 + dado2;

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Suma: " + suma);

        switch (suma) {
            case 7:
            case 11:
                System.out.println("¡Enhorabuena! ¡Ha ganado otros "
                        + dinero + " €!");
                System.out.println("¡Ahora tiene " + dinero * 2 + " €!");
                break;

            case 2:
            case 3:
            case 12:
                System.out.println("Lo siento, ha perdido todo su dinero.");
                break;

            default:
                System.out.print("Tiene que seguir tirando, debe conseguir el ");
                System.out.println(suma + " para ganar.");
                System.out.println("Si obtiene un 7, perderá la partida.");
                System.out.println("Pulse INTRO para tirar los dados.");

                sc.nextLine(); // Consume el ENTER pendiente de nextInt()

                boolean partidaTerminada = false;

                do {
                    sc.nextLine();

                    dado1 = (int) (Math.random() * 6 + 1);
                    dado2 = (int) (Math.random() * 6 + 1);

                    int sumaTirada = dado1 + dado2;

                    System.out.println("Dado 1: " + dado1);
                    System.out.println("Dado 2: " + dado2);
                    System.out.println("Suma: " + sumaTirada);

                    if (sumaTirada == suma) {
                        System.out.println("¡Enhorabuena! ¡Ha ganado otros " + dinero + " €!");
                        System.out.println("¡Ahora tiene " + dinero * 2 + " €!");
                        partidaTerminada = true;

                    } else if (sumaTirada == 7) {
                        System.out.println("Lo siento, ha perdido todo su dinero.");
                        partidaTerminada = true;

                    } else {
                        System.out.println("Continúe jugando.");
                        System.out.println("Pulse INTRO para tirar los dados.");
                    }

                } while (!partidaTerminada);
        }

        sc.close();
    }
}