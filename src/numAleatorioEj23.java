public class numAleatorioEj23 {
    public static void main(String[] args) {
        int cara = 0;
        String simboloCara = "";

        for (int i = 0; i < 5; i++) {

            cara = (int)(Math.random()*5)+1;

            switch (cara) {
                case 1:
                    simboloCara = "Q";
                    break;
                case 2:
                    simboloCara = "J";
                    break;
                case 3:
                    simboloCara = "7";
                    break;
                case 4:
                    simboloCara = "J";
                    break;
                case 5:
                    simboloCara = "As";
                    break;
            }

            System.out.print(simboloCara + " ");

        }
    }
}
