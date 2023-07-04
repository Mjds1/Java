public class Promedio {
  public static void main(String arg[]){
   
   int matematicas = 5;
   int biologia = 5;
   int quimica = 7;
   int promedio = 0;

   promedio = (matematicas + biologia + quimica) /3;

   if(promedio >= 6){
    System.out.print("El alumno aprobó " + promedio);
   } else {
    System.out.print("El alumno reprobó " + promedio);
   }
 }
}