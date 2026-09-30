public class numAleatorioEj04 {
    public static void main(String[] args) {
        int numero = 0;

        for (int i = 0; i < 20; i++) {

            numero = (int)(Math.random()*11)+0;
            System.out.print(numero + " ");
        }
    }
}

