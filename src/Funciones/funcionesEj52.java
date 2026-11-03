package Funciones;

public class funcionesEj52 {
    public static int aleatorioDeArray(int[] a) {
        int posicion = (int) (Math.random() * a.length);

        for (int i = 0; i < a.length; i++) {
            if (posicion == i) {
                return a[i];
            }
        }

        return -1;
    }
}
