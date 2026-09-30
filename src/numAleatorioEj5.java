public class numAleatorioEj5 {
     public static void main(String[] args) {
        int num = 0;
        int numMaximo = 0;
        int numMinimo = 199;
        int media = 0;

        for (int i = 0; i < 50 ; i++) {

            num = (int)(Math.random()*100) + 100;

            System.out.print(num + " - ");

            if (num > numMaximo) {
                numMaximo = num;
            }

            if (num < numMinimo) {
                numMinimo = num;
            }

            media = media + num;

        }

        System.out.print("El número máximo es " + numMaximo + ", el mínimo es " + numMinimo + " y  la media es " + media/50);
    }
}
