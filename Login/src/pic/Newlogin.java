package pic;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Newlogin {

	private JFrame frame;
    private int mouseX , mouseY;
    private JPasswordField Password;
    private JTextField Username;
   
	private Image log = new ImageIcon(Newlogin.class.getResource("/pic/log.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image user = new ImageIcon(Newlogin.class.getResource("/pic/user.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image pass = new ImageIcon(Newlogin.class.getResource("/pic/pass.jpg")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Newlogin window = new Newlogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Newlogin() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 450, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setForeground(SystemColor.desktop);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				   
				frame.setLocation(frame.getX() + e.getX() - mouseX,frame.getY() + e.getY() - mouseY);
			   
			
			}

		});
	
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(0, 0, 450, 23);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel exit = new JLabel("X");
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			        System.exit(0);
				   
			}
		
			public void mouseEntered(MouseEvent e) {
				exit.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				exit.setForeground(Color.WHITE);
			}
		});
		exit.setForeground(SystemColor.inactiveCaptionBorder);
		exit.setFont(new Font("Arial Black", Font.BOLD, 14));
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		exit.setBounds(427, 0, 23, 14);
		panel_1.add(exit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(129, 177, 197, 34);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(98, 5, 0, 0);
		panel_2.add(lblNewLabel_1);
		
		Username = new JTextField();
		Username.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
						if(Username.getText().equals("Username")) {
							Username.setText("");
						}
						else {
							Username.selectAll();
						}
					}
					@Override
					public void focusLost(FocusEvent e) {
						if(Username.getText().equals("")) {
							Username.setText("Username");
						}
						else {
							Username.selectAll();
						}
					}
				});
		Username.setText("Username");
		Username.setBorder(null);
		Username.setBounds(0, 5, 151, 24);
		panel_2.add(Username);
		Username.setColumns(10);
		
		JLabel userpic = new JLabel("");
		userpic.setBounds(151, 0, 46, 34);
		panel_2.add(userpic);
		userpic.setIcon(new ImageIcon(user));
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(129, 222, 197, 34);
		panel.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(98, 5, 0, 0);
		panel_2_1.add(lblNewLabel_1_1);
		
		Password = new JPasswordField();
		Password.setEchoChar((char)0);
		Password.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent e) {
				if(Password.getText().equals("Password")) {
			    	 Password.setEchoChar('●');
			    	 Password.setText("");
			    	 
			     }
			     else {
			    	 Password.selectAll(); 	 
			     }
			}
			
			public void focusLost(FocusEvent e) {
				if(Password.getText().equals("")) {		 
			    	 Password.setText("Password");
			    	 Password.setEchoChar((char)0);
			    	 
				}
				else {
					 Password.selectAll(); 	
				}
			}
		});
		Password.setText("Password");
		Password.setBorder(null);
		Password.setBounds(0, 5, 151, 24);
		panel_2_1.add(Password);
		
		JLabel passpic = new JLabel("");
		passpic.setBounds(151, 0, 46, 34);
		panel_2_1.add(passpic);
		passpic.setIcon(new ImageIcon(pass));
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(251, 272, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(120, 272, 89, 23);
		panel.add(btnLogIn);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(280, 177, 46, 34);
		panel.add(lblNewLabel_2);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(142, 57, 163, 115);
		panel.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(log));
	}
}
