import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class LabExer7A{
	
	 public static void main(String[] args){
		 
	  RunNumberFinder Numberfinder = new RunNumberFinder();
	 
	 }
}
 class RunNumberFinder extends JFrame implements MouseListener{

	    
         FlowLayout Fl = new FlowLayout();
         Font Fnt1 = new Font("Arial", Font.BOLD, 100);
         String complete = "false";
 
         JLabel Jlbl1 = new JLabel("1");
         JLabel Jlbl2 = new JLabel("2");
         JLabel Jlbl3 = new JLabel("3");
         JLabel Jlbl4 = new JLabel("4");
         JLabel Jlbl5 = new JLabel("5");
         JLabel Jlbl6 = new JLabel("6");
         JLabel Jlbl7 = new JLabel("7");
         JLabel Jlbl8 = new JLabel("8");
         JLabel Jlbl9 = new JLabel("9");
         JLabel Jlbl0 = new JLabel("");
         
          int attempts = 1;
         int Rn = (int)(Math.random()*(9+1)+1);
         
       public RunNumberFinder(){
    	   
    	   
           super ("Number Finder");  
           JFrame Fr = new JFrame("Number Finder");
           Fr.setSize(600,200);
          
           Fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
           Fr.setLayout(Fl);
           Fr.setVisible(true);
           Fr.setLocationRelativeTo(null);
           
 
           Fr.add(Jlbl1);
           Fr.add(Jlbl2);
           Fr.add(Jlbl3);
           Fr.add(Jlbl4);
           Fr.add(Jlbl5);
           Fr.add(Jlbl6);
           Fr.add(Jlbl7);
           Fr.add(Jlbl8);
           Fr.add(Jlbl9);
           Fr.add(Jlbl0);
         
           
           Jlbl1.setFont(Fnt1);
           Jlbl2.setFont(Fnt1);
           Jlbl3.setFont(Fnt1);
           Jlbl4.setFont(Fnt1);
           Jlbl5.setFont(Fnt1);
           Jlbl6.setFont(Fnt1);
           Jlbl7.setFont(Fnt1);
           Jlbl8.setFont(Fnt1);
           Jlbl9.setFont(Fnt1);
          
 
           Jlbl1.addMouseListener(this);
           Jlbl2.addMouseListener(this);
           Jlbl3.addMouseListener(this);
           Jlbl4.addMouseListener(this);
           Jlbl5.addMouseListener(this);
           Jlbl6.addMouseListener(this);
           Jlbl7.addMouseListener(this);
           Jlbl8.addMouseListener(this);
           Jlbl9.addMouseListener(this);
           
           
}
        
    public void mouseClicked(MouseEvent event){
 
    	String num = Integer.toString(Rn);
    	
           if (event.getSource()==Jlbl1) {
                            
                    if(num.contains(Jlbl1.getText()))  {
                    	
                    	Jlbl1.setEnabled(true);
                    	Jlbl0.setText("Correct! " + attempts + " attempt(s)");
                    }
                    else {
                    	 Jlbl0.setText("Try Again!");
                         Jlbl1.setEnabled(false);
                         attempts++;
                    	
                    }
 
           }
               
           if(event.getSource()==Jlbl2){
                   
                   
                   if(num.contains(Jlbl2.getText()))  {
                   	
                   	Jlbl2.setEnabled(true);
                   	Jlbl0.setText("Correct! " + attempts + " attempt(s)");
                   }
                   else {
                	  
                       Jlbl0.setText("Try Again!");
                       Jlbl2.setEnabled(false);
                       attempts++;
                   }
 }
                
           if(event.getSource()==Jlbl3){
                
                   
                   if(num.contains(Jlbl3.getText()))  {
                      	
                      	Jlbl3.setEnabled(true);
                      	Jlbl0.setText("Correct! " + attempts + " attempt(s)");
                      }
                   else {
                	   
                	   
                       Jlbl0.setText("Try Again!");
                       Jlbl3.setEnabled(false);
                       attempts++;
                	   
                   }
 }
           
                if(event.getSource()==Jlbl4){
                  
                   
                   if(num.contains(Jlbl4.getText()))  {
                      
                      	Jlbl4.setEnabled(true);
                      	Jlbl0.setText("Correct! " + attempts + " attempt(s)");
                      }
                   else {
                	   
                	 
                       Jlbl0.setText("Try Again!");
                       Jlbl4.setEnabled(false);
                       attempts++;
                   }
                   
 }
                if(event.getSource()==Jlbl5){
                   
                   
                   
                   if(num.contains(Jlbl5.getText()))  {
                      	
                      	Jlbl5.setEnabled(true);
                      	Jlbl0.setText("Correct! " + attempts + " attempt(s)");
                      }
                   else {
                	   
                	   Jlbl0.setText("Try Again!");
                       Jlbl5.setEnabled(false);
                       attempts++;
                   }
 }
                if(event.getSource()==Jlbl6){
                	
                	
                  
                   if(num.contains(Jlbl6.getText()))  {
                      	
                      	
                      	Jlbl0.setText("Correct! " + attempts + " attempt(s)");
                      	Jlbl6.setEnabled(true);
                      }
                   else {
                	   
                	   Jlbl6.setEnabled(false);
                       Jlbl0.setText("Try Again!");                     
                       attempts++;
                   }
 }
                if(event.getSource()==Jlbl7){
                   
                   
                    
                    if(num.contains(Jlbl7.getText()))  {
                       	
                       	
                       	Jlbl0.setText("Correct! " + attempts + " attempt(s)");
                       	Jlbl7.setEnabled(true);
                       }
                    else {
                    	
                    	Jlbl0.setText("Try Again!");
                        Jlbl7.setEnabled(false);
                         attempts++;
                    }
 }
                 if(event.getSource()==Jlbl8)
 {
                     
                     
                     
                     if(num.contains(Jlbl8.getText()))  {
                        	
                        	Jlbl8.setEnabled(true);
                        	Jlbl0.setText("Correct! " + attempts + " attempt(s)");
                        }
                     else {
                    	 Jlbl0.setText("Try Again!");
                         Jlbl8.setEnabled(false);
                         attempts++;
                     }
 }
                  if(event.getSource()==Jlbl9){
                     
                   
                     
                     if(num.contains(Jlbl9.getText()))  {
                        	
                        	Jlbl9.setEnabled(true);
                        	Jlbl0.setText("Correct! " + attempts + " attempt(s)");
                        }
                     else {
                    	  Jlbl0.setText("Try Again!");
                          Jlbl9.setEnabled(false);
                          attempts++;
                     
                  }
 }
    	
                  
}

          public void mousePressed(MouseEvent e){
}

          public void mouseReleased(MouseEvent e){
        	
}
 
          public void mouseEntered(MouseEvent e){
        	  
        	
}
 
          public void mouseExited(MouseEvent e){
        	
}
}