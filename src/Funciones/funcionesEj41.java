package Funciones;

public class funcionesEj41 {
    public static String figuras1(int altura) {
        int contador = altura;
        String resultado = "";

        for (int i = 0; i < altura; i++) {
            for (int a = 0; a < contador; a++) {
                resultado = resultado + "*";
            }

            resultado = resultado + "\n";
            contador--;
        }

        return resultado;
    }
}
