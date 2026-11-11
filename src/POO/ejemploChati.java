package POO;

import java.util.Scanner;

/*
 * ============================================================
 * EJEMPLO DE PROGRAMACION ORIENTADA A OBJETOS: COCHE
 * ============================================================
 *
 * OBJETIVO:
 * Aprender clases, objetos, atributos, constructores, metodos, encapsulamiento, parametros, this, void y return.
 *
 * IMPORTANTE SOBRE EL ARCHIVO:
 * Esta clase publica se llama ejemploChati, por eso el archivo debe llamarse exactamente: ejemploChati.java
 *
 * Como aparece "package POO;", el archivo debe estar dentro de la carpeta/paquete POO de tu proyecto.
 */


/*
 * CLASE COCHE
 *
 * Una clase es como un molde o plano. Describe qué datos tendrá un coche y qué acciones podrá realizar.
 *
 * Aquí NO estamos creando todavía un coche concreto. Eso lo haremos más abajo con "new Coche(...)".
 *
 * La clase Coche no lleva "public" porque, en este ejemplo, está en el mismo archivo que la clase pública ejemploChati.
 */
class Coche {

    // --------------------------------------------------------
    // 1. ATRIBUTOS
    // --------------------------------------------------------
    //
    // Los atributos son variables que pertenecen a cada objeto.
    // Cada coche tendrá su propia marca, modelo, matrícula, etc.
    //
    // ¿Qué significa private?
    // "private" es un modificador de acceso: indica que ese atributo solo se puede utilizar directamente desde dentro de la propia clase Coche.
    //
    // Por ejemplo, desde main NO podemos escribir: coche1.combustible = 100;
    //
    // Para cambiar el combustible desde fuera, usamos métodos públicos como repostar(). Así la clase controla los cambios.
    //
    // Otros modificadores de acceso:
    //
    // public: Se puede acceder desde cualquier otra clase que tenga acceso a esa clase.
    // protected: Se puede acceder desde la propia clase, desde clases del mismo paquete y desde ciertas clases hijas (herencia).
    // Sin poner nada (acceso de paquete): Se puede acceder desde otras clases del mismo paquete, pero no desde clases de otros paquetes.
    // Regla habitual: atributos private y métodos public cuando queremos que otras clases puedan utilizar esos métodos.

    private String marca;
    private String modelo;
    private String matricula;
    private double kilometros;
    private double combustible;


    // --------------------------------------------------------
    // 2. CONSTRUCTOR
    // --------------------------------------------------------
    //
    // Un constructor se ejecuta cuando creamos un objeto con new.
    //
    // Se reconoce porque:
    // - Tiene el mismo nombre que la clase: Coche.
    // - No lleva tipo de retorno: ni void, ni int, ni String...
    //
    // Los datos entre paréntesis son PARAMETROS.
    // Son variables que reciben los valores que le pasamos al crear el objeto.
    //
    // Por ejemplo: new Coche("Toyota", "Corolla", "1234ABC")
    //
    // En esa llamada:
    // marca recibe "Toyota".
    // modelo recibe "Corolla".
    // matricula recibe "1234ABC".
    //
    // Estos parámetros no son los atributos: son datos de entrada que utilizamos para dar valor a los atributos del objeto.

    public Coche(String marca, String modelo, String matricula) {

        // ¿Qué significa this?
        //
        // this representa al objeto que se está construyendo.
        //
        // this.marca = marca;
        //
        // Se usa this porque ambos se llaman "marca". Así dejamos claro que a la izquierda está el atributo del objeto y a la derecha el parámetro recibido.
        //
        // Podríamos haber llamado al parámetro "nuevaMarca" y escribir marca = nuevaMarca, pero this.marca = marca es una forma muy habitual de hacerlo.

        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;

        // Valores iniciales que tendrá cada coche nuevo.
        this.kilometros = 0;
        this.combustible = 50;
    }


