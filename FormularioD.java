import javax.swing.*;

public class FormularioD extends JFrame{

  public FormularioD(){
   setLayout(null);  
 }

  public static void main(String args[]){
   FormularioD formulario1 = new FormularioD();
   formulario1.setBounds(0,0,800, 550);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);
   formulario1.setResizable(false);
 }
}