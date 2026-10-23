package ArraysBidimensionales;

public class arrayBiEj04 {
    public static void main(String[] args) throws InterruptedException {

        int[][] arrayBiNumeros = new int[3][6];

        System.out.println("Escriba el valor columna por columna");

        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {
            for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {

                arrayBiNumeros[fila][columna] = (int)(Math.random()*900)+100;

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

        //Fila de la suma

        int columnaExtra = 0;
        System.out.printf("| %-12s |", "Suma ");

        for (int columna = 0; columna < arrayBiNumeros[0].length; columna++) {
            columnaExtra++;
        }

        int[] valorSuma = new int[columnaExtra];

        for (int fila = 0; fila < arrayBiNumeros.length; fila++) {
            for (int columna = 0; columna < arrayBiNumeros[fila].length; columna++) {

                valorSuma[columna] = valorSuma[columna] + arrayBiNumeros[fila][columna];

            }
        }

        for (int i = 0; i < columnaExtra; i++) {
            System.out.printf(" %-11s |", valorSuma[i]);
            Thread.sleep(500);
        }

        int sumaTotal = 0;

        for (int i = 0; i < columnaExtra; i++) {
            sumaTotal = sumaTotal + valorSuma[i];
        }

        System.out.printf(" %-11s ", sumaTotal);
    }
}