    // --------------------------------------------------------
    // 3. METODO CON VOID
    // --------------------------------------------------------
    //
    // Un método es un bloque de código que realiza una tarea.
    //
    // "public" significa que se puede llamar desde otras clases.
    //
    // "void" significa que el método NO devuelve un resultado.
    // Puede hacer cosas (mostrar mensajes, modificar atributos, etc.), pero no entrega un valor mediante return.
    //
    // "double distancia" es un parámetro: el dato que necesita recibir el método para poder realizar su trabajo.
    //
    // Ejemplo de llamada: coche1.conducir(100);
    //
    // El valor 100 se recibe en el parámetro distancia.

    public void conducir(double distancia) {

        // Calculamos el combustible necesario.
        // El coche consume 6,5 litros cada 100 kilómetros.
        double consumo = distancia * 6.5 / 100;

        if (distancia <= 0) {

            System.out.println("Distancia no válida.");

        } else if (combustible >= consumo) {

            // Modificamos los atributos del objeto que conduce.
            kilometros = kilometros + distancia;
            combustible = combustible - consumo;

            System.out.println("Viaje realizado correctamente.");
            System.out.println("Kilómetros recorridos: " + distancia);
            System.out.println("Combustible consumido: " + consumo);

        } else {

            System.out.println("No hay suficiente combustible.");
        }
    }


    // --------------------------------------------------------
    // 4. OTRO METODO VOID: REPOSTAR
    // --------------------------------------------------------
    //
    // Recibe los litros que queremos añadir y modifica el combustible de ESTE objeto.
    //
    // Por ejemplo: coche2.repostar(20);
    //
    // Solo cambia el combustible de coche2, no el de coche1.

    public void repostar(double litros) {

        if (litros > 0) {

            combustible = combustible + litros;
            System.out.println("Has repostado " + litros + " litros.");

        } else {

            System.out.println("Cantidad no válida.");
        }
    }


    // --------------------------------------------------------
    // 5. METODO PARA MOSTRAR INFORMACION
    // --------------------------------------------------------
    //
    // También es void porque muestra los datos por pantalla, pero no devuelve ningún valor.
    //
    // No necesita parámetros porque los datos ya están guardados en los atributos del propio objeto.

    public void mostrarInformacion() {

        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Kilómetros: " + kilometros);
        System.out.println("Combustible: " + combustible);
    }


    // --------------------------------------------------------
    // 6. METODO QUE DEVUELVE UN VALOR CON RETURN
    // --------------------------------------------------------
    //
    // Diferencia con void:
    //
    // public void mostrarInformacion()
    //     -> no devuelve ningún dato.
    //
    // public String getMatricula()
    //     -> devuelve un String.
    //
    // El tipo escrito antes del nombre del método indica qué tipo de dato devolverá. En este caso, String.
    //
    // return matricula; entrega el valor al lugar desde el que se llamó al método.
    //
    // Ejemplo:
    // String matriculaGuardada = coche1.getMatricula();
    //
    // También podríamos usarlo directamente en una comparación.

    public String getMatricula() {
        return matricula;
    }

    /*
     * Otros ejemplos de métodos que devuelven datos:
     *
     * public double getCombustible() {
     *     return combustible;
     * }
     *
     * public int sumar(int numero1, int numero2) {
     *     return numero1 + numero2;
     * }
     *
     * En un método que devuelve un valor, return debe entregar un dato compatible con el tipo indicado.
     */
}


/*
 * CLASE PRINCIPAL
 *
 * Es la clase desde la que empieza el programa.
 * El método main es el punto de entrada de la aplicación.
 */
public class ejemploChati {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        // ----------------------------------------------------
        // 7. CREAR OBJETOS
        // ----------------------------------------------------
        //
        // Coche es el tipo (la clase).
        // coche1 y coche2 son variables que guardan referencias a dos objetos Coche diferentes.
        //
        // new crea un objeto nuevo y llama a su constructor.
        //
        // Los valores entre paréntesis se envían a los parámetros del constructor.
        //
        // Cada objeto tiene sus propios atributos.

        Coche coche1 = new Coche("Toyota", "Corolla", "1234ABC");
        Coche coche2 = new Coche("Seat", "Ibiza", "5678DEF");

