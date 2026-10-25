package ArraysBidimensionales;

public class arrayBiEj13 {
    public static void main(String[] args) {

        String[] pais = {"España", "Rusia", "Japón", "Australia"};

        int[][] arrayBiNumeros = new int[4][10];

        // Rellenar el array con estaturas aleatorias
        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {
            for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {
                arrayBiNumeros[fila][columna] = (int) (Math.random() * 71) + 140;
            }
        }

        // Cabecera
        System.out.printf("\n| %-10s |", "Pais");

        for (int columna = 0; columna < arrayBiNumeros[0].length; columna++) {
            System.out.printf(" %-6s |", "Pers " + (columna + 1));
        }

        System.out.println();

        // Linea separadora
        System.out.print("-------------");

        for (int columna = 0; columna < arrayBiNumeros[0].length; columna++) {
            System.out.print("--------");
        }

        System.out.println();

        // Filas y valores
        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {

            System.out.printf("| %-10s |", pais[fila]);

            for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {
                System.out.printf(" %-6d |", arrayBiNumeros[fila][columna]);
            }

            System.out.println();
        }

        // Calcular la media, el minimo y el maximo de cada pais
        System.out.println("\nEstaturas por pais:");

        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {

            int maximo = arrayBiNumeros[fila][0];
            int minimo = arrayBiNumeros[fila][0];
            int suma = 0;

            for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {

                int numero = arrayBiNumeros[fila][columna];

                if (numero > maximo) {
                    maximo = numero;
                }

                if (numero < minimo) {
                    minimo = numero;
                }

                suma = suma + numero;
            }

            int media = suma / arrayBiNumeros[fila].length;

            System.out.println("\nPais: " + pais[fila]);
            System.out.println("Estatura media: " + media + " cm");
            System.out.println("Estatura minima: " + minimo + " cm");
            System.out.println("Estatura maxima: " + maximo + " cm");
        }
    }
}