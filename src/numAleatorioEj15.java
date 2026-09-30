public class numAleatorioEj15 {
    public static void main(String[] args) {
        int numNotas = 0;
        String notas = "";
        int longitudMelodia = (int)(Math.random()*25)+4;
        int contadorNota = 0;
        String primeraNota = "";

        for (int a = 0; a < longitudMelodia; a++) {

            for (int i = 0; i < 4; i++) {

                numNotas = (int)(Math.random()*7)+0;

                switch (numNotas) {

                    case 1:
                        notas = "do";
                        break;
                    case 2:
                        notas = "re";
                        break;
                    case 3:
                        notas = "mi";
                        break;
                    case 4:
                        notas = "fa";
                        break;
                    case 5:
                        notas = "sol";
                        break;
                    case 6:
                        notas = "la";
                        break;
                    case 7:
                        notas = "si";
                        break;
                }

                if (longitudMelodia == a + 1) {
                    i++;
                }

                System.out.print(notas + " | ");

                if (contadorNota == 0) {

                    primeraNota = notas;

                }

                contadorNota++;
            }

            if (longitudMelodia == a + 1) {
                System.out.print(primeraNota);
                System.out.print(" ||");
            }

        }
    }
}
