package POO.Ejercicio7;
import java.util.Scanner;

public class pooEj7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        Zona zona1 = new Zona(1000);
        Zona zona2 = new Zona(200);
        Zona zona3 = new Zona(25);

        do {
            System.out.println("1. Mostrar número de entradas libres\n" + "2. Vender entradas\n" + "3. Salir");
            opcion = sc.nextInt();
            int opcionZona = 0;

            if (opcion == 1) {
                System.out.println("¿De cuales de las 3 zonas? (1, 2 o 3)");
                opcionZona = sc.nextInt();

                if (opcionZona == 1) {
                    System.out.println("Entradas disponibles: " + zona1.getEntradasPorVender());
                } else if (opcionZona == 2) {
                    System.out.println("Entradas disponibles: " + zona2.getEntradasPorVender());
                } else if (opcionZona == 3) {
                    System.out.println("Entradas disponibles: " + zona3.getEntradasPorVender());
                }
            } else if (opcion == 2) {
                System.out.println("¿De cuales de las 3 zonas? (1,2 o 3)");
                opcionZona = sc.nextInt();
                System.out.println("¿Que cantidad?");
                int cantidad = sc.nextInt();

                if (opcionZona == 1) {
                    zona1.vender(cantidad);
                } else if (opcionZona == 2) {
                    zona2.vender(cantidad);
                } else if (opcionZona == 3) {
                    zona3.vender(cantidad);
                } else {
                    System.out.println("Número invalido");
                }
            }
        } while (opcion != 3);

    }
}