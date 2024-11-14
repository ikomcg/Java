
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.SystemColor;


public class Register extends JFrame {

	protected static String JTextField;
	private JPanel contentPane;
	public static JTextField EnterUserName;
	public static JPasswordField EnterPassword;
	public String text;
	public String text1;
	private Image log = new ImageIcon(Login.class.getResource("/pic/log.png")).getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
	private Image user = new ImageIcon(Login.class.getResource("/pic/user.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image pass = new ImageIcon(Login.class.getResource("/pic/pass.jpg")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Register() {  
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(123, 115, 182, 40);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel psinfo = new JLabel("");
		psinfo.setFont(new Font("Arial", Font.PLAIN, 11));
		psinfo.setForeground(Color.RED);
		psinfo.setBounds(123, 163, 182, 14);
		panel.add(psinfo);
		
		EnterUserName = new JTextField();
		EnterUserName.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent e) {
				if(	EnterUserName.getText().equals("Enter User Name")) {
					EnterUserName.setText("");
				}
				else {
					EnterUserName.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(	EnterUserName.getText().equals("")) {
					EnterUserName.setText("Enter User Name");
				}
				else {
					EnterUserName.selectAll();
				}
			}
		});
		EnterUserName.setText("Enter User Name");
		EnterUserName.setToolTipText("");
		EnterUserName.setBorder(null);
		EnterUserName.setBounds(0, 11, 137, 20);
		panel_1.add(EnterUserName);
		EnterUserName.setColumns(10);
		
		JLabel username = new JLabel("");
		username.setBounds(136, 0, 46, 40);
		panel_1.add(username);
		username.setIcon(new ImageIcon(user));
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1.setBounds(123, 178, 182, 40);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel psinfo_1 = new JLabel("");
		psinfo_1.setForeground(Color.RED);
		psinfo_1.setFont(new Font("Arial", Font.PLAIN, 11));
		psinfo_1.setBounds(123, 100, 182, 14);
		panel.add(psinfo_1);
		
		EnterPassword = new JPasswordField();
		EnterPassword.setText("Enter Password");
		EnterPassword.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent e) {
				if(EnterPassword.getText().equals("Enter Password")) {
					EnterPassword.setText("");
				}
				else {
					EnterPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(	EnterPassword.getText().equals("")) {
					EnterPassword.setText("Enter Password");
				}
				else {
					EnterPassword.selectAll();
				}
			}
		});
		EnterPassword.setEchoChar((char) 0 );
		EnterPassword.setBorder(null);
		EnterPassword.setBounds(0, 11, 139, 20);
		panel_1_1.add(EnterPassword);
		
		JLabel password = new JLabel("");
		password.setBounds(136, 0, 46, 40);
		panel_1_1.add(password);
		password.setIcon(new ImageIcon(pass));
		
		JLabel logo = new JLabel("");
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setBounds(141, 11, 132, 86);
		panel.add(logo);
		logo.setIcon(new ImageIcon(log));
		
		JLabel exit = new JLabel("X");
		exit.setBackground(Color.WHITE);
		exit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close?", "Confirmation", JOptionPane.YES_NO_OPTION)==0)
					Register.this.dispose();
				
			}
		
			public void mouseEntered(MouseEvent e) {
				exit.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				exit.setForeground(Color.WHITE);
			}
		});
		exit.setForeground(Color.WHITE);
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		exit.setFont(new Font("Arial", Font.BOLD, 16));
		exit.setBounds(419, 0, 21, 14);
		panel.add(exit);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				 btnNewButton.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				 btnNewButton.setForeground(Color.BLACK);
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
  
		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg/log", "root","");
		            PreparedStatement ps = con.prepareStatement("insert into miko(user,password) values(?,?)");
		            Statement st = con.createStatement();
		            
		            String user = EnterUserName.getText();
		            String pass = EnterPassword.getText();
		            
		            String sql = "select * from miko where user='"+user+"'";
		            ResultSet rs = st.executeQuery(sql); 
		            
		            ps.setString(1,EnterUserName.getText()); 
   					ps.setString(2,EnterPassword.getText());
               
   					if(user.isEmpty() || pass.isEmpty() || user.equals("Enter User Name") || pass.equals("Enter Password")) {
   						
   						JOptionPane.showMessageDialog(null,"Please fill up all Requirements");
   						ps.cancel();
   					}
   					else if (pass.length()< 8) {
   						psinfo.setText("Password is too short");
   						ps.cancel();
   					}
   					else if (pass.length()>= 8) {
   						psinfo.setText("");
   						
   					}
   					
   					
   					else if (rs.next()) {
   						psinfo_1.setText("The user name is taken");
   						ps.cancel();
   					}
   					else if (!rs.next()) {
   						psinfo_1.setText("");
   						ps.cancel();
   					}
   					else {
   						JOptionPane.showMessageDialog(null,"Sucess Register");
   						ps.executeUpdate();
   						Register.this.dispose();
   						Login lg = new Login();
   						lg.show();
   					}
   				
				}
                       catch (Exception ex){
                    	   JOptionPane.showMessageDialog(null,"Error Invalid " + ex.getMessage());
					}

				}
		});
		btnNewButton.setBounds(114, 232, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnlogin = new JButton("Back");
		btnlogin.setBackground(Color.YELLOW);
		btnlogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login lg = new Login();
				lg.show();
				Register.this.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnlogin.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				btnlogin.setForeground(Color.BLACK);
			}
		});
		btnlogin.setBounds(228, 232, 89, 23);
		panel.add(btnlogin);
		
		
		
		
	    
	}
}
