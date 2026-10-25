package ArraysBidimensionales;

import java.util.Scanner;

public class arrayBiEj07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arrayTesoro = new String[5][5];
        int filaBomba = 0;
        int columnaBomba = 0;
        int filaTesoro = 0;
        int columnaTesoro = 0;
        boolean tesoroEncontrado = false;
        boolean bombaEncontrada = false;

        do {
            filaBomba = (int)(Math.random()*5);
            columnaBomba = (int)(Math.random()*5);
            filaTesoro = (int)(Math.random()*5);
            columnaTesoro = (int)(Math.random()*5);

        } while (filaBomba == filaTesoro && columnaBomba == columnaTesoro);

        arrayTesoro[filaBomba][columnaBomba] = "KABOOM";
        arrayTesoro[filaTesoro][columnaTesoro] = "ORO";

        while (!tesoroEncontrado && !bombaEncontrada) {

            System.out.println("Por favor, indique en que posición quieres intentar buscar: ");

            int x = 0;
            int y = 0;

            do {

                x = sc.nextInt();
                y = sc.nextInt();

                if (x >= 5 || y >= 5) {
                    System.out.println("Pon valores aceptables");
                }

            } while (x >= 5 || y >= 5);

            if (arrayTesoro[y][x] == null) {
                arrayTesoro[y][x] = "  X";
            }

            if (arrayTesoro[y][x] == "KABOOM") {
                bombaEncontrada = true;
            }

            if (arrayTesoro[y][x] == "ORO") {
                tesoroEncontrado = true;
            }

            // Cabecera
            System.out.printf("\n| %-6s |", "Tesoro");

            for (int columna = 0; columna < arrayTesoro[0].length; columna++) {
                System.out.printf(" %-6s |", " x " + columna);
            }
            System.out.println();

            // Línea separadora
            System.out.print("---------------");
            for (int columna = 0; columna < arrayTesoro[0].length; columna++) {
                System.out.print("--------");
            }
            System.out.println();

            // Filas y valores
            for (int fila = 0; fila < arrayTesoro.length; fila++) {
                System.out.printf("| %-6s |", " y " + fila);

                for (int columna = 0; columna < arrayTesoro[fila].length; columna++) {
                    String valor = arrayTesoro[fila][columna];

                    if (valor == null || valor == "ORO" || valor == "KABOOM") {
                        System.out.printf(" %-6s |", "");
                    } else {
                        System.out.printf(" %-6s |", valor);
                    }
                }
                System.out.println();
            }


            if (!tesoroEncontrado && !bombaEncontrada) {
                for (int fila = y - 1; fila <= y + 1; fila++) {
                    for (int columna = x - 1; columna <= x + 1; columna++) {

                        if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
                            if (fila == filaBomba && columna == columnaBomba) {
                                System.out.println("¡Cuidado!");
                            }
                        }
                    }
                }
            }


            if (tesoroEncontrado) {
                System.out.println("\nDinero, dinero, dinero, dinero");
            }
            if (bombaEncontrada) {
                System.out.println("\nKABOOOOOMMMMM");
            }
        }
    }
}
