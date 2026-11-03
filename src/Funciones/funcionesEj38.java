package Funciones;

public class funcionesEj38 {

    public static int[] filtraCapicuas(int x[]) {
        int contador = 0;

        for (int i = 0; i < x.length; i++) {
            if (Varias.esCapicua(x[i])) {
                contador++;
            }
        }

        if (contador == 0) {
            return new int[] {-1};
        }

        int resultado[] = new int[contador];
        contador = 0;

        for (int i = 0; i < x.length; i++) {
            if (Varias.esCapicua(x[i])) {
                resultado[contador] = x[i];
                contador++;
            }
        }

        return resultado;
    }
}