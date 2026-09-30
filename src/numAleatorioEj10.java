public class numAleatorioEj10 {
    public static void main(String[] args) {
        int numCaracter = 0;
        String caracter = "";
        int longitud = 0;

        for (int i = 0; i < 10; i++) {

            numCaracter = (int)(Math.random()*6)+1;
            longitud = (int)(Math.random()*40)+1;

            switch (numCaracter) {
                case 1:
                    caracter = "*";
                    break;
                case 2:
                    caracter = "-";
                    break;
                case 3:
                    caracter = "=";
                    break;
                case 4:
                    caracter = ".";
                    break;
                case 5:
                    caracter = "|";
                    break;
                case 6:
                    caracter = "@";
                    break;
                default:
                    break;
            }

            for (int a = 0; a < longitud; a++) {

                System.out.print(caracter);

            }

            System.out.println();

        }
    }
}
