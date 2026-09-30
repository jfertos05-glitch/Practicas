public class numAleatorioEj19 {
    public static void main(String[] args) {
        int numero = 0;
        int maxPar = 0;
        int minImpar = 200;
        int media = 0;

        for (int i = 0; i < 50; i++) {

            numero = (int)(Math.random()*301)-100;

            System.out.print(numero + " ");

            if (numero %2 == 0 && numero > maxPar) {
                maxPar = numero;
            }

            if (numero % 2 != 0 && numero < minImpar) {
                minImpar = numero;
            }

            media = media + numero;

        }

        System.out.println();

        System.out.print("El máximo de los pares es " + maxPar + ", el mínimo de los impares es " + minImpar + " y la media de todos los números es " + media/50);
    }
}
