
package cursobasicojava;

/**
 *
 * @author dwein
 */
public class CondicionalesEjemplos {

    public static void main(String[] args) throws InterruptedException{
        // crear un programa que defina si una persona puede sacar su licencia de conduccion
        // Regla_1: Para sacar la licencia, se requiere ser mayor o igual a 16 años 
        
//        int edad = 16;
//        if(edad >= 16){ // si la condicion es verdadera
//            System.out.println("Puedes tramitar tu licencia!");
//        }else { // si la condicion es falsa
//            System.out.println("NO!!!! puedes tramitar tu licencia!");
//        }

        // realizar un programa que defina si una persona puede jugar en un equipo de basket
        // regla_1: su estatura debe ser de por lo menos 1.70
//        float estatura = 1.8f;
//        if(estatura >= 1.7){
//            System.out.println("Puedes jugar basket!");
//        }else{
//            System.out.println("No puedes jugar con el equipo");
//        }
        
        // El taller mecanico ofrece un descuento para las personas mayores a 55 años
        // realizar un programa que le diga al usuario si tiene o no derecho al descuento
        // Regla_1: si es mayor a 55, el descuento es de 5%
        // Regla_2: Las personas mayores de 64 tienen derecho al 10% de descuento
        // Regla_3: Una persona solo tiene derecho a un descuento, es en el rango en el que este
        // Regla_4: La empresa tiene 2 planes, general y preferencial, los cuales son acumulables
        // con los descuentos por edad, si es preferencial se descuenta el 3%, si es general
        // se descuenta el 1%
        
//        int edadPersona = 65;
//        if(edadPersona > 55 && edadPersona <= 64){
//            System.out.println("La persona tiene derecho al descuento del 5%");
//        }else if(edadPersona > 64){
//            System.out.println("La persona tiene derecho al descuento del 10%");
//        }else{
//            System.out.println("No tienes derecho a ninguno de los descuentos");
//        }
//        Otra Manera de hacer lo de arriba =>
//        int edadPersona = 64;
//        if(edadPersona > 64){
//            System.out.println("La persona tiene derecho al descuento del 10%");
//        }else if(edadPersona > 55){
//            System.out.println("La persona tiene derecho al descuento del 5%");
//        }else{
//            System.out.println("No tienes derecho a ninguno de los descuentos");
//        }

//        Otra Manera de hacer lo de arriba =>
//        int edadPersona = 64;
//        if(edadPersona < 55){
//            System.out.println("No tienes derecho a ninguno de los descuentos");
//        }else if(edadPersona < 64){
//            System.out.println("La persona tiene derecho al descuento del 5%");
//        }else{
//            System.out.println("La persona tiene derecho al descuento del 10%");
//        }


    // Un programa que diga si una persona tiene derercho al aux de transporte o no
    // Regla_1: Tiene que estar vinculado
    // Regla_2: debe ganarse cuando mucho dos salarios minimos
    
    // CasoPrueba_1: La persona esta vinculada y gana 3 millones, resultado esperado: No Aux Trans
    // CasoPrueba_2: persona vinculada y gana smmlv, resultado esperado: Si Aux trans
    // CasoPrueba_3: persona contratista y se gana 2.600.000
    // CasoPrueba_4: persona contratista y se gana 1.500.000
    // CasoPrueba_5: Persona vinculada que se gana 2.600.000
    
//        boolean variable = false;
//        System.out.println("variable: " + variable);
//        
//        if(!variable){
//            System.out.println("Ingrese al if");
//        }else{
//            System.out.println("No entro al if");
//        }
        
        //RN1: El vehiculo entra a una cola de espera para ser reparado
        //RN2: Cuando el vehiculo ingrese al taller su estado pasara a siendo reparado
        //RN3: Todo vehiculo inicia con estado negativo en reparacion (encolado)
        //RN4: cuando se termine el arreglo en el vehiculo, se marca como reparado
        
//        boolean esSiendoReparado = true; // controla si un vehiculo esta siendo reparado
//        boolean esReparado = false;
//        
//        if(esSiendoReparado){
//            System.out.println("Su vehiculo esta en el taller");
//            Thread.sleep(5000); // detiene el programa durante 5 segundos
//            esReparado = true; // el vehiculo finalizo sus reparaciones
//            esSiendoReparado = false;
//            System.out.println("Su vehiculo esta listo para ser recogido");
//        }else{
//            System.out.println("Su vehiculo en unos minutos sera ingresado al taller");
//        }
        
        // los condicionales tienen otra estructura de control que se llama switch
        // permiten evaluar diferentes escenarios
        /* 
            switch(condicion){
                case1: 
                    break;
                Case2:
                    break;
                case:
                    break;
                default:
           }

           un programa que dependiendo del numero de dia que ingrese (1 - 7)
           muestre el dia de la semana
         */
           
           int dia = 5; // variable para almacenar el numero de dia a evaluar
           
//           if(dia == 1){
//               System.out.println("Lunes");
//           }else if(dia == 2){
//               System.out.println("martes");
//           }else if(dia == 3){
//               System.out.println("miercoles");
//           }else if(dia == 4){
//               System.out.println("jueves");
//           }else if(dia == 5){
//               System.out.println("viernes");
//           }else if(dia == 6){
//               System.out.println("sabado");
//           }else if(dia == 7){
//               System.out.println("domingo");
//           }else {
//               System.out.println("Error, numero no valido!");
//           } 
           
//        char letra = 'A'; // case sensitive
//        switch(letra){
//            case 'E':
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("martes");
//                break;
//            case 'a':
//                System.out.println("miercoles");
//                break;
//            case 4:
//                System.out.println("jueves");
//                break;
//            case 'A':
//                System.out.println("viernes");
//                break;
//            case 6:
//                System.out.println("sabado");
//                break;
//            case 7:
//                System.out.println("domingo");
//                break;
//            default:
//                System.out.println("Error, numero no valido!");
//                break;
//        }
           
        // Hagamos un programa que segun el personaje de DBZ nos de informacion
        // RN1: Selecciona a Goku, muestre que selecciono al protagonista
        // RN2: Selecciona a Vegeta, muestre que el principe de los saiyajin
        // RN3: Selecciona a Piccolo, muestre que Piccolo es un Namekusein
        // ...
        // RNn
//        String guerreroZ = "Chaos";
        
//        if(guerreroZ == "Goku"){
//            System.out.println("selecciono al protagonista");
//        }else if(guerreroZ == "Vegeta"){
//            System.out.println("El principe de los saiyajin");
//        }else if(guerreroZ == "Piccolo"){
//            System.out.println("Piccolo es un Namekusein");
//        }

//        switch(guerreroZ){
//            case "Goku":
//                System.out.println("Selecciono al protagonista");
//                break;
//            case "Vegeta":
//                System.out.println("El principe de los saiyajin");
//                break;
//            case "Piccolo":
//                System.out.println("Piccolo es un Namekusein");
//                break;
//            case "Gohan":
//                System.out.println("Gohan el hijo de Goku");
//                break;
//            case "Krillin":
//                System.out.println("El fiel compa");
//                break;
//            case "Trunks":
//                System.out.println("El de la espada");
//                break;
//            case "Goten":
//                System.out.println("Goku chiquito");
//                break;
//            default:
//                System.out.println("Hey!!!, el personaje seleccionado no existe.");
//                break;
//        }
        
        // Operador ternario: es una forma corta de escribir o evaluar condiciones
        // con el uso de los if, operador ternario ?
        // el uso es para instrucciones sencillas, es decir que no lleven'
        // mas de una linea de 
//        String msjPersonajeSeleccionado = guerreroZ == "Goku" 
//                ? "Selecciono al protagonista" : "no es goku";
        
        String guerreroZ = "Vegeta";        

        String msjPersonajeSeleccionado = guerreroZ == "Goku" 
                ? "Selecciono al protagonista" : guerreroZ == "Vegeta" 
                    ? "El principe de los saiyajin" : guerreroZ == "Piccolo"
                        ? "Piccolo es un Namekusein" : "Error";
        
        
        System.out.println(msjPersonajeSeleccionado);
        
        if(guerreroZ.equals("Vegeta")){
           System.out.println("El principe de los saiyajin");
        }
                
                
    }
    
}
