package Funciones;

public class funcionesEj46 {
    public static String figuras6(int altura) {
        String resultado = "";
        int espacios = altura - 2;

        for (int i = 0; i < altura - 1; i++) {

            resultado = resultado + "*";

            for (int j = 0; j < i; j++) {
                resultado = resultado + " ";
            }

            resultado = resultado + "*";

            for (int j = 0; j < espacios; j++) {
                resultado = resultado + " ";
            }

            resultado = resultado + "*";

            for (int j = 0; j < i; j++) {
                resultado = resultado + " ";
            }

            resultado = resultado + "*";

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
