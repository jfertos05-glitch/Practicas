public class numAleatorioEj09 {
    public static void main(String[] args) {
        int numero = 0;
        int contador = 0;

        while (numero != 24) {

            numero = (int)(Math.random()*101)+0;

            if (numero % 2 == 0) {

                System.out.print(numero);

                if (numero != 24) {

                    System.out.print(" - ");

                }

                contador++;

            }
        }

        System.out.println();
        System.out.println("El programa ha generado " + contador + " número");
    }
}
