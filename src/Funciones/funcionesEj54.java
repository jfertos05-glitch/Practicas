package Funciones;

public class funcionesEj54 {
    public static int ocurrencias(int digito, int n) {
        int contador = 0;

        for (int i = 0; i < Varias.digitos(n); i++) {
            if (digito == Varias.digitoN(n, i)) {
                contador++;
            }
        }

        return contador;
    }
}
