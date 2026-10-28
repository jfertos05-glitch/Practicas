package Funciones;
import java.util.Scanner;
import java.util.Arrays;

public class funcionesEj19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Que tipo de numero quieres poner (1-4) (Decimal, binario, octal y hexadecimal): ");
        int tipoNumeroOriginal = sc.nextInt();
        System.out.print("En que tipo de numero quieres transformarlo (1-4) (Decimal, binario, octal y hexadecimal): ");
        int tipoNumeroATransformar = sc.nextInt();

        if (tipoNumeroOriginal == tipoNumeroATransformar) {
            System.out.println("No pueden ser el mismo tipo");
        } else {

            if (tipoNumeroOriginal == 1) {

                System.out.print("Dime el número a transformar: ");
                int numeroATransformar = sc.nextInt();
                int numeroTransformado = 0;
                int numeroDivisor = 0;

                if (tipoNumeroATransformar == 2) {
                    numeroTransformado = 1;
                    numeroDivisor = 2;

                    while (numeroATransformar > 0) {
                        numeroTransformado = matematicas.Varias.pegaPorDetras(numeroTransformado, (numeroATransformar % numeroDivisor));
                        numeroATransformar = numeroATransformar / numeroDivisor;
                    }

                    numeroTransformado = matematicas.Varias.voltea(numeroTransformado);
                    numeroTransformado = numeroTransformado / 10;

                    System.out.println("El número es: " + numeroTransformado);

                } else if (tipoNumeroATransformar == 3) {

                    numeroTransformado = 1;
                    numeroDivisor = 8;

                    while (numeroATransformar > 0) {
                        numeroTransformado = matematicas.Varias.pegaPorDetras(numeroTransformado, (numeroATransformar % numeroDivisor));
                        numeroATransformar = numeroATransformar / numeroDivisor;
                    }

                    numeroTransformado = matematicas.Varias.voltea(numeroTransformado);
                    numeroTransformado = numeroTransformado / 10;

                    System.out.println("El número es: " + numeroTransformado);

                } else if (tipoNumeroATransformar ==4) {

                    int contador = 0;
                    int numeroATransformar2 = numeroATransformar;
                    numeroDivisor = 16;

                    while (numeroATransformar > 0) {
                        numeroATransformar = numeroATransformar / numeroDivisor;
                        contador++;
                    }

                    String[] numeroTransformadoH = new String[contador];

                    while (numeroATransformar2 > 0) {

                        if (numeroATransformar2%2 == 10) {
                            numeroTransformadoH[contador] = "A";
                            contador--;
                        } else if (numeroATransformar2%2 == 11) {
                            numeroTransformadoH[contador] = "B";
                            contador--;
                        } else if (numeroATransformar2%2 == 12) {
                            numeroTransformadoH[contador] = "C";
                            contador--;
                        } else if (numeroATransformar2%2 == 13) {
                            numeroTransformadoH[contador] = "D";
                            contador--;
                        } else if (numeroATransformar2%2 == 14) {
                            numeroTransformadoH[contador] = "E";
                            contador--;
                        } else if (numeroATransformar2%2 == 15) {
                            numeroTransformadoH[contador] = "F";
                            contador--;
                        }

                        numeroATransformar2 = numeroATransformar2 / numeroDivisor;

                    }

                    System.out.print("El número es: ");
                    for (int i = 0; i < numeroTransformadoH.length; i++) {
                        System.out.print(numeroTransformadoH[i]);
                    }

                } else {
                    System.out.println("Número no válido");
                }

            } else if (tipoNumeroOriginal == 2) {

                System.out.print("Dime el número a transformar: ");
                int numeroATransformar = sc.nextInt();

                if (tipoNumeroATransformar == 1) {

                } else if (tipoNumeroATransformar == 3) {

                } else if (tipoNumeroATransformar ==4) {

                } else {
                    System.out.println("Número no válido");
                }

            } else if (tipoNumeroOriginal == 3) {

                System.out.print("Dime el número a transformar: ");
                int numeroATransformar = sc.nextInt();

                if (tipoNumeroATransformar == 1) {

                } else if (tipoNumeroATransformar == 2) {

                } else if (tipoNumeroATransformar ==4) {

                } else {
                    System.out.println("Número no válido");
                }

            } else if (tipoNumeroOriginal == 4) {

                System.out.print("Dime el número a transformar: ");
                int numeroATransformar = sc.nextInt();

                if (tipoNumeroATransformar == 1) {

                } else if (tipoNumeroATransformar == 2) {

                } else if (tipoNumeroATransformar ==3) {

                } else {
                    System.out.println("Número no válido");
                }

            } else {
                System.out.println("Número no válido");
            }

        }
    }
}
