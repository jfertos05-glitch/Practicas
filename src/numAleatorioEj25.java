public class numAleatorioEj25 {
    public static void main(String[] args) {
        int numero = 0;

        for (int i = 0; i < 100; i++){

            boolean primo = true;
            numero = (int)(Math.random()*191)+10;

            if (numero < 2) {
                primo = false;
            } else {
                for (int a = 2; a < numero; a++) {
                    if (numero % a == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo == true) {

                System.out.print("#" + numero + "#" + " ");

            } else if (numero % 5 == 0) {

                System.out.print("[" + numero + "]" + " ");

            } else {

                System.out.print(numero + " ");

            }

        }
    }
}
