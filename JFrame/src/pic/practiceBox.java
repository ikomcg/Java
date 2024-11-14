package pic;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class practiceBox extends JFrame{

	//
	
	public static void main(String[] args) {
		
		            
		            JFrame jf = new JFrame("My Box");				
					jf.setSize(500,500);
					jf.setVisible(true);
					jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					jf.setLocationRelativeTo(null);
		             
					
					createbox cb = new createbox();
					jf.add(cb);
					
		         
	}
    	
 }


