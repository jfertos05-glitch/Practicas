package POO.Ejercicio3;
import java.util.Scanner;

public class pooEj3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el nombre del perro:");
        String nombre = teclado.nextLine();

        System.out.println("Introduce su edad:");
        int edad = teclado.nextInt();

        System.out.println("Introduce su peso:");
        double peso = teclado.nextDouble();

        perro perro1 = new perro(nombre, edad, peso);

        perro1.ladra();
    }
}


/*
========================================
ORDEN PARA CREAR UN EJERCICIO DE HERENCIA
========================================

1. CREAR LA CLASE PADRE (Animal)
   - Es la clase principal de la que heredarán las demás.
   - Declarar los atributos comunes (nombre, edad, peso).
   - Elegir los modificadores de acceso (private, protected...).
   - Crear el constructor para inicializar los atributos.
   - Crear getters y setters para consultar y modificar atributos.
   - Crear los métodos comunes a todos los animales.

2. CREAR LAS CLASES INTERMEDIAS
   - Mamifero extends Animal.
   - Ave extends Animal.
   - Lagarto extends Animal.
   - Heredan los atributos y métodos de Animal.
   - Añadir sus propios atributos, constructores y métodos.
   - Utilizar super() para llamar al constructor del padre
     cuando sea necesario.

3. CREAR LAS CLASES HIJAS
   - Perro extends Mamifero.
   - Gato extends Mamifero.
   - Canario extends Ave.
   - Pinguino extends Ave.
   - Añadir los métodos específicos de cada animal.
   - Crear sus constructores si necesitan recibir datos.
   - Utilizar super() para pasar los datos a la clase padre.

4. CREAR EL PROGRAMA PRINCIPAL (pooEj3)
   - Importar Scanner si necesitamos pedir datos al usuario.
   - Crear el método main().
   - Pedir los datos al usuario.
   - Instanciar los objetos utilizando new.
   - Aplicar los métodos de cada objeto.
   - Comprobar que todo funciona correctamente.


========================================
CONCEPTOS IMPORTANTES
========================================

EXTENDS:
Permite que una clase herede de otra.

THIS:
Hace referencia al objeto actual.

SUPER():
Llama al constructor de la clase padre.

PRIVATE:
Solo permite acceder directamente desde la propia clase.

PROTECTED:
Permite acceder desde la propia clase, sus subclases
y las clases del mismo paquete.

PUBLIC:
Permite acceder desde cualquier clase.

STATIC:
Hace que un atributo o método pertenezca a la clase
y no a cada objeto individual.

GETTER:
Permite consultar el valor de un atributo.

SETTER:
Permite modificar el valor de un atributo.

CONSTRUCTOR:
Se utiliza para inicializar un objeto cuando se crea
mediante new.

========================================
*/
