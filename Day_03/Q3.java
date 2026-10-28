import javax.swing.*;
import java.awt.*;

public class Q3 extends JFrame{
	
	public Q3(){
		setSize(1600,1200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setStroke(new BasicStroke(15));
		g2.drawRoundRect(200,200,400,300,30,30);
		
		g2.setStroke(new BasicStroke(15));
		g2.drawLine(225,100,300,200);
		
		g2.setStroke(new BasicStroke(15));
		g2.drawLine(550,100,475,200);
		
		g2.setStroke(new BasicStroke(15));
		g2.drawRoundRect(150,300,50,80,30,30);
		
		g2.setStroke(new BasicStroke(15));
		g2.drawRoundRect(600,300,50,80,30,30);
		
		g2.setStroke(new BasicStroke(15));
		g2.drawOval(300,300,50,50);
		
		g2.setStroke(new BasicStroke(15));
		g2.drawOval(450,300,50,50);
		
		g2.setStroke(new BasicStroke(15));
		g2.drawLine(350,425,450,425);
	}
	public static void main(String[] args){
		
		Q3 frame = new Q3();
		
	}
}
