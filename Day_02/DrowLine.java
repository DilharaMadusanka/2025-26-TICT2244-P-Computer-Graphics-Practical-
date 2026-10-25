import javax.swing.*;
import java.awt.*;

public class DrawLine extends JFrame{
    
    public DrawLine(){
      setSize(1600,2000);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
      super.paint(g);
      
      Graphics2D g2 = (Graphics2D) g;

      g2.setColor(Color.BLACK);
	  g2.setStroke(new BasicStroke(5));
	  g2.drawLine(50,50,250,250);
	  
	  g2.setColor(Color.BLACK);
	  g2.setStroke(new BasicStroke(5));
	  g2.drawLine(800,400,1000,600);
      
    }

  public static void main(String[] args){
    
    DrawLine frame = new DrawLine();
  }
}
