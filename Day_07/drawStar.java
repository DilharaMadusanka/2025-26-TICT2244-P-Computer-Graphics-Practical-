import javax.swing.*;
import java.awt.*;
public class drawStar extends JFrame{
	
	public drawStar(){
		setTitle("Draw Star");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,800);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.BLACK);
		
		drawStar(g,300,300,500,250);
		drawStar(g,500,250,550,50);
		drawStar(g,550,50,600,250);
		drawStar(g,600,250,800,300);
		drawStar(g,800,300,600,350);
		drawStar(g,600,350,550,550);
		drawStar(g,550,550,500,350);
		drawStar(g,500,350,300,300);
	}
	private void drawStar(Graphics g, int x1, int y1, int x2, int y2){
		
		int dx = x2 - x1;
		int dy = y2 - y1;
		
		int steps;
		
		if(Math.abs(dx) > Math.abs(dy)){
			steps = Math.abs(dx);
		}else{
			steps = Math.abs(dy);
		}
		
		float xInc = (float) dx/steps;
		float yIne = (float) dy/steps;
		
		float x = x1;
		float y = y1;
		
		for(int i = 0; i <= steps; i++){
			
			g.fillRect(Math.round(x),Math.round(y),2,2);
			x += xInc;
			y += yIne;
			
		}
		
		
	}
	
	public static void main(String[] args){
		new drawStar();
	}
}