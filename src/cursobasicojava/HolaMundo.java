package cursobasicojava;

/**
 *
 * @author dwein
 */
public class HolaMundo {

    public static void main(String[] args) {
          System.out.println("Hola Mundo");
          int edad; // entero edad, y solo esta declarado -> inicializado
          edad = 10;
        // Java es un lenguaje fuertemente tipado
        // Lo que quiere decir que los datos deben estar completamente definidos
        // Es decir un numnero debe ser declarado como numero un texto debe ser 
        // declarado texto...
        // variable: Una variable es un espacio en memoria destinado 
        // para guardar informacion y cuyo valor puede cambiar
        // Para crear una variable en java se sigue el siguiete patron
        // Tipo de dato, nombre de la variable y si se requiere la inicializacion
        // Inicializar: es darle un valor a la variable
        // Crear una variable para guardar un nombre e imprimirlo 
        String nombrePersona = "Camilo Pedraza"; // Se agrega string que sirve para
        // indicar el tipo de dato que es un texto, se agrega nombre a la variable
        // y se le asigna un valor a la variable por medio del uso del =
        System.out.println("Hola: " + nombrePersona);
    }
    
}
