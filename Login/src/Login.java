
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;


import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
	

	private int mouseX, mouseY;
	private Image log = new ImageIcon(Login.class.getResource("/pic/log.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image user = new ImageIcon(Login.class.getResource("/pic/user.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image pass = new ImageIcon(Login.class.getResource("/pic/pass.jpg")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private JPanel contentPane;
	
	JTextField UserName;
	JPasswordField Password;
	
	
	private JTextField txtsignin;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Login() {
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 319, 416);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBorder(new EmptyBorder(0, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBounds(5, 0, 309, 411);
		
		contentPane.setLayout(null);
		panel.setBackground(new Color(0, 102, 204));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel exit = new JLabel("X");
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Confirmation", JOptionPane.YES_NO_OPTION)==0)
					dispose();
				   
			}
		
			public void mouseEntered(MouseEvent e) {
				exit.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				exit.setForeground(Color.WHITE);
			}
		});
		exit.setForeground(new Color(245, 245, 245));
		exit.setFont(new Font("Arial", Font.BOLD, 14));
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		exit.setBounds(293, 0, 16, 14);
		panel.add(exit);
		JPanel panel_2 = new JPanel();
		panel_2.addMouseMotionListener(new MouseMotionAdapter() {
			   
			
			public void mouseDragged(MouseEvent e) {
			     setLocation(getX() + e.getX() - mouseX, getY() + e.getY() - mouseY);
				
			}
		});
    
		panel.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(0, 0, 309, 14);
		panel.add(panel_2);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.textHighlightText);
		panel_1.setBounds(71, 119, 164, 46);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		UserName = new JTextField();
		UserName.setToolTipText("");
		UserName.setText("Username");
		UserName.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent e) {
				if(UserName.getText().equals("Username")) {
					UserName.setText("");
				}
				else {
					UserName.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(UserName.getText().equals("")) {
					UserName.setText("Username");
				}
				else {
					UserName.selectAll();
				}
			}
		});
		UserName.setBorder(null);
		UserName.setDisabledTextColor(new Color(255, 255, 255));
		UserName.setCaretColor(new Color(0, 0, 0));
		UserName.setBounds(10, 11, 106, 24);
		panel_1.add(UserName);
		UserName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(118, 0, 46, 46);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(user));
		
		
		JButton btnLogin = new JButton("login");
		
    btnLogin.addMouseListener(new MouseAdapter() {
			
	public void mouseEntered(MouseEvent e) {
		btnLogin.setForeground(Color.RED);
	}
	public void mouseExited(MouseEvent e) {
		btnLogin.setForeground(Color.BLACK);
	}
		});
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {

			       
			           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg/log", "root","");
			          
			              
			              String username = UserName.getText();
			              String pass = Password.getText();
			            
			              Statement st = con.createStatement();
			              String sql = "select * from miko where user='"+username+"' and password='"+ pass+"'" ;
			              ResultSet rs = st.executeQuery(sql);
			            
			              if(rs.next()) {
			            	 Dashboard db = new Dashboard();
			            	 db.show();
			            	 Login.this.dispose();
			              }
			             
			              else {
			            	  JOptionPane.showMessageDialog(null,"Account Invalid");
			              }
					}
			        catch (Exception ex){
			            System.out.println(ex);
			        }	
			}
			
		});
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBackground(new Color(255, 215, 0));
		btnLogin.setBounds(49, 241, 89, 23);
		panel.add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Register lg = new Register();
				lg.show();
				Login.this.dispose();
			}
			public void mouseEntered(MouseEvent e) {
				btnRegister.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				btnRegister.setForeground(Color.BLACK);
			}
		});
		btnRegister.setForeground(Color.BLACK);
		btnRegister.setBackground(new Color(255, 215, 0));
		btnRegister.setBounds(169, 241, 89, 23);
		panel.add(btnRegister);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBounds(71, 176, 164, 46);
		panel.add(panel_1_1);
		
		Password = new JPasswordField();
		Password.setText("Password");
		Password.setEchoChar((char) 0);
		Password.addFocusListener(new FocusAdapter() {
			@Override
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
		Password.setBorder(null);
		Password.setBounds(10, 11, 109, 24);
		panel_1_1.add(Password);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(118, 0, 46, 46);
		panel_1_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setIcon(new ImageIcon(pass));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(108, 11, 97, 108);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(log));
		
		
	}
}

