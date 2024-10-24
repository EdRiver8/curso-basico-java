package cursobasicojava;

import javax.swing.JOptionPane;


public class Ciclos3 {

    public static void main(String[] args) {
        // realizar un menu que permita al usuario seleccionar una opcion entre:
        // 1. agregar vehiculo (marca, modelo, placa, color)
        // 2. Listar los vehiculos
        // 3. Salir
        
        int cantidadMarcasIngresar 
            = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de vehiculos a almacenar: "));
        String[] listaMarcaVehiculos = new String[cantidadMarcasIngresar];
        String[] listaModeloVehiculos = new String[cantidadMarcasIngresar];
        String[] listaPlacaVehiculos = new String[cantidadMarcasIngresar];
        String[] listaColorVehiculos = new String[cantidadMarcasIngresar];
        
        int opcionSeleccionada = 0;
        
        String marca = "";
        String modelo = "";
        String placa = "";
        String color = "";
        
        int contadoVehiculos = 0;
        
        do{
           opcionSeleccionada 
                   = Integer.parseInt(JOptionPane
                           .showInputDialog("Bienvenido al taller mecanico, por favor selecciona una de las siguientes opciones\n" 
                           + "1. Agregar Vehiculo\n"
                           + "2. Mostrar vehiculos\n"
                           + "3. Editar vehiculo\n"
                           + "4. Salir"));
           switch(opcionSeleccionada){
               case 1:
                   marca = JOptionPane.showInputDialog("Ingresa la marca del vehiculo: ");
                   listaMarcaVehiculos[contadoVehiculos] = marca;
                   modelo = JOptionPane.showInputDialog("Ingresa la modelo del vehiculo: ");
                   listaModeloVehiculos[contadoVehiculos] = modelo;
                   placa = JOptionPane.showInputDialog("Ingresa la placa del vehiculo: ");
                   listaPlacaVehiculos[contadoVehiculos] = placa;
                   color = JOptionPane.showInputDialog("Ingresa el color del vehiculo: ");
                   listaColorVehiculos[contadoVehiculos] = color;
                   contadoVehiculos = contadoVehiculos + 1;
                   break;
               case 2:
                   break;
               case 3:
                   JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio! Hasta pronto.");
                   break;
               default:
                   JOptionPane
                           .showMessageDialog(null, 
                                   "La opcion seleccionada no es valida, intenta de nuevo!");
                   break;
           }
        }while(opcionSeleccionada != 3);
       
    }
    
}
