package Funciones;

public class funcionesEj44 {
    public static String figuras4(int altura) {
        int contador = altura;
        int contador2 = 0;
        String resultado = "";

        for (int i = 0; i < altura; i++) {

            for (int e = 0; e < contador2; e++) {
                resultado = resultado + " ";
            }

            for (int a = 0; a < contador; a++) {
                resultado = resultado + "*";
            }

            resultado = resultado + "\n";
            contador--;
            contador2++;
        }

        return resultado;
    }
}
