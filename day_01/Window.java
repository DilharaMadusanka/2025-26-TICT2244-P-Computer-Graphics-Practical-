
import javax.swing.*;

public class Window{
  
  public static void main(String args[]){
     
    //Frame object using JFrame

    JFrame frame = new JFrame("Creating Frame");

    frame.setSize(700,300);
    frame.setResizable(false);
    frame.setLocation(500,200);

    //frame.setLocationRelativeTo(null);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   frame.setVisible(true);
 } 

}
