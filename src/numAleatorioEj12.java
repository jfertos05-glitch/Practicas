public class numAleatorioEj12 {
    public static void main(String[] args) throws InterruptedException { //Lo añadido sirve para poder utilizar Thread.sleep()
        int numero = 0;
        int contador = 0;

        System.out.print("\033[32m"); // pinta en verde

        for (int i = 0; i < 8000; i++) {

            numero = (int)(Math.random() * 95) + 32;
            System.out.print((char) numero); //Al tratar un número como carácter pasa a estar en ASCII
            contador++;

            if (contador == 60) {
                contador = 0;
                Thread.sleep(50); // Añade un parón en la generación de código de 0,5 segundos
                System.out.println();
            }
        }
    }
}
