public class numAleatorioEj16 {
    public static void main(String[] args) {
        int numFigura = 0;
        String figura = "";
        String figura1 = "";
        String figura2 = "";
        String figura3 = "";

        for (int i = 0; i < 4; i++) {

            numFigura = (int)(Math.random() * 5) + 0;

            switch (numFigura) {
                case 1:
                    figura = "Corazón";
                    break;
                case 2:
                    figura = "Diamante";
                    break;
                case 3:
                    figura = "Herradura";
                    break;
                case 4:
                    figura = "Campana";
                    break;
                case 5:
                    figura = "Limon";
                    break;
                default:
                    break;
            }

            if (i == 0) {

                figura1 = figura;

            }

            if (i == 1) {

                figura2 = figura;

            }

            if (i == 2) {

                figura3 = figura;

            }

        }

        System.out.println("Has sacado: " + figura1 + " " + figura2 + " " + figura3);

        if ((figura1 != figura2) && (figura2 != figura3) && (figura1 != figura3)) {

            System.out.println("\nLo siento, ha perdido.");

        } else if ((figura1 == figura2) && (figura2 == figura3)) {

            System.out.println("\nEnhorabuena, ha ganado 10 monedas.");

        } else {
            System.out.println("\nBien, ha recuperado su moneda.");
        }
    }
}
