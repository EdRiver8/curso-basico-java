package cursobasicojava;

import javax.swing.JOptionPane;

public class Ciclos2 {

    public static void main(String[] args) {
       // programa que le permita al usuario ingresar una cantidad n de marcas
       // RN1: No deberia permitir ingresar letras en la cantidad n de marcas
       // RN2: No deberia permitir ingresar 0 o negativos "" "" ""
       int cantidadMarcasIngresar 
               = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de marcas a almacenar: "));
       String[] listaMarcaVehiculos = new String[cantidadMarcasIngresar];
       int contadorDeMarcas = 0;
       while(contadorDeMarcas < listaMarcaVehiculos.length){
           listaMarcaVehiculos[contadorDeMarcas] 
                   = JOptionPane.showInputDialog("Ingresa la marca # " + (contadorDeMarcas + 1));
           contadorDeMarcas = contadorDeMarcas + 1;            
       }
       
       int contadorRecorrerMarcas = 0;
       while(contadorRecorrerMarcas < listaMarcaVehiculos.length){
           System.out.println("Marca #: " + (contadorRecorrerMarcas + 1) 
                   + " " + listaMarcaVehiculos[contadorRecorrerMarcas]);
           contadorRecorrerMarcas = contadorRecorrerMarcas + 1;
       }
       
       // do - while, es otra forma de ciclos, que nos garantiza por lo menos una ejecucion
       // busqueda de una marca determinada, buscar Toyotas y contarlos
       int contadorDeToyota = 0;
       int contadorDeControlParaListaDeMarcas = 0;
       do{
           if(listaMarcaVehiculos[contadorDeControlParaListaDeMarcas].equals("Toyota")){
               contadorDeToyota = contadorDeToyota + 1;
//               contadorDeToyota++;
           }
           contadorDeControlParaListaDeMarcas = contadorDeControlParaListaDeMarcas + 1;
       }while(contadorDeControlParaListaDeMarcas < listaMarcaVehiculos.length);
       
        System.out.println("La cantidad de Toyotas en la lista es: " + contadorDeToyota);
    }
    
}
