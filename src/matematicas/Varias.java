package matematicas;

public class Varias {

    // Comprueba si un numero es capicua
    public static boolean esCapicua(int num) {
        if (num < 0) {
            return false;
        }

        return num == voltea(num);
    }

    // Comprueba si un numero es primo
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Devuelve el siguiente primo
    public static int siguientePrimo(int num) {
        num++;

        while (!esPrimo(num)) {
            num++;
        }

        return num;
    }

    // Calcula una potencia
    public static double potencia(int num, int exponente) {
        double resultado = 1;
        int exp = exponente;

        if (exp < 0) {
            exp = -exp;
        }

        for (int i = 0; i < exp; i++) {
            resultado *= num;
        }

        if (exponente < 0) {
            return 1.0 / resultado;
        }

        return resultado;
    }

    // Cuenta los digitos
    public static int digitos(int num) {
        if (num < 0) {
            num = -num;
        }

        int contador = 0;

        do {
            contador++;
            num /= 10;
        } while (num != 0);

        return contador;
    }

    // Le da la vuelta a un numero
    public static int voltea(int num) {
        int invertido = 0;
        int signo = 1;

        if (num < 0) {
            signo = -1;
            num = -num;
        }

        while (num > 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        return invertido * signo;
    }

    // Devuelve el digito de la posicion n, se empieza por la izquierda desde la posicion 0
    public static int digitoN(int num, int posicion) {
        if (num < 0) {
            num = -num;
        }

        if (posicion < 0 || posicion >= digitos(num)) {
            return -1;
        }

        int divisor = 1;

        for (int i = 0; i < digitos(num) - posicion - 1; i++) {
            divisor *= 10;
        }

        return (num / divisor) % 10;
    }

    // Devuelve la posicion de la primera aparicion de un digito, si no aparece, devuelve -1
    public static int posicionDeDigito(int num, int ocurrencia) {
        if (num < 0) {
            num = -num;
        }

        if (ocurrencia < 0 || ocurrencia > 9) {
            return -1;
        }

        int divisor = 1;

        for (int i = 1; i < digitos(num); i++) {
            divisor *= 10;
        }

        int posicion = 0;

        while (divisor > 0) {
            int digito = num / divisor;

            if (digito == ocurrencia) {
                return posicion;
            }

            num %= divisor;
            divisor /= 10;
            posicion++;
        }

        return -1;
    }

    // Quita n digitos por detras
    public static int quitaPorDetras(int num, int n) {
        if (n < 0) {
            return num;
        }

        for (int i = 0; i < n; i++) {
            num /= 10;
        }

        return num;
    }

    // Quita n digitos por delante
    public static int quitaPorDelante(int num, int n) {
        if (n < 0) {
            return num;
        }

        int signo = 1;

        if (num < 0) {
            signo = -1;
            num = -num;
        }

        int cifras = digitos(num);

        if (n >= cifras) {
            return 0;
        }

        int divisor = (int) potencia(10, cifras - n);

        return signo * (num % divisor);
    }

    // Pega un digito por detras
    public static int pegaPorDetras(int num, int digito) {
        if (digito < 0 || digito > 9) {
            return num;
        }

        return num * 10 + digito;
    }

    // Pega un digito por delante
    public static int pegaPorDelante(int num, int digito) {
        if (digito < 0 || digito > 9) {
            return num;
        }

        int signo = 1;

        if (num < 0) {
            signo = -1;
            num = -num;
        }

        int divisor = (int) potencia(10, digitos(num));

        return signo * (digito * divisor + num);
    }

    // Devuelve un trozo del numero. Las posiciones empiezan en 0 y son inclusivas
    public static int trozoDeNumero(int num, int inicio, int fin) {
        if (num < 0) {
            num = -num;
        }

        if (inicio < 0 || fin < inicio || fin >= digitos(num)) {
            return -1;
        }

        int resultado = 0;

        for (int i = inicio; i <= fin; i++) {
            resultado = resultado * 10 + digitoN(num, i);
        }

        return resultado;
    }

    // Junta dos numeros
    public static int juntaNumeros(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            return -1;
        }

        return num1 * (int) potencia(10, digitos(num2)) + num2;
    }


}
