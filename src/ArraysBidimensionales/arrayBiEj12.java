package ArraysBidimensionales;

public class arrayBiEj12 {
    public static void main(String[] args) {

        int[][] arrayBiNumeros = new int[9][9];

        // Rellenar el array con numeros aleatorios
        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {
            for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {
                arrayBiNumeros[fila][columna] = (int) (Math.random() * 401) + 500;
            }
        }

        // Cabecera
        System.out.printf("\n| %-6s |", "Numeros");

        for (int columna = 0; columna < arrayBiNumeros[0].length; columna++) {
            System.out.printf(" %-6s |", "Col " + columna);
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

            System.out.printf("| %-6s |", "Fila " + fila);

            for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {
                System.out.printf(" %-6d |", arrayBiNumeros[fila][columna]);
            }

            System.out.println();
        }

        // Mostrar la diagonal secundaria
        System.out.println("\nNumeros de la diagonal:");

        int maximo = arrayBiNumeros[0][arrayBiNumeros.length - 1];
        int minimo = arrayBiNumeros[0][arrayBiNumeros.length - 1];
        int suma = 0;

        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {

            int columna = arrayBiNumeros.length - 1 - fila;
            int numero = arrayBiNumeros[fila][columna];

            System.out.println(numero);

            if (numero > maximo) {
                maximo = numero;
            }

            if (numero < minimo) {
                minimo = numero;
            }

            suma = suma + numero;
        }

        // Calcular la media
        double media = (double) suma / arrayBiNumeros.length;

        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);
        System.out.println("Media: " + media);
    }
}
