package cursobasicojava;

/**
 *
 * @author dwein
 */
public class TiposDatos {
    public static void main(String[] args) {
        // Datos primitivos
        byte edad = -127; // se declara e inicializa variable edad, 8 bits
        // es un octeto de bits, es un valor logico booleano que guarda 0 o 1
        // 0000 0000 -> logica binaria, 1111 1111 -> 2^7 2^6 2^5.... 2^0 = 128
        System.out.println("La edad de la persona es: " + edad);
        short personasPueblo = 10000;
        System.out.println("La cantidad de personas en el pueblo es: " + personasPueblo);
        
        int salarioMinimo = 1300000;//-2147483648 a 2.147.483.647
        long poblacionMundial = 8200000000L; // -9.223.372.036.854.775.808
        System.out.println("Poblacion mundial: " + poblacionMundial);
        
        float estatura = 1.77F; // un casteo, forzar el cambio de tipos de datos
        // pasamos el double = 1.77 a float
        float estatura2 = (float)1.77; // un casteo, forzar el cambio de tipos de datos
        // pasamos el double = 1.77 a float
        double pi = 3.14159265358979323846;
        float pi2 = 3.14159265358979323846F;
        int pi3 = (int)3.14159265358979323846;
        System.out.println("El valor de pi con double es: " + pi);
        System.out.println("El valor de pi2 con float es: " + pi2);
        System.out.println("El valor de pi3 con int es: " + pi3);
        
        // el factor de una hora extra es 1.25, y se almacena en un entero
        // caracteres
        char estoEsUnaLetra = 'a'; // primitivo, almacenar una sola letra o simbolo
        String cadenaDeCaracteras = "Hola, soy una cadena de caracteres";   
        
    }
}
