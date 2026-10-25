package ArraysBidimensionales;

import java.util.Scanner;

public class arrayBiEj10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arrayBiNumeros = new String[3][3];
        boolean victoria = false;
        boolean derrota = false;
        int x = 0;
        int y = 0;

        while (!victoria && !derrota) {
            System.out.println("En que posicion quieres poner la x (fila y columna)");

            do {
                x = sc.nextInt();
                y = sc.nextInt();

                if (x < 0 || x >= 3 || y < 0 || y >= 3) {
                    System.out.println("Pon valores entre 0 y 2");
                } else if (arrayBiNumeros[x][y] != null) {
                    System.out.println("Esa posicion esta ocupada");
                }

            } while (x < 0 || x >= 3 || y < 0 || y >= 3
                    || arrayBiNumeros[x][y] != null);

            arrayBiNumeros[x][y] = "x";

            // Comprobar victoria del jugador
            for (int fila = 0; fila < 3; fila++) {
                if (arrayBiNumeros[fila][0] != null && arrayBiNumeros[fila][0].equals("x") && arrayBiNumeros[fila][1] != null && arrayBiNumeros[fila][1].equals("x") && arrayBiNumeros[fila][2] != null && arrayBiNumeros[fila][2].equals("x")) {
                    victoria = true;
                }
            }

            for (int columna = 0; columna < 3; columna++) {
                if (arrayBiNumeros[0][columna] != null && arrayBiNumeros[0][columna].equals("x") && arrayBiNumeros[1][columna] != null && arrayBiNumeros[1][columna].equals("x") && arrayBiNumeros[2][columna] != null && arrayBiNumeros[2][columna].equals("x")) {
                    victoria = true;
                }
            }

            if (arrayBiNumeros[0][0] != null && arrayBiNumeros[0][0].equals("x") && arrayBiNumeros[1][1] != null && arrayBiNumeros[1][1].equals("x") && arrayBiNumeros[2][2] != null && arrayBiNumeros[2][2].equals("x")) {
                victoria = true;
            }

            if (arrayBiNumeros[0][2] != null && arrayBiNumeros[0][2].equals("x") && arrayBiNumeros[1][1] != null && arrayBiNumeros[1][1].equals("x") && arrayBiNumeros[2][0] != null && arrayBiNumeros[2][0].equals("x")) {
                victoria = true;
            }

            // Si el jugador no ha ganado, juega la maquina
            if (!victoria) {
                boolean tableroLleno = true;

                for (int fila = 0; fila < 3; fila++) {
                    for (int columna = 0; columna < 3; columna++) {
                        if (arrayBiNumeros[fila][columna] == null) {
                            tableroLleno = false;
                        }
                    }
                }

                if (tableroLleno) {
                    break;
                }

                do {
                    x = (int) (Math.random() * 3);
                    y = (int) (Math.random() * 3);
                } while (arrayBiNumeros[x][y] != null);

                arrayBiNumeros[x][y] = "y";
            }

            // Cabecera
            System.out.printf("\n| %-6s |", "Tesoro");

            for (int columna = 0; columna < arrayBiNumeros[0].length; columna++) {
                System.out.printf(" %-6s |", " x " + columna);
            }

            System.out.println();

            // Linea separadora
            System.out.print("---------------");

            for (int columna = 0; columna < arrayBiNumeros[0].length; columna++) {
                System.out.print("--------");
            }

            System.out.println();

            // Filas y valores
            for (int fila = 0; fila < arrayBiNumeros.length; fila++) {

                System.out.printf("| %-6s |", " y " + fila);

                for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {

                    String valor = arrayBiNumeros[fila][columna];

                    if (valor == null) {
                        System.out.printf(" %-6s |", "");
                    } else {
                        System.out.printf(" %-6s |", valor);
                    }
                }

                System.out.println();
            }

            // Comprobar victoria de la maquina
            for (int fila = 0; fila < 3; fila++) {
                if (arrayBiNumeros[fila][0] != null && arrayBiNumeros[fila][0].equals("y") && arrayBiNumeros[fila][1] != null && arrayBiNumeros[fila][1].equals("y") && arrayBiNumeros[fila][2] != null && arrayBiNumeros[fila][2].equals("y")) {
                    derrota = true;
                }
            }

            for (int columna = 0; columna < 3; columna++) {
                if (arrayBiNumeros[0][columna] != null && arrayBiNumeros[0][columna].equals("y") && arrayBiNumeros[1][columna] != null && arrayBiNumeros[1][columna].equals("y") && arrayBiNumeros[2][columna] != null && arrayBiNumeros[2][columna].equals("y")) {
                    derrota = true;
                }
            }

            if (arrayBiNumeros[0][0] != null && arrayBiNumeros[0][0].equals("y") && arrayBiNumeros[1][1] != null && arrayBiNumeros[1][1].equals("y") && arrayBiNumeros[2][2] != null && arrayBiNumeros[2][2].equals("y")) {
                derrota = true;
            }

            if (arrayBiNumeros[0][2] != null && arrayBiNumeros[0][2].equals("y") && arrayBiNumeros[1][1] != null && arrayBiNumeros[1][1].equals("y") && arrayBiNumeros[2][0] != null && arrayBiNumeros[2][0].equals("y")) {
                derrota = true;
            }
        }

        if (victoria) {
            System.out.println("Has ganado.");
        } else if (derrota) {
            System.out.println("Has perdido.");
        } else {
            System.out.println("Empate.");
        }
    }
}