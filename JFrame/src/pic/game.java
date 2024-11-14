package pic;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class game extends JFrame {
	public game() {
	}

	public static void main(String[] args) {
		
					miko frame = new miko();
					
	}
}
	
	class miko extends JFrame implements KeyListener {
		
		public JPanel contentPane;
		public JLabel car, car2;
		public Image back = new ImageIcon(miko.class.getResource("/pic/back.png")).getImage().getScaledInstance(400, 700, Image.SCALE_SMOOTH);
		public Image car1 = new ImageIcon(miko.class.getResource("/pic/car.png")).getImage().getScaledInstance(50, 80, Image.SCALE_SMOOTH);
		public Image car02 = new ImageIcon(miko.class.getResource("/pic/car002.png")).getImage().getScaledInstance(100, 75, Image.SCALE_SMOOTH);
		JButton start;
		JLabel finish;
		miko(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		start = new JButton("Start");
		start.setBounds(15,580,75,30);
	  // contentPane.add(start);
	   
		 finish = new JLabel();
		finish.setBounds(101,1,200,15);
		finish.setBackground(Color.red);
		add(finish);
		finish.setOpaque(true);
		
		car = new JLabel();	
		car.setBounds(241, 556, 50, 80);
		car.setIcon(new ImageIcon(car1));
		car.setBackground(getForeground());
		contentPane.add(car);
		car.setOpaque(true);
		
		car2 = new JLabel();
		car2.setBounds(101, 556, 100, 80);
		car2.setIcon(new ImageIcon(car02));
		car2.setBackground(getForeground());
		contentPane.add(car2);
		car2.setOpaque(true);
		
	
		
		addKeyListener(this);
		contentPane.add(car);	
		JLabel main = new JLabel();        
		main.setBounds(5, 5, 374, 651);
		contentPane.add(main);
		//main.setIcon(new ImageIcon(back));
	    getContentPane().setBackground(Color.gray);
		setVisible(true);
	
		
		
	
	}
		public void keyPressed(KeyEvent e) {
			   
			int s = (int)(Math.random()*(10-1+1)+1);
			int s2 = (int)(Math.random()*(10-1+1)+1);
			
			   if(e.getKeyCode() == KeyEvent.VK_UP) {
				  if( car.getY()>=10) { 
				   car.setLocation(car.getX(), car.getY()-s);
				  }
				   if (car2.getY()>=10) {
				   car2.setLocation(car2.getX(), car2.getY()-s2);
				
				  }
				}
			   else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					if(car.getY()!=576) {
					car.setLocation(car.getX(), car.getY()+10);
					
				}
				}
			   else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					if(car.getX()!=101) {
					car.setLocation(car.getX()-10, car.getY());
					
					}
				}
			   else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					if(car.getX()!=271){
					car.setLocation(car.getX()+10, car.getY());
					
				}
					
				}
			   System.out.println(car2.getLocation());

	}
		
		
		public void keyReleased(KeyEvent e) {
			
			
		}
        public void keyTyped(KeyEvent e) {
                 
		}
        
        public void colision() {
        	
        	
        }
}
