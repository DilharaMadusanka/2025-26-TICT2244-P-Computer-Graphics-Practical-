import javax.swing.*;
import java.awt.*;

public class RoundRect extends JFrame{

  public RoundRect(){
    setTitle("Round Rectangle");
    setSize(500,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true); 
  }
  @Override
  public void paint(Graphics g){
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;

    g2.setColor(Color.GREEN);
    g2.setStroke(new BasicStroke(15));
    g2.drawRoundRect(50,50,300,200,30,30);
	
	g2.setColor(Color.BLACK);
    g2.fillRoundRect(50,50,300,200,30,30);

    
  }

  public static void main(String[] args){
      RoundRect frame = new RoundRect();
  }
}
