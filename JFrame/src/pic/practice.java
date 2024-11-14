package pic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class practice extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		
					practice frame = new practice();
					frame.setVisible(true);
	}
	public practice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel carr = new JLabel();
		carr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
	            if(e.getKeyCode() == KeyEvent.VK_UP) {
					
		           setLocation(carr.getX(), carr.getY()-10);	
		 			
				}
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					
					setLocation(carr.getX(), carr.getY()+10);
				}
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					setLocation(carr.getX()-10, carr.getY());
				}
				if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					setLocation(carr.getX()+10, carr.getY());
				}
			}
		});
		carr.setBackground(Color.BLACK);
		carr.setBounds(171, 195, 46, 14);
		carr.setOpaque(true);
		contentPane.add(carr);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(5, 5, 424, 251);
		contentPane.add(lblNewLabel);
	}

}
