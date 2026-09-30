public class numAleatorioEj13 {
    public static void main(String[] args) {
        int dado1 = 0;
        int dado2 = 1;
        int contador = 0;

        while (dado1 != dado2) {

            dado1 = (int)(Math.random() * 6) + 1;
            dado2 = (int)(Math.random() * 6) + 1;

            contador++;
        }

        System.out.println("Los dados han sido tirados este número de veces: " + contador);
    }
}
