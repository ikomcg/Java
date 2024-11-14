import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;

public class task extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	private JTextField Section;
	private JTextField Date;

	public static void main(String[] args) {
		
					task frame = new task();
					frame.setVisible(true);
	}
	
	public task() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\miko\\Downloads\\maxresdefault.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 50, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		Name = new JTextField();
		Name.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Name.setBounds(88, 95, 241, 24);
		contentPane.add(Name);
		Name.setColumns(10);
		
		JButton btnstart = new JButton("Start");
		btnstart.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		btnstart.setBackground(Color.WHITE);
		btnstart.addMouseListener(new MouseAdapter() {
			
			
			
			public void mouseClicked(MouseEvent e) {
				taskper7 tp = new taskper7();
				tp.Name.setText("Name: "+Name.getText());
				tp.Section.setText("Section: "+Section.getText());
				tp.Date.setText("Date: "+Date.getText());
				dispose();
			    tp.show();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnstart.setBackground(Color.red);
			}
			public void mouseExited(MouseEvent e) {
				btnstart.setBackground(Color.white);
			}
		});
		btnstart.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnstart.setBounds(164, 188, 89, 23);
		contentPane.add(btnstart);
		
		JLabel lblNewLabel = new JLabel("QUIZ TIME");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 25));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(119, 39, 182, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name: ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel_1.setBounds(30, 95, 60, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel sec = new JLabel("Section:");
		sec.setFont(new Font("Arial Black", Font.BOLD, 12));
		sec.setBounds(21, 125, 80, 22);
		contentPane.add(sec);
		
		Section = new JTextField();
		Section.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Section.setColumns(10);
		Section.setBounds(88, 125, 241, 24);
		contentPane.add(Section);
		
		Date = new JTextField();
		Date.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Date.setColumns(10);
		Date.setBounds(88, 153, 121, 24);
		contentPane.add(Date);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblDate.setBounds(31, 153, 80, 22);
		contentPane.add(lblDate);
	}
}
