import javax.swing.*;
import java.awt.*;
public class BresenhamLine extends JFrame{
   public BresenhamLine(){
      setTitle("Draw Star");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(1200,800);
      setVisible(true);
   }
   
   @Override
   public void paint(Graphics g){
      super.paint(g);
      g.setColor(Color.BLACK);
      bresenhamLine(g,100,50,200,50);
      bresenhamLine(g,100,50,100,150);
   }
   private void bresenhamLine(Graphics g,int x1, int y1, int x2, int y2){


     int dx = x2 - x1;
     int dy = y2 - y1;
      
     int x = x1;
     int y = y1;
     
     int p = 2 * dy - dx;

     int xInc = (x1 < x2) ? 1 : -1;
     int yInc = (y1 < y2) ? 1 : -1;

     g.fillOval(x,y,2,2);

     while(x < x2){
          x += xInc;
          if(p < 0){
            p += 2 * dy;
          }else{
            y += yInc;
            p = p + 2 * dy - 2 * dx;
          }
        g.fillOval(x,y,2,2);
     }

   }

public static void main(String[] args){
    
    new BresenhamLine();
  }
}