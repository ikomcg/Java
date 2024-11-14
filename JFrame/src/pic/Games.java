package pic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Games extends JFrame {
	public Games() {
	}
	
	private JPanel contentPane;
    private JLabel lbl;
    private int y;
	public static void main(String[] args) {
		
					mikos frame = new mikos();
					
	}
}
	 class mikos extends JFrame implements KeyListener {
		public Image car = new ImageIcon(miko.class.getResource("/pic/car.png")).getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
		public Image back = new ImageIcon(miko.class.getResource("/pic/back.png")).getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
		public JLabel label, lb1;
		public JFrame frame;
		ImageIcon icon;
		mikos (){
		 JFrame jf = new JFrame();
		 JLabel jl = new JLabel();
	     FlowLayout Fl = new FlowLayout();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(400,700);
			jl.setSize(400,700);
			jf.setLayout(Fl);
			
			jf.addKeyListener(this);
			jf.setLocationRelativeTo(null);
			jl.setBackground(Color.black);
			
			
			label = new JLabel();
			label.setBounds(140,510, 100, 150);		
			label.setIcon(new ImageIcon(car));
			label.setBackground(getForeground());
			label.setOpaque(true);
			jl.setOpaque(true);
			jl.add(label);
			jf.setVisible(true);
			jl.setVisible(true);
			
			
	}
	
	
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					
					label.setLocation(label.getX(), label.getY()-10);	
					
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					
					label.setLocation(label.getX(), label.getY()+10);
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					label.setLocation(label.getX()-10, label.getY());
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					label.setLocation(label.getX()+10, label.getY());
				}
				System.out.println(label.getLocation());
				
			
			}

			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}


			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}


	}
	


