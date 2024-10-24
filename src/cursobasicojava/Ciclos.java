package cursobasicojava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ciclos {


    public static void main(String[] args) {
        // son estructuras de control repetitivas
        
        // Crear una lista de con las marcas (texto) de vehiculos
        // luego mostrar las marcas que tenemos en el almacen
        // para ello usamos un vector [], una variable de tipo vector
//        String listaMarcaVehiculos [] = {"Toyota", "Ford", "Ferrari", "Hyundai", "Mazda", "Chevrolet"};
        // mostrar la marca Toyota
//        System.out.println(marcaVehiculos[0]); // para mostrar se usa la posicion en el vector [0]
//        System.out.println(marcaVehiculos[1]);
//        System.out.println(marcaVehiculos[2]);
//        System.out.println(marcaVehiculos[3]);
//        System.out.println(marcaVehiculos[4]);
        
        // tarea repetitiva? => implementar un ciclo
//        for(int contadorMarcas = 0; contadorMarcas < marcaVehiculos.length; contadorMarcas = contadorMarcas + 1){
//           System.out.println(marcaVehiculos[contadorMarcas]); 
//        }
        
        // buscar si existe la marca Mazda en la lista de vehiculos
//        String marcaBuscada = "mazda";
//        for(int contarBusqueda = 0; contarBusqueda < marcaVehiculos.length; contarBusqueda = contarBusqueda + 1){
//            if(marcaVehiculos[contarBusqueda] == marcaBuscada){
//                System.out.println("Hey!!! encontramos un Mazda");
//                break; // romper el ciclo si encutra la marca buscada
//            }
//        }
        
        // el scanner se crea una sola vez
//        Scanner scanner = new Scanner(System.in); // es para pedir datos al usuario por consola
//        System.out.println("Por favor ingresa la marca del carro: ");
//        String marcaBuscada2 = scanner.nextLine();
//        System.out.println("La marca fue: " + marcaBuscada2);
//        scanner.close(); // cuando se termina programa finalizar la escucha
        
        // preguntar por la serie del vehiculo
//        System.out.println("Por favor ingresa la serie del vehiculo: ");
//        String serieVehiculo = scanner.nextLine();
//        
//        System.out.println("Por favor ingresa el modelo del vehiculo: ");
//        int modeloVehiculo = scanner.nextInt();


        // pedir al usurio la marca a buscar y devolver un msj de exito si la encuentra
        // o un msj de fallo en caso contrario
//        JOptionPane.showMessageDialog(null, "Hola este es el Taller El Veloz!");
//        String marcaIngresada = JOptionPane.showInputDialog("Ingresa la marca del vehiculo");
//        System.out.println("Marca ingresada: " + marcaIngresada);
//        JOptionPane.showMessageDialog(null, "La marca ingresa fue: " + marcaIngresada);
//        boolean marcaEncontrada = false;
//        for(int contarBusqueda = 0; contarBusqueda < listaMarcaVehiculos.length; contarBusqueda = contarBusqueda + 1){
//            if(listaMarcaVehiculos[contarBusqueda].equals(marcaIngresada)){
//                marcaEncontrada = true;
//                break; // romper el ciclo si encutra la marca buscada
//            }
//        }
        
//        if(marcaEncontrada == true){
//            System.out.println("La marca ya existe en el taller!");
//        }else{
//            System.out.println("Hey la marca no esta lista");
//        }
        
        // el taller define que si la marca ingresa no existe, se agregue a la lista
        // los vectores no son mutables en java
        // para modificar la lista, como no es mutable, la vamos a copiar y a trabajar con la copia
        // el length de la nueva lista va a ser, el length de la lista original + 1 
        
//        if(marcaEncontrada == true){
//            System.out.println("La marca ya existe en el taller!");
//        }else{
//            System.out.println("Hey la marca no esta lista, la vamos a agregar a la lista");
//            // creo vector vacio con length + 1
//            String listaActualizadaDeVehiculos[] = new String[listaMarcaVehiculos.length + 1];
//            // se recorre la lista de vehiculos anterior para almacenarlos en la nueva
//            for(int contadorMarcas = 0; contadorMarcas < listaMarcaVehiculos.length; contadorMarcas++){
//                listaActualizadaDeVehiculos[contadorMarcas] = listaMarcaVehiculos[contadorMarcas];
//            }
//            listaActualizadaDeVehiculos[listaActualizadaDeVehiculos.length -1] = marcaIngresada;
//        }

        
        // Ahora modificamos el algoritmo para que los datos de la lista de marcas de vehiculos
        // no esten quemados (hardcode)
        // => Le pedimos al usuario que ingrese la marca de vehiculos que tendra inicialmente el taller
       
        // para esto debemos ejecutar los siguientes pasos:
        // 1er paso: Mensaje de saludo del taller
        // 2: Pedir al usuario la cantidad de marcas que desea almacenar inicialmente
        // 3: Pedir al usuario que ingrese las marcas a almacenar en la lista inicial
        // 3.1: Crear un vector para almacenar las marcas
        // 3.2: Realizar un ciclo para pedir la marca y almacenarla en el vector anterior
        // esto se repetira hasta la cantidad de marcas que dijo el usuario que iba a almacenar
        // 4: Mostrar las marcas ingresadas

        //1:
//        JOptionPane.showMessageDialog(null, "Hola este es el Taller El Veloz!");
        //2:
//        int cantidadMarcas = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingresa la cantidad de marcas a registrar: "));
//        System.out.println("Cantidad de marcas: " + cantidadMarcas);
        // 3: 
//        String marcaVehiculos[] = new String[cantidadMarcas]; // crear vector del tamaño definido por el usuario
//        for(int contadorMarcas = 0; contadorMarcas < marcaVehiculos.length; contadorMarcas = contadorMarcas + 1){
//            marcaVehiculos[contadorMarcas] = JOptionPane.showInputDialog("Ingresa la marca #" + (contadorMarcas + 1) + ":");
//        }
        
//        System.out.println("Marca 1:" + marcaVehiculos[0]);
//        System.out.println("Marca 1:" + marcaVehiculos[1]);
//        System.out.println("Marca 1:" + marcaVehiculos[2]);

//        for(int contadorMarcas = 0; contadorMarcas < marcaVehiculos.length; contadorMarcas = contadorMarcas + 1){
//           System.out.println(marcaVehiculos[contadorMarcas]); 
//        }
        
        int numeros[] = {3, 9, 12, 17, 20, 23, 87, 98, -2, 56};
        //realizar un programa que diga si los numeros en el vector son multiplos de dos
        int contadorWhile = 0;
//        while(contadorWhile < numeros.length){
//            System.out.println(numeros[contadorWhile]);
//            contadorWhile = contadorWhile + 1;
//        }
        while(contadorWhile < numeros.length){
            if(numeros[contadorWhile] % 2 == 0){
                System.out.println("El numero " + numeros[contadorWhile] + ", es par!");
            }
            contadorWhile = contadorWhile + 1;
        }
        
        // encuentre el primer numero par de la lista?
        contadorWhile = 0;
        while(contadorWhile < numeros.length){
            if(numeros[contadorWhile] % 2 == 0){
                System.out.println("Hey encontre el primer numero par: " + numeros[contadorWhile]);
                break;
            }
            contadorWhile = contadorWhile + 1;
        }
        
        // mostrar los numeros impares
        contadorWhile = 0;
        while(contadorWhile < numeros.length){
            if(numeros[contadorWhile] % 2 != 0){
                System.out.println("El numero " + numeros[contadorWhile] + ", es impar!");
            }
            contadorWhile = contadorWhile + 1;
        }
        
   }
}
