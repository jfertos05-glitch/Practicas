package Funciones;

public class funcionesEj37 {

    public static String convierteEnMorse(int n) {

        String resultado = "";

        for (int i = 0; i < Varias.digitos(n); i++) {

            int digito = Varias.digitoN(n, i);

            if (digito == 0) {
                resultado = resultado + "_ _ _ _ _";
            } else if (digito == 1) {
                resultado = resultado + ". _ _ _ _";
            } else if (digito == 2) {
                resultado = resultado + ". . _ _ _";
            } else if (digito == 3) {
                resultado = resultado + ". . . _ _";
            } else if (digito == 4) {
                resultado = resultado + ". . . . _";
            } else if (digito == 5) {
                resultado = resultado + ". . . . .";
            } else if (digito == 6) {
                resultado = resultado + "_ . . . .";
            } else if (digito == 7) {
                resultado = resultado + "_ _ . . .";
            } else if (digito == 8) {
                resultado = resultado + "_ _ _ . .";
            } else if (digito == 9) {
                resultado = resultado + "_ _ _ _ .";
            }

            if (i < Varias.digitos(n) - 1) {
                resultado = resultado + " ";
            }
        }

        return resultado;
    }
}