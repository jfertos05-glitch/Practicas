package ArraysBidimensionales;

public class arrayBiEj06 {
    public static void main(String[] args) {

        int[][] arrayBiNumeros = new int[6][10];
        int filaMinimo = 0;
        int filaMaximo = 0;
        int columnaMinimo = 0;
        int columnaMaximo = 0;
        int numeroMaximo = 0;
        int numeroMinimo = 999;

        System.out.println("Escriba el valor columna por columna");

        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {
            for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {
                boolean repetido;

                do {
                    repetido = false;
                    int numero = (int) (Math.random() * 900) + 100;

                    for (int fila2 = 0; fila2 < fila + 1; fila2++) {
                        for (int columna2 = 0; columna2 < arrayBiNumeros[fila2].length; columna2++) {

                            if (arrayBiNumeros[fila2][columna2] == numero) {
                                repetido = true;
                                break;
                            }
                        }
                    }

                    if (!repetido) {
                        arrayBiNumeros[fila][columna] = numero;
                    }
                } while (repetido);
            }

            if (fila < arrayBiNumeros.length-1) {
                System.out.println("Esta es la fila " + (fila+1));
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
    }
}