package Funciones;

public class funcionesEj55 {
    public static String[] sinRepetir(String[] s) {

        int contador = 0;

        for (int i = 0; i < s.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (s[i].equals(s[j])) {
                    repetido = true;
                }
            }

            if (!repetido) {
                contador++;
            }
        }

        String[] resultado = new String[contador];
        int posicion = 0;

        for (int i = 0; i < s.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (s[i].equals(s[j])) {
                    repetido = true;
                }
            }

            if (!repetido) {
                resultado[posicion] = s[i];
                posicion++;
            }
        }

        return resultado;
    }
}
