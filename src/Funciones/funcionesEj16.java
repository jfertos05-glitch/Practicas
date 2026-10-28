package Funciones;

public class funcionesEj16 {
    public static void main(String[] args) {

        System.out.print("Los números capicua son: ");

        for (int i = 0; i < 99999; i++) {
            if (matematicas.Varias.esCapicua(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
