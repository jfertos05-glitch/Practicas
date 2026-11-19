package POO.Ejercicio1;
import java.util.Scanner;

public class pooEj1 {
    static Scanner sc = new Scanner(System.in);

    public static class Caballo {

        private double altura;
        private double peso;
        private double velocidad;

        public void introducirDatos() {

            System.out.print("Introduce la altura del caballo: ");
            altura = sc.nextDouble();

            System.out.print("Introduce el peso del caballo: ");
            peso = sc.nextDouble();

            System.out.print("Introduce la velocidad del caballo: ");
            velocidad = sc.nextDouble();
        }

        public double conseguirAltura() {
            return altura;
        }

        public double conseguirPeso() {
            return peso;
        }

        public double conseguirVelocidad() {
            return velocidad;
        }

        public double conseguirTiempoRecorrido(int metros) {

            double velocidadMs = velocidad / 3.6;

            return metros / velocidadMs;
        }
    }

    public static void main(String[] args) {

        // Creamos dos caballos
        Caballo caballo1 = new Caballo();
        Caballo caballo2 = new Caballo();

        int opcion = 0;
        int numeroCaballo;

        while (opcion != 6) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Introducir datos de un caballo");
            System.out.println("2. Ver altura de un caballo");
            System.out.println("3. Ver peso de un caballo");
            System.out.println("4. Ver velocidad de un caballo");
            System.out.println("5. Calcular tiempo de recorrido");
            System.out.println("6. Salir");

            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 5) {

                System.out.println("\n¿Que caballo quieres seleccionar?");
                System.out.println("1. Caballo 1");
                System.out.println("2. Caballo 2");

                numeroCaballo = sc.nextInt();

                Caballo seleccionado;

                if (numeroCaballo == 1) {
                    seleccionado = caballo1;
                } else if (numeroCaballo == 2) {
                    seleccionado = caballo2;
                } else {
                    System.out.println("Caballo incorrecto");
                    continue;
                }

                if (opcion == 1) {

                    seleccionado.introducirDatos();

                } else if (opcion == 2) {

                    System.out.println("Altura: " +
                            seleccionado.conseguirAltura());

                } else if (opcion == 3) {

                    System.out.println("Peso: " +
                            seleccionado.conseguirPeso());

                } else if (opcion == 4) {

                    System.out.println("Velocidad: " +
                            seleccionado.conseguirVelocidad());

                } else if (opcion == 5) {

                    System.out.print("Introduce los metros: ");
                    int metros = sc.nextInt();

                    double tiempo =
                            seleccionado.conseguirTiempoRecorrido(metros);

                    System.out.println("Tiempo: " + tiempo + " segundos");
                }

            } else if (opcion == 6) {

                System.out.println("¡Hasta pronto!");

            } else {

                System.out.println("Opcion incorrecta");
            }
        }
    }
}