package cursobasicojava;

public class Condicionales {

    public static void main(String[] args) {
        
        // para usar condicionales se requiere el uso de comparadores
        // Mayor: >, Menor: <, Igual: ==, Menor o Igual: <=, Diferente: !=
        // O: ||, Y: && => Se puede estudiar logica booleana
        
        // 1- un programa que compare dos numeros y diga que numero es mayor
        // 2- pidele al usuario que ingrese los numeros
        
        
        // los valores son enteros, pequeños
        // => Que tipos de datos hay Java, que tipo de dato usamos para 
        // guardar entero? => int es para entero
        
        // realizacion del primer paso
        int numeroUno = 10;
        int numeroDos = 5;
        
        // comparar los valores, usamos condicionales si => if
        // para evaluar condiciones usamos los comparodores: <, >, <=, >=, !=, ==, &&, ||
        if(numeroUno > numeroDos){
            // si es verdadero, ingresa al bloque de las {} y ejecuta lo que pongamos en ellas
            numeroUno = 100;
            System.out.println("El numero uno es el mayor: " + numeroUno);
        }// de aca en adelante, se ejecutan las siguientes lineas, si la condicional
        // anterior fue falsa
        if(numeroUno == numeroDos){
            System.out.println("Los dos numeros son iguales!!!");
        }
        
//        System.out.println("El numero dos es el mayor: " + numeroDos);
        
        System.out.println("Final del programa");
        
    }
    
}
