package POO.Ejercicio2;
import java.util.Scanner;

public class pooEj2 {

    static class Vehiculo {

        static int vehiculosCreados = 0;
        static int kilometrosTotales = 0;

        int kilometrosRecorridos = 0;

        public Vehiculo() {
            vehiculosCreados++;
        }

        public void anda(int kilometros) {
            kilometrosRecorridos += kilometros;
            kilometrosTotales += kilometros;
        }
    }

    static class Bicicleta extends Vehiculo {

        public void caballito() {
            System.out.println("Estoy haciendo el caballito con la bicicleta.");
        }
    }

    static class Coche extends Vehiculo {

        public void quemaRueda() {
            System.out.println("Estoy quemando rueda con el coche.");
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();

        int opcion;

        do {
            System.out.println("\nVEHÍCULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");

            System.out.print("Elige una opción (1-8): ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("¿Cuántos kilómetros quieres recorrer? ");
                    int kmBici = teclado.nextInt();
                    bicicleta.anda(kmBici);
                    break;

                case 2:
                    bicicleta.caballito();
                    break;

                case 3:
                    System.out.print("¿Cuántos kilómetros quieres recorrer? ");
                    int kmCoche = teclado.nextInt();
                    coche.anda(kmCoche);
                    break;

                case 4:
                    coche.quemaRueda();
                    break;

                case 5:
                    System.out.println("La bicicleta ha recorrido " + bicicleta.kilometrosRecorridos + " km.");
                    break;

                case 6:
                    System.out.println("El coche ha recorrido " + coche.kilometrosRecorridos + " km.");
                    break;

                case 7:
                    System.out.println("Kilómetros totales recorridos: " + Vehiculo.kilometrosTotales + " km.");
                    break;

                case 8:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 8);
    }
}