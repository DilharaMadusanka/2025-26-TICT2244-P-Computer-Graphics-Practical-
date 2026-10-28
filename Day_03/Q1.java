import javax.swing.*;
import java.awt.*;
public class Q1 extends JFrame{
            public Q1(){
            setSize(1600,800);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        @Override
        public void paint(Graphics g){
			super.paint(g);
			Graphics2D g2 = (Graphics2D) g;
			
			g2.setStroke(new BasicStroke(5));
			g2.drawRect(200,200,300,200);
			
			g2.setStroke(new BasicStroke(5));
			g2.drawLine(150,200,550,200);
			
			g2.setStroke(new BasicStroke(5));
			g2.drawLine(150,200,350,100);
			
			g2.setStroke(new BasicStroke(5));
			g2.drawLine(350,100,550,200);
			
			g2.setStroke(new BasicStroke(5));
			g2.drawRect(250,250,50,100);
			
			g2.setStroke(new BasicStroke(5));
			g2.drawRect(250,250,25,100);
			
			g2.setStroke(new BasicStroke(5));
			g2.drawRect(400,250,50,100);
			
			g2.setStroke(new BasicStroke(5));
			g2.drawRect(400,250,25,100);
			
			g2.setStroke(new BasicStroke(5));
			g2.drawRect(325,300,50,100);
			
		}
    public static void main(String[] args){
       Q1 frame = new Q1();
    }
}
