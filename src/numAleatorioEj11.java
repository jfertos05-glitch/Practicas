public class numAleatorioEj11 {
    public static void main(String[] args) {
        int numero = 0;
        String nota = "";
        int contadorSu = 0;
        int contadorBi = 0;
        int contadorNo = 0;
        int contadorSo = 0;

        for (int i = 0; i < 20; i++) {
            numero = (int)(Math.random()*4)+1;

            switch (numero) {
                case 1:
                    nota = "Suspenso";
                    contadorSu++;
                    break;
                case 2:
                    nota = "Bien";
                    contadorBi++;
                    break;
                case 3:
                    nota = "Notable";
                    contadorNo++;
                    break;
                case 4:
                    nota = "Sobresaliente";
                    contadorSo++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("El número de suspensos a sido: " + contadorSu);
        System.out.println("El número de bien a sido: " + contadorBi);
        System.out.println("El número de notables a sido: " + contadorNo);
        System.out.println("El número de sobresalientes a sido: " + contadorSo);
    }
}
