package cursobasicojava;

public class Operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos
        int numero1 = 11;
        int numero2 = 2;
        int suma = numero1 + numero2;// variable suma para almacenar el resultado
        // System.out.println("La suma es: " + (numero1 + numero2));// usamos signos de agrupacion
        System.out.println("La suma es: " + suma);
        
        int resta = numero1 - numero2;
        int multi = numero1 * numero2;
        int division = numero1 / numero2;
        int residuo = numero1 % numero2;
        System.out.println("Resultado de la division: " + division);
        System.out.println("Y su residuo es: " + residuo);
    }
}
