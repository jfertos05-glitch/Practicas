package Funciones;

public class funcionesEj35 {

    public static String convierteEnPalotes(int n) {
        String resultado = "";

        for (int i = 0; i < Varias.digitos(n); i++) {

            int digito = Varias.digitoN(n, i);

            for (int a = 0; a < digito; a++) {
                resultado = resultado + "|";
            }

            if (i < Varias.digitos(n) - 1) {
                resultado = resultado + "-";
            }
        }

        return resultado;
    }
}