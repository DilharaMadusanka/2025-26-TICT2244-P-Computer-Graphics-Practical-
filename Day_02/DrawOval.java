import javax.swing.*;
import java.awt.*;

public class DrawOval extends JFrame{
	
	public DrawOval(){
		setSize(1200,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLUE);
		g2.setStroke(new BasicStroke(15));
		g2.drawOval(50,50,300,300);
		
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(15));
		g2.drawOval(400,50,300,300);
		
		g2.setColor(Color.RED);
		g2.setStroke(new BasicStroke(15));
		g2.drawOval(750,50,300,300);
		
		g2.setColor(Color.YELLOW);
		g2.setStroke(new BasicStroke(15));
		g2.drawOval(220,225,300,300);
		
		g2.setColor(Color.GREEN);
		g2.setStroke(new BasicStroke(15));
		g2.drawOval(580,225,300,300);
	}
	
	public static void main(String[] args){
		DrawOval frame = new DrawOval();
	}
}
