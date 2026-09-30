public class numAleatorioEj03 {
    public static void main(String[] args) {
        String palo = "";
        String carta = "";
        int tipocarta = (int)(Math.random()*4)+0;
        switch(tipocarta) {
            case 0:
                palo = "oros";
                break;
            case 1:
                palo = "copas";
                break;
            case 2:
                palo = "bastos";
                break;
            case 3:
                palo = "espadas";
            default:
                break;
        }
        int numeroCarta = (int)(Math.random()*11) + 1;
        switch(numeroCarta) {
            case 1:
                carta = "As";
                break;
            case 8:
                carta = "Sota";
                break;
            case 9:
                carta = "Caballo";
                break;
            case 10:
                carta = "Rey";
                break;
            default:
                carta = String.valueOf(numeroCarta);
        }
        System.out.println(carta + " de " + palo);
    }
}
