package Funciones;

public class funcionesEj39 {

    public static String convierteEnPalabras(int n) {
        String resultado = "";

        for (int i = 0; i < Varias.digitos(n); i++) {

            if (Varias.digitoN(n, i) == 0) {
                resultado = resultado + "cero";
            } else if (Varias.digitoN(n, i) == 1) {
                resultado = resultado + "uno";
            } else if (Varias.digitoN(n, i) == 2) {
                resultado = resultado + "dos";
            } else if (Varias.digitoN(n, i) == 3) {
                resultado = resultado + "tres";
            } else if (Varias.digitoN(n, i) == 4) {
                resultado = resultado + "cuatro";
            } else if (Varias.digitoN(n, i) == 5) {
                resultado = resultado + "cinco";
            } else if (Varias.digitoN(n, i) == 6) {
                resultado = resultado + "seis";
            } else if (Varias.digitoN(n, i) == 7) {
                resultado = resultado + "siete";
            } else if (Varias.digitoN(n, i) == 8) {
                resultado = resultado + "ocho";
            } else if (Varias.digitoN(n, i) == 9) {
                resultado = resultado + "nueve";
            }

            if (i != Varias.digitos(n) - 1) {
                resultado = resultado + ", ";
            }
        }

        return resultado;
    }
}