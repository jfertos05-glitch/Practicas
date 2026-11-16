package POO.Ejercicio4;
import java.util.Scanner;

public class pooEj4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor dime el numerador y el denominador: ");
        int num = sc.nextInt();
        int den = sc.nextInt();

        Fraccion f1 = new Fraccion(num, den);

        System.out.println("\n ¿Quieres hacer algo: ?");
        System.out.println("1. Invierte");
        System.out.println("2. Simplifica");
        System.out.println("3. Multiplica");
        System.out.println("4. Divide");
        System.out.println("Otro. Salir");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            f1.invierte();
            f1.mostrar();
        } else if (opcion == 2) {
            System.out.println("Ni puta idea de que es");
        } else if (opcion == 3) {
            double resultado = f1.multiplica();
            System.out.println(resultado);
        } else if (opcion == 4) {
            double resultado = f1.dividir();
            System.out.println(resultado);
        } else {
            System.out.println("Adios");
        }

    }
}
