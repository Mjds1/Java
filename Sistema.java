import java.util.Scanner;

public class Sistema {
  public static void main (String args []){
   Scanner entrada = new Scanner (System.in);
   String nombre = "";
   int clave = 0, antiguedad = 0;
   System.out.print("*******************************************************************");
   System.out.print("Bienvenido al sistemas vacacional de *Coca-Cola Company*");
   System.out.print("*******************************************************************");
   System.out.print("");
   System.out.print("");
   
   System.out.print("¿Cuál es el nombre del trabajador?: ");
   nombre = entrada.nextLine();
   System.out.print("");

   System.out.print("¿Cuanto tiempo de servicio tiene el trabajador?: ");
   antiguedad = entrada.nextInt(); 
   System.out.print("");

   System.out.print("¿Cuál es la clave la del trabajador");
   clave = entrada.nextInt();
   System.out.print("");
 
   if(clave == 1){
   
     if(antiguedad == 1){
        System.out.print("El trabajador " +nombre +  " tiene derecho a 6 dias de vacaciones ");
     } else if (antiguedad >= 2 && antiguedad <= 6){
        System.out.print("El trabajador " + nombre + " tiene a 14 dias de vacaciones ");
    }  else if (antiguedad >= 7 ){
        System.out.print("El trabajador " + nombre + "tiene derecho a 20 dias de vacaciones ");
    }
      
   } else if(clave == 2 ){
      
      if(antiguedad == 1){
        System.out.print("El trabajador " +nombre +  " tiene derecho a 7 dias de vacaciones ");
     } else if (antiguedad >= 2 && antiguedad <= 6){
        System.out.print("El trabajador " + nombre + " tiene a 15 dias de vacaciones ");
    }  else if (antiguedad >= 7 ){
        System.out.print("El trabajador " + nombre + "tiene derecho a 22 dias de vacaciones ");
    }

   } else if(clave == 3 ){
  
      if(antiguedad == 1){
        System.out.print("El trabajador " +nombre +  " tiene derecho a 10 dias de vacaciones ");
     } else if (antiguedad >= 2 && antiguedad <= 6){
        System.out.print("El trabajador " + nombre + " tiene a 20 dias de vacaciones ");
    }  else if (antiguedad >= 7 ){
        System.out.print("El trabajador " + nombre + "tiene derecho a 30 dias de vacaciones ");
    }

   } else {
    System.out.print("Error la clave de departamento es incorrecta"); 
   } 

 }
}