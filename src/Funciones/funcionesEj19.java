
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
                        numeroTransformado = matematicas.Varias.pegaPorDetras(
                                numeroTransformado, numeroATransformar % numeroDivisor);
                        numeroATransformar = numeroATransformar / numeroDivisor;
                    }

                    numeroTransformado = matematicas.Varias.voltea(numeroTransformado);
                    numeroTransformado = numeroTransformado / 10;

                    System.out.println("El número es: " + numeroTransformado);

                } else if (tipoNumeroATransformar == 3) {

                    numeroTransformado = 1;
                    numeroDivisor = 8;

                    while (numeroATransformar > 0) {
                        numeroTransformado = matematicas.Varias.pegaPorDetras(
                                numeroTransformado, numeroATransformar % numeroDivisor);
                        numeroATransformar = numeroATransformar / numeroDivisor;
                    }

                    numeroTransformado = matematicas.Varias.voltea(numeroTransformado);
                    numeroTransformado = numeroTransformado / 10;

                    System.out.println("El número es: " + numeroTransformado);

                } else if (tipoNumeroATransformar == 4) {

                    int contador = 0;
                    int numeroATransformar2 = numeroATransformar;
                    numeroDivisor = 16;

                    while (numeroATransformar > 0) {
                        numeroATransformar = numeroATransformar / numeroDivisor;
                        contador++;
                    }

                    if (contador == 0) {
                        contador = 1;
                    }

                    String[] numeroTransformadoH = new String[contador];
                    int indice = contador - 1;

                    if (numeroATransformar2 == 0) {
                        numeroTransformadoH[0] = "0";
                    } else {
                        while (numeroATransformar2 > 0) {

                            if (numeroATransformar2 % 16 < 10) {
                                numeroTransformadoH[indice] =
                                        String.valueOf(numeroATransformar2 % 16);
                            } else if (numeroATransformar2 % 16 == 10) {
                                numeroTransformadoH[indice] = "A";
                            } else if (numeroATransformar2 % 16 == 11) {
                                numeroTransformadoH[indice] = "B";
                            } else if (numeroATransformar2 % 16 == 12) {
                                numeroTransformadoH[indice] = "C";
                            } else if (numeroATransformar2 % 16 == 13) {
                                numeroTransformadoH[indice] = "D";
                            } else if (numeroATransformar2 % 16 == 14) {
                                numeroTransformadoH[indice] = "E";
                            } else if (numeroATransformar2 % 16 == 15) {
                                numeroTransformadoH[indice] = "F";
                            }

                            indice--;
                            numeroATransformar2 = numeroATransformar2 / numeroDivisor;
                        }
                    }

                    System.out.print("El número es: ");
                    for (int i = 0; i < numeroTransformadoH.length; i++) {
                        System.out.print(numeroTransformadoH[i]);
                    }
                    System.out.println();

                } else {
                    System.out.println("Número no válido");
                }

            } else if (tipoNumeroOriginal == 2) {

                System.out.print("Dime el número a transformar: ");
                int numeroATransformar = sc.nextInt();
                int numeroTransformado = 0;
                int contador = matematicas.Varias.digitos(numeroATransformar) - 1;
                int numeroDivisor = 0;

                if (tipoNumeroATransformar == 1) {

                    for (int i = 0; i < matematicas.Varias.digitos(numeroATransformar); i++) {
                        int num1 = matematicas.Varias.digitoN(numeroATransformar, i);
                        numeroTransformado = (int) (numeroTransformado
                                + num1 * matematicas.Varias.potencia(2, contador));
                        contador--;
                    }

                    System.out.println("El número es: " + numeroTransformado);

                } else if (tipoNumeroATransformar == 3) {

                    for (int i = 0; i < matematicas.Varias.digitos(numeroATransformar); i++) {
                        int num1 = matematicas.Varias.digitoN(numeroATransformar, i);
                        numeroTransformado = (int) (numeroTransformado
                                + num1 * matematicas.Varias.potencia(2, contador));
                        contador--;
                    }

                    int numeroATransformar2 = numeroTransformado;
                    numeroTransformado = 1;
                    numeroDivisor = 8;

                    while (numeroATransformar2 > 0) {
                        numeroTransformado = matematicas.Varias.pegaPorDetras(
                                numeroTransformado, numeroATransformar2 % numeroDivisor);
                        numeroATransformar2 = numeroATransformar2 / numeroDivisor;
                    }

                    numeroTransformado = matematicas.Varias.voltea(numeroTransformado);
                    numeroTransformado = numeroTransformado / 10;

                    System.out.println("El número es: " + numeroTransformado);

                } else if (tipoNumeroATransformar == 4) {

                    for (int i = 0; i < matematicas.Varias.digitos(numeroATransformar); i++) {
                        int num1 = matematicas.Varias.digitoN(numeroATransformar, i);
                        numeroTransformado = (int) (numeroTransformado
                                + num1 * matematicas.Varias.potencia(2, contador));
                        contador--;
                    }

                    numeroATransformar = numeroTransformado;

                    int contador2 = 1;
                    int numeroATransformar2 = numeroATransformar;
                    numeroDivisor = 16;

                    while (numeroATransformar >= 16) {
                        numeroATransformar = numeroATransformar / numeroDivisor;
                        contador2++;
                    }

                    String[] numeroTransformadoH = new String[contador2];
                    int indice = contador2 - 1;

                    if (numeroATransformar2 == 0) {
                        numeroTransformadoH[0] = "0";
                    } else {
                        while (numeroATransformar2 > 0) {

                            if (numeroATransformar2 % 16 < 10) {
                                numeroTransformadoH[indice] =
                                        String.valueOf(numeroATransformar2 % 16);
                            } else if (numeroATransformar2 % 16 == 10) {
                                numeroTransformadoH[indice] = "A";
                            } else if (numeroATransformar2 % 16 == 11) {
                                numeroTransformadoH[indice] = "B";
                            } else if (numeroATransformar2 % 16 == 12) {
                                numeroTransformadoH[indice] = "C";
                            } else if (numeroATransformar2 % 16 == 13) {
                                numeroTransformadoH[indice] = "D";
                            } else if (numeroATransformar2 % 16 == 14) {
                                numeroTransformadoH[indice] = "E";
                            } else if (numeroATransformar2 % 16 == 15) {
                                numeroTransformadoH[indice] = "F";
                            }

                            indice--;
                            numeroATransformar2 = numeroATransformar2 / numeroDivisor;
                        }
                    }

                    System.out.print("El número es: ");
                    for (int i = 0; i < numeroTransformadoH.length; i++) {
                        System.out.print(numeroTransformadoH[i]);
                    }
                    System.out.println();

                } else {
                    System.out.println("Número no válido");
                }

            } else if (tipoNumeroOriginal == 3) {

                System.out.print("Dime el número a transformar: ");
                int numeroATransformar = sc.nextInt();
                int numeroTransformado = 0;
                int contador = matematicas.Varias.digitos(numeroATransformar) - 1;
                int numeroDivisor = 0;

                if (tipoNumeroATransformar == 1) {

                    for (int i = 0; i < matematicas.Varias.digitos(numeroATransformar); i++) {
                        int num1 = matematicas.Varias.digitoN(numeroATransformar, i);
                        numeroTransformado = (int) (numeroTransformado
                                + num1 * matematicas.Varias.potencia(8, contador));
                        contador--;
                    }

                    System.out.println("El número es: " + numeroTransformado);

                } else if (tipoNumeroATransformar == 2) {

                    for (int i = 0; i < matematicas.Varias.digitos(numeroATransformar); i++) {
                        int num1 = matematicas.Varias.digitoN(numeroATransformar, i);
                        numeroTransformado = (int) (numeroTransformado
                                + num1 * matematicas.Varias.potencia(8, contador));
                        contador--;
                    }

                    int numeroATransformar2 = numeroTransformado;
                    numeroTransformado = 1;
                    numeroDivisor = 2;

                    while (numeroATransformar2 > 0) {
                        numeroTransformado = matematicas.Varias.pegaPorDetras(
                                numeroTransformado, numeroATransformar2 % numeroDivisor);
                        numeroATransformar2 = numeroATransformar2 / numeroDivisor;
                    }

                    numeroTransformado = matematicas.Varias.voltea(numeroTransformado);
                    numeroTransformado = numeroTransformado / 10;

                    System.out.println("El número es: " + numeroTransformado);

                } else if (tipoNumeroATransformar == 4) {

                    for (int i = 0; i < matematicas.Varias.digitos(numeroATransformar); i++) {
                        int num1 = matematicas.Varias.digitoN(numeroATransformar, i);
                        numeroTransformado = (int) (numeroTransformado
                                + num1 * matematicas.Varias.potencia(8, contador));
                        contador--;
                    }

                    int contador2 = 1;
                    int numeroATransformar2 = numeroTransformado;
                    numeroDivisor = 16;

                    while (numeroTransformado >= 16) {
                        numeroTransformado = numeroTransformado / numeroDivisor;
                        contador2++;
                    }

                    String[] numeroTransformadoH = new String[contador2];
                    int indice = contador2 - 1;

                    if (numeroATransformar2 == 0) {
                        numeroTransformadoH[0] = "0";
                    } else {
                        while (numeroATransformar2 > 0) {

                            if (numeroATransformar2 % 16 < 10) {
                                numeroTransformadoH[indice] =
                                        String.valueOf(numeroATransformar2 % 16);
                            } else if (numeroATransformar2 % 16 == 10) {
                                numeroTransformadoH[indice] = "A";
                            } else if (numeroATransformar2 % 16 == 11) {
                                numeroTransformadoH[indice] = "B";
                            } else if (numeroATransformar2 % 16 == 12) {
                                numeroTransformadoH[indice] = "C";
                            } else if (numeroATransformar2 % 16 == 13) {
                                numeroTransformadoH[indice] = "D";
                            } else if (numeroATransformar2 % 16 == 14) {
                                numeroTransformadoH[indice] = "E";
                            } else if (numeroATransformar2 % 16 == 15) {
                                numeroTransformadoH[indice] = "F";
                            }

                            indice--;
                            numeroATransformar2 = numeroATransformar2 / numeroDivisor;
                        }
                    }

                    System.out.print("El número es: ");
                    for (int i = 0; i < numeroTransformadoH.length; i++) {
                        System.out.print(numeroTransformadoH[i]);
                    }
                    System.out.println();

                } else {
                    System.out.println("Número no válido");
                }

            } else if (tipoNumeroOriginal == 4) {

                System.out.print("Dime el número a transformar: ");
                String numeroHexadecimal = sc.next().toUpperCase();
                int numeroATransformar = 0;

                for (int i = 0; i < numeroHexadecimal.length(); i++) {
                    char digito = numeroHexadecimal.charAt(i);
                    int valor;

                    if (digito >= '0' && digito <= '9') {
                        valor = digito - '0';
                    } else {
                        valor = digito - 'A' + 10;
                    }

                    numeroATransformar = numeroATransformar * 16 + valor;
                }

                int numeroTransformado = 0;
                int numeroDivisor = 0;

                if (tipoNumeroATransformar == 1) {

                    System.out.println("El número es: " + numeroATransformar);

                } else if (tipoNumeroATransformar == 2) {

                    numeroTransformado = 1;
                    numeroDivisor = 2;
                    int numeroATransformar2 = numeroATransformar;

                    while (numeroATransformar2 > 0) {
                        numeroTransformado = matematicas.Varias.pegaPorDetras(
                                numeroTransformado, numeroATransformar2 % numeroDivisor);
                        numeroATransformar2 = numeroATransformar2 / numeroDivisor;
                    }

                    numeroTransformado = matematicas.Varias.voltea(numeroTransformado);
                    numeroTransformado = numeroTransformado / 10;

                    System.out.println("El número es: " + numeroTransformado);

                } else if (tipoNumeroATransformar == 3) {

                    numeroTransformado = 1;
                    numeroDivisor = 8;
                    int numeroATransformar2 = numeroATransformar;

                    while (numeroATransformar2 > 0) {
                        numeroTransformado = matematicas.Varias.pegaPorDetras(
                                numeroTransformado, numeroATransformar2 % numeroDivisor);
                        numeroATransformar2 = numeroATransformar2 / numeroDivisor;
                    }

                    numeroTransformado = matematicas.Varias.voltea(numeroTransformado);
                    numeroTransformado = numeroTransformado / 10;

                    System.out.println("El número es: " + numeroTransformado);

                } else {
                    System.out.println("Número no válido");
                }

            } else {
                System.out.println("Número no válido");
            }
        }
    }
}
