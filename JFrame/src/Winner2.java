import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Winner2 extends JFrame {

	private Image winn = new ImageIcon(Winner2.class.getResource("/Pic/winner.jpg")).getImage().getScaledInstance(400, 200, Image.SCALE_SMOOTH);
	private JTextField con;
	public static JTextField name;
	
	public static void main(String[] args) {
		
		Winner2 wn2 = new Winner2();
		TaskPerf7 f = new TaskPerf7();
		f.dispose();
	}
		public Winner2() {
		JFrame jf = new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		setUndecorated(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JButton btnok = new JButton("OK");
		btnok.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				dispose();
			}
		});
		btnok.setBackground(Color.RED);
		btnok.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnok.setBounds(155, 152, 89, 23);
		getContentPane().add(btnok);
		
		name = new JTextField("Player O");
		name.setBackground(Color.WHITE);
		name.setEditable(false);
		name.setForeground(Color.RED);
		name.setBorder(null);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(new Font("Arial", Font.BOLD, 20));
		name.setBounds(86, 97, 228, 30);
		getContentPane().add(name);
		name.setColumns(10);
		
		con = new JTextField();
		con.setBackground(Color.WHITE);
		con.setEditable(false);
		con.setBorder(null);
		con.setText("WINNER");
		con.setFont(new Font("Arial", Font.PLAIN, 15));
		con.setHorizontalAlignment(SwingConstants.CENTER);
		con.setBounds(142, 66, 116, 20);
		getContentPane().add(con);
		con.setColumns(10);
		
		JLabel lb = new JLabel("");
		lb.setBounds(0, 0, 400, 200);
		lb.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lb);
		lb.setIcon(new ImageIcon(winn));
		setVisible(true);
		}
	}


