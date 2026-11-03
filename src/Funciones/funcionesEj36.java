package Funciones;

public class funcionesEj36 {

    public static int[] filtraPrimos(int x[]) {
        int contador = 0;

        for (int i = 0; i < x.length; i++) {
            if (Varias.esPrimo(x[i])) {
                contador++;
            }
        }

        if (contador == 0) {
            return new int[] {-1};
        }

        int resultado[] = new int[contador];
        contador = 0;

        for (int i = 0; i < x.length; i++) {
            if (Varias.esPrimo(x[i])) {
                resultado[contador] = x[i];
                contador++;
            }
        }

        return resultado;
    }
}