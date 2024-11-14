import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;

public class Front extends JFrame {

	private JPanel contentPane;
	private Image tl = new ImageIcon(TaskPerf7.class.getResource("/pic/title.png")).getImage().getScaledInstance(480, 50, Image.SCALE_SMOOTH);
	private Image tll = new ImageIcon(TaskPerf7.class.getResource("/pic/main.jpg")).getImage().getScaledInstance(500, 493, Image.SCALE_SMOOTH);
    public static  JTextField name1;
	public static  JTextField name2;
	private JLabel lblname;
	private JLabel lblPlayerOName;
	int mouseY;
	int mouseX;
	ImageIcon x,c;
	private JPanel dm;
	public static void main(String[] args) {
		
		Front ft = new Front();
		ft.setVisible(true);
	}
	public Front() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 390);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.LIGHT_GRAY);
		btnExit.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				
				dispose();
			}
				public void mouseEntered(MouseEvent e) {
					btnExit.setBackground(Color.YELLOW);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnExit.setBackground(Color.LIGHT_GRAY);
				}
			
		});
		
		
		
		JButton btnstart = new JButton("Start");
		btnstart.setBackground(Color.LIGHT_GRAY);
		btnstart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnstart.setBackground(Color.YELLOW);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnstart.setBackground(Color.LIGHT_GRAY);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnstart.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				String n1 = name1.getText();
				String n2 = name2.getText();
				
			
				 if (n1.isEmpty() && n2.isEmpty()) {
					JOptionPane.showMessageDialog(rootPane,"Input Name Player X  and Player O");	
				}
				else if  (n1.isEmpty() ) {			
					JOptionPane.showMessageDialog(rootPane,"Input Name Player X ");
				}
				else if (n2.isEmpty()) {
					JOptionPane.showMessageDialog(rootPane,"Input Name Player O ");
				}
				else if (ready1.isSelected() && ready2.isSelected() ) {
					TaskPerf7 gg = new TaskPerf7();						
					gg.player1.setText(n1);
					gg.player2.setText(n2);
                	gg.show();
					dispose();
					}
				else if (!ready1.isSelected() && !ready2.isSelected()) {
					JOptionPane.showMessageDialog(rootPane,"Player "+ n1 + " and "+ n2 +" is not ready");
				}
				else if (!ready1.isSelected()){
					
					JOptionPane.showMessageDialog(rootPane,"Player "+ n1 +" is not ready");
					
				}
				else {
					JOptionPane.showMessageDialog(rootPane,"Player "+ n2 +" is not ready");
				}
			}
		});
		
			btnstart.setFont(new Font("Arial", Font.BOLD, 14));
			btnstart.setBounds(120, 265, 89, 23);
			contentPane.add(btnstart);
		
		dm = new JPanel();
		dm.setBounds(0, 0, 500, 20);
		contentPane.add(dm);
		
		   dm.addMouseMotionListener(new MouseMotionAdapter() {
				public void mouseDragged(MouseEvent e) {
					setLocation(getX() + e.getX() - mouseX, getY() + e.getY() - mouseY);
					
				}
			});
	    
			dm.addMouseListener(new MouseAdapter() {
				
				public void mousePressed(MouseEvent e) {
					mouseX = e.getX();
					mouseY = e.getY();
				}
			});
		
		
		JCheckBox ready2 = new JCheckBox("Ready");
		ready2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ready2.setBounds(324, 230, 68, 23);
		contentPane.add(ready2);
		
		
		JCheckBox ready1 = new JCheckBox("Ready");
		ready1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		ready1.setBounds(324, 186, 68, 23);
		contentPane.add(ready1);
		btnExit.setFont(new Font("Arial", Font.BOLD, 14));
		btnExit.setBounds(229, 265, 89, 23);
		contentPane.add(btnExit);
		
		lblPlayerOName = new JLabel("Player O Name");
		lblPlayerOName.setForeground(Color.RED);
		lblPlayerOName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPlayerOName.setBounds(10, 225, 115, 29);
		contentPane.add(lblPlayerOName);
		
		lblname = new JLabel("Player X Name");
		lblname.setForeground(Color.RED);
		lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblname.setBounds(10, 181, 100, 29);
		contentPane.add(lblname);
		
		name2 = new JTextField();
		name2.setColumns(10);
		name2.setBounds(120, 225, 198, 29);
		contentPane.add(name2);
		
		name1 = new JTextField();
		name1.setBounds(120, 183, 198, 29);
		contentPane.add(name1);
		name1.setColumns(10);
		
		JLabel lbtitle = new JLabel("");
		lbtitle.setBounds(10, 52, 480, 50);
		lbtitle.setIcon(new ImageIcon(tl));
		contentPane.add(lbtitle);
		
		JLabel panel = new JLabel();
		panel.setBounds(0, 0, 500, 390);
		panel.setBackground(new Color(32, 178, 170));
		contentPane.add(panel);
		panel.setIcon(new ImageIcon(tll));
		panel.setLayout(null);
		    setUndecorated(true);
	}
}
