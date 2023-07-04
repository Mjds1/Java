public class IfElse {
  public static void main(String args[]) {
    
    boolean estaLloviendo = true;
    boolean haceFrio = false;
    
    if(estaLloviendo)
        if(haceFrio)
          System.out.println("Voy corriendo");
    else
      System.out.println("Voy andando");
  }
}