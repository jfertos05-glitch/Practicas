package Funciones;

public class funcionesEj47 {
    public static String convierteArrayEnString(int[] numero) {
        String resultado = "";

        for (int i = 0; i < numero.length; i++) {
            resultado = resultado + numero[i];
        }

        return resultado;
    }
}
