package ArraysBidimensionales;

public class arrayBiEj09 {
    public static void main(String[] args) {
        int[][] arrayBiNumeros = new int[12][12];
        int[][] arrayBiNumerosModificado = new int[12][12];

        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {
            for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {

                arrayBiNumeros[fila][columna] = (int)(Math.random()*900)+100;

            }
        }

        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {
            for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {

                if (fila == 0 && columna == 0) {
                    arrayBiNumerosModificado[fila][columna] = arrayBiNumeros[11][11];
                } else if (fila != 0 && columna == 0) {
                    arrayBiNumerosModificado[fila][columna] = arrayBiNumeros[fila-1][11];
                }
            }
        }

        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {
            for (int columna = 1; columna < arrayBiNumeros[fila].length; columna++) {

                arrayBiNumerosModificado[fila][columna] = arrayBiNumeros[fila][columna-1];

            }
        }


        // Cabecera
        System.out.printf("\n| %-12s |", "Array num");

        for (int columna = 0; columna < arrayBiNumeros[0].length; columna++) {
            System.out.printf(" %-11s |", "Columna " + columna);
        }
        System.out.println();

        // Línea separadora
        System.out.print("----------------");
        for (int columna = 0; columna < arrayBiNumeros[0].length; columna++) {
            System.out.print("--------------");
        }
        System.out.println();

        // Filas y valores
        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {
            System.out.printf("| %-12s |", "Fila " + fila);

            for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {
                int valor = arrayBiNumeros[fila][columna];

                if (valor == 0) {
                    System.out.printf(" %-11s |", "");
                } else {
                    System.out.printf(" %-11d |", valor);
                }
            }
            System.out.println();
        }

        // Cabecera
        System.out.printf("\n| %-12s |", "Array num");

        for (int columna = 0; columna < arrayBiNumerosModificado[0].length; columna++) {
            System.out.printf(" %-11s |", "Columna " + columna);
        }
        System.out.println();

        // Línea separadora
        System.out.print("----------------");
        for (int columna = 0; columna < arrayBiNumerosModificado[0].length; columna++) {
            System.out.print("--------------");
        }
        System.out.println();

        // Filas y valores
        for (int fila = 0; fila < arrayBiNumerosModificado.length; fila++) {
            System.out.printf("| %-12s |", "Fila " + fila);

            for (int columna = 0; columna < arrayBiNumerosModificado[fila].length; columna++) {
                int valor = arrayBiNumerosModificado[fila][columna];

                if (valor == 0) {
                    System.out.printf(" %-11s |", "");
                } else {
                    System.out.printf(" %-11d |", valor);
                }
            }
            System.out.println();
        }
    }
}
