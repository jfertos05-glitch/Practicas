package Funciones;

public class funcionesEj45 {
    public static String figuras5(int altura) {
        String resultado = "";
        int espacios = altura - 2;

        for (int i = 0; i < altura - 1; i++) {

            for (int j = 0; j <= i; j++) {
                resultado = resultado + "*";
            }

            for (int j = 0; j < espacios; j++) {
                resultado = resultado + " ";
            }

            for (int j = 0; j <= i; j++) {
                resultado = resultado + "*";
            }

            resultado = resultado + "\n";
            espacios--;
        }

        for (int i = 0; i < altura * 2 - 1; i++) {
            resultado = resultado + "*";
        }

        resultado = resultado + "\n";

        return resultado;
    }
}
