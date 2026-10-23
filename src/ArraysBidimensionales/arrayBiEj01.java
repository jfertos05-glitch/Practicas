package ArraysBidimensionales;

public class arrayBiEj01 {
    public static void main(String[] args) {
        int[][] arrayBiNumeros = new int[3][6];

        arrayBiNumeros[0][0] = 0;
        arrayBiNumeros[0][1] = 30;
        arrayBiNumeros[0][2] = 2;
        arrayBiNumeros[0][5] = 5;
        arrayBiNumeros[1][0] = 75;
        arrayBiNumeros[1][5] = 0;
        arrayBiNumeros[2][3] = -2;
        arrayBiNumeros[2][4] = 9;
        arrayBiNumeros[2][5] = 11;

        // Cabecera
        System.out.printf("| %-12s |", "Array num");

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
    }
}
