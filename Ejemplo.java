import java.util.Scanner;
public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Mamá puedo ir a la fiesta?");
        String respuesta = sc.next();

        if(respuesta.equalsIgnoreCase("sí")) {
            System.out.println("¿Has terminado tu tarea?");
            String tarea = sc.next();

            if(tarea.equalsIgnoreCase("sí")) {
                System.out.println("Muy bien, puedes ir a la fiesta");
            } else {
                System.out.println("Debes terminar tu tarea primero");
            }
        } else {
            System.out.println("Entonces no puedes ir a la fiesta");
        }
    }
}