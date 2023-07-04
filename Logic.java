import java.util.Scanner;

public class Logic{
  public static void main(String args[]){

   String usuario = "", password = "";
   Scanner entrada = new Scanner(System.in);

   System.out.print("Ingresa tu nombre de usuario: ");
   usuario = entrada.nextLine();

   System.out.print("Ingresa tu nombre de contraseña: ");
   password = entrada.nextLine();

   if(usuario.equals("ernesto") && password.equals("12345")){
    System.out.println("Inicio de sesión correcto");
   } else {
      System.out.println("Nombre de usuario o contraseña incorrecto");
   } 
 }
}