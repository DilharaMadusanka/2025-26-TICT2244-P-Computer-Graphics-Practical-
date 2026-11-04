import javax.swing.*;
import java.awt.*;
public class DrawHexagon extends JFrame{
	
	public DrawHexagon(){
		setTitle("Drow Hexagon !");
		setSize(1200,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(20));
		
		int[] xPoints = {400,500,700,800,700,500,400};
		int[] yPoints = {400,200,200,400,600,600,400};
		
		g2.drawPolygon(xPoints, yPoints, xPoints.length);
		g2.setColor(Color.ORANGE);
		g2.fillPolygon(xPoints, yPoints, xPoints.length);
	}
	
	public static void main(String[] args){
		
		DrawHexagon frame = new DrawHexagon();
		
	}
	
}
