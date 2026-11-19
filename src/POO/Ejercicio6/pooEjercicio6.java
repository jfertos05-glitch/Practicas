package POO.Ejercicio6;
import java.util.Scanner;

public class pooEjercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tiempo inicial:");
        System.out.print("Horas: ");
        int h = sc.nextInt();

        System.out.print("Minutos: ");
        int m = sc.nextInt();

        System.out.print("Segundos: ");
        int s = sc.nextInt();

        Tiempo t = new Tiempo(h, m, s);

        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Sumar tiempo");
            System.out.println("2. Restar tiempo");
            System.out.println("3. Mostrar tiempo actual");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Introduce el tiempo que quieres sumar:");

                    System.out.print("Horas: ");
                    h = sc.nextInt();

                    System.out.print("Minutos: ");
                    m = sc.nextInt();

                    System.out.print("Segundos: ");
                    s = sc.nextInt();

                    Tiempo t2 = new Tiempo(h, m, s);
                    t.suma(t2);

                    System.out.println("Resultado: " + t);
                    break;

                case 2:
                    System.out.println("Introduce el tiempo que quieres restar:");

                    System.out.print("Horas: ");
                    h = sc.nextInt();

                    System.out.print("Minutos: ");
                    m = sc.nextInt();

                    System.out.print("Segundos: ");
                    s = sc.nextInt();

                    Tiempo t3 = new Tiempo(h, m, s);
                    t.resta(t3);

                    System.out.println("Resultado: " + t);
                    break;

                case 3:
                    System.out.println("Tiempo actual: " + t);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}