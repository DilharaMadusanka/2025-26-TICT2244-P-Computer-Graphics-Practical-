import javax.swing.*;
import java.awt.*;

public class DrawRect extends JFrame{
	
	public DrawRect(){
		setSize(2000,1000);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g ;
		
		g2.setColor(Color.GREEN);
		g2.setStroke(new BasicStroke(15));
		g2.fillRect(50,50,400,300);
		g2.setColor(Color.BLACK);
		g2.drawRect(50,50,400,300);
		
		g2.setColor(Color.RED);
		g2.setStroke(new BasicStroke(15));
		g2.fillRect(350,250,400,300);
		g2.setColor(Color.BLACK);
		g2.drawRect(350,250,400,300);
		
		g2.setColor(Color.BLUE);
		g2.setStroke(new BasicStroke(15));
		g2.fillRect(650,450,400,300);
		g2.setColor(Color.BLACK);
		g2.drawRect(650,450,400,300);
	}
	
	public static void main(String[] args){
		
		DrawRect frame = new DrawRect();
		
	}
}
