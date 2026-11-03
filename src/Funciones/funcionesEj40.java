package Funciones;

public class funcionesEj40 {

    public static int[] filtraCon7(int x[]) {

        int contador = 0;

        for (int i = 0; i < x.length; i++) {
            for (int a = 0; a < Varias.digitos(x[i]); a++) {
                if (Varias.digitoN(x[i], a) == 7) {
                    contador++;
                    break;
                }
            }
        }

        if (contador == 0) {
            return new int[] {-1};
        }

        int[] resultado = new int[contador];
        contador = 0;

        for (int i = 0; i < x.length; i++) {
            for (int a = 0; a < Varias.digitos(x[i]); a++) {
                if (Varias.digitoN(x[i], a) == 7) {
                    resultado[contador] = x[i];
                    contador++;
                    break;
                }
            }
        }

        return resultado;
    }
}