public class numAleatorioEj21 {
    public static void main(String[] args) {
        int moneda = 0;
        int caraOCruz = 0;
        String nombreMoneda = "";
        String nombreCara = "";

        for (int i = 0; i < 5; i++) {

            moneda = (int)(Math.random()*8)+1;
            caraOCruz = (int)(Math.random()*2)+1;

            switch (moneda) {
                case 1:
                    nombreMoneda = "1 céntimo";
                    break;
                case 2:
                    nombreMoneda = "2 céntimo";
                    break;
                case 3:
                    nombreMoneda = "3 céntimo";
                    break;
                case 4:
                    nombreMoneda = "10 céntimo";
                    break;
                case 5:
                    nombreMoneda = "20 céntimo";
                    break;
                case 6:
                    nombreMoneda = "50 céntimo";
                    break;
                case 7:
                    nombreMoneda = "1 euro";
                    break;
                case 8:
                    nombreMoneda = "2 euro";
                    break;
            }

            switch (caraOCruz) {
                case 1:
                    nombreCara = "Cara";
                    break;
                case 2:
                    nombreCara = "Cruz";
                    break;
            }

            System.out.println(nombreMoneda + " - " + nombreCara);

        }
    }
}