        int opcion;
        int numeroCoche;
        double cantidad;

        do {

            System.out.println("\n===== GESTIÓN DE COCHES =====");
            System.out.println("1. Mostrar información de los coches");
            System.out.println("2. Conducir un coche");
            System.out.println("3. Repostar un coche");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {

                case 1:

                    // Llamamos al método del primer objeto.
                    System.out.println("\n--- COCHE 1 ---");
                    coche1.mostrarInformacion();

                    // Llamamos al mismo método, pero en el segundo.
                    System.out.println("\n--- COCHE 2 ---");
                    coche2.mostrarInformacion();

                    // Aunque el método es el mismo, cada objeto muestra sus propios atributos.
                    break;


                case 2:

                    System.out.println("¿Qué coche quieres conducir?");
                    System.out.println("1. Toyota");
                    System.out.println("2. Seat");
                    numeroCoche = Integer.parseInt(teclado.nextLine());

                    System.out.print("¿Cuántos kilómetros quieres recorrer? ");

                    cantidad = Double.parseDouble(teclado.nextLine());

                    if (numeroCoche == 1) {

                        // Llamamos a conducir() del objeto coche1.
                        coche1.conducir(cantidad);

                    } else if (numeroCoche == 2) {

                        // Llamamos a conducir() del objeto coche2.
                        coche2.conducir(cantidad);

                    } else {

                        System.out.println("Coche no válido.");
                    }

                    break;


                case 3:

                    System.out.println("¿Qué coche quieres repostar?");
                    System.out.println("1. Toyota");
                    System.out.println("2. Seat");
                    numeroCoche = Integer.parseInt(teclado.nextLine());

                    System.out.print("¿Cuántos litros quieres añadir? ");
                    cantidad = Double.parseDouble(teclado.nextLine());

                    if (numeroCoche == 1) {

                        coche1.repostar(cantidad);

                    } else if (numeroCoche == 2) {

                        coche2.repostar(cantidad);

                    } else {

                        System.out.println("Coche no válido.");
                    }

                    break;


                case 0:

                    System.out.println("Cerrando el programa...");
                    break;


                default:

                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);

        // Cerramos Scanner al terminar de utilizarlo.
        teclado.close();
    }
}


/*
 * ============================================================
 * RESUMEN PARA ESTUDIAR
 * ============================================================
 *
 * CLASE:
 * El molde que define atributos y métodos. Ejemplo: Coche.
 *
 * OBJETO:
 * Una instancia concreta creada a partir de una clase.
 * Ejemplo: coche1 y coche2.
 *
 * ATRIBUTO:
 * Una variable que pertenece a cada objeto.
 * Ejemplo: marca, modelo, combustible.
 *
 * private:
 * Restringe el acceso directo al atributo o método a la propia clase que lo declara.
 *
 * public:
 * Permite utilizar el miembro desde otras clases accesibles.
 *
 * protected:
 * Permite el acceso desde el mismo paquete y desde clases hijas, con las reglas de acceso de Java.
 *
 * CONSTRUCTOR:
 * Se ejecuta al crear un objeto con new. Inicializa sus datos.
 *
 * PARAMETRO:
 * Variable que aparece entre los paréntesis de un método o constructor y recibe un dato cuando se realiza la llamada.
 *
 * this:
 * Hace referencia al objeto actual. this.marca señala al atributo del objeto, mientras que marca puede ser el parámetro.
 *
 * void:
 * Indica que el método no devuelve ningún valor.
 *
 * return:
 * Devuelve un valor desde un método y termina su ejecución.
 *
 * METODO:
 * Bloque de código que realiza una tarea.
 *
 * ENCAPSULAMIENTO:
 * Consiste en proteger los datos y controlar cómo se consultan o modifican, por ejemplo usando atributos private y métodos public.
 *
 * IMPORTANTE:
 * Un método void también puede modificar atributos, mostrar mensajes o realizar cálculos. Simplemente no devuelve un resultado al código que lo llamó.
 */
