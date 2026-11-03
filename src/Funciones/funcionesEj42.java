package Funciones;

public class funcionesEj42 {
    public static String figuras2(int altura) {
        int contador = altura;
        String resultado = "";

        for (int i = 0; i < altura; i++) {
            for (int a = 0; a < contador; a++) {
                if (a == 0 || a == contador - 1) {
                    resultado = resultado + "*";
                } else {
                    resultado = resultado + " ";
                }
            }

            resultado = resultado + "\n";
            contador--;
        }

        return resultado;
    }
}
