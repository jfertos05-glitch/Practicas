public class numAleatorioEj01 {
        public static void main(String[] args) {
        int dado = 0;
        int suma = 0;

        for (int i = 0; i < 3; i++) {

            dado = (int)(Math.random()*6)+1;
            suma = suma + dado;

            System.out.println("El número que ha salido es " + dado);

        }

        System.out.println("La suma de los 3 dado es " +  suma);
    }
}
