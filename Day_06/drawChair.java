import javax.swing.*;
import java.awt.*;

public class drawChair extends JFrame{
	
	public drawChair(){
		
		setTitle("Draw Chair!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,800);
		setVisible(true);
	}
	
	
	public static void main(String[] args){
		
		new drawChair();
	}
}
