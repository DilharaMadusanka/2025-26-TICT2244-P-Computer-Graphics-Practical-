import javax.swing.*;
import java.awt.*;

public class Q2 extends JFrame{
	
    public Q2(){
		setSize(1600,1200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
		
		g2.setStroke(new BasicStroke(5));
		g2.fillRect(100,100,200,600);
		
		g2.setColor(Color.RED);
		g2.fillOval(125,140,150,150);
		
		g2.setColor(Color.YELLOW);
		g2.fillOval(125,315,150,150);
		
		g2.setColor(Color.GREEN);
		g2.fillOval(125,490,150,150);
			
	}
	public static void main(String[] args){
		Q2 frame = new Q2();
	}
}
