package POO.Ejercicio4;

public class Fraccion {
    protected int numerador;
    protected int denominador;

    //public hace que sea disponible en todos lados, private solo para la clase y protected para las clases y subclases.

    public Fraccion (int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public void invierte (){
        int aux = numerador;
        numerador = denominador;
        denominador = aux;
    }

    public double multiplica () {
        Double resultado = (double)numerador*denominador;
        return resultado;
    }

    public double dividir () {
        Double resultado = (double)numerador/denominador;
        return resultado;
    }

    public void mostrar(){
        System.out.println(numerador + " " + denominador);
    }
}
