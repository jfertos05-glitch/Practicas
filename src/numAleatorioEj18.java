public class numAleatorioEj18 {
    public static void main(String[] args) {
        int numColores = 0;
        String colores = "";
        String color1 = "";
        String color2 = "";
        String color3 = "";
        boolean agrupacion = false;

        while (agrupacion == false) {

            for (int i = 0; i < 3; i++) {

                numColores = (int)(Math.random()*6)+1;
                switch (numColores) {
                    case 1:
                        colores = "rojo";
                        break;
                    case 2:
                        colores = "azul";
                        break;
                    case 3:
                        colores = "verde";
                        break;
                    case 4:
                        colores = "amarillo";
                        break;
                    case 5:
                        colores = "violeta";
                        break;
                    case 6:
                        colores = "naranja";
                        break;
                }

                if (i == 0) {
                    color1 = colores;
                }

                if (i == 1) {
                    color2 = colores;
                }

                if (i == 2) {
                    color3 = colores;
                }

            }

            if (color1 != color2 && color1 != color3 && color3 != color2) {

                System.out.print("Los 3 colore són: " + color1 + ", " + color2 + ", " + color3);
                agrupacion = true;

            }

        }
    }
}
