import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class taskper7 extends JFrame {


	public JTextField Name;
	public JTextField Section;
	public JTextField Date;
	private JTextField txtScore;
	private int score =0; 
	private JTextField Score;
	
	public static void main(String[] args) {
		
					taskper7 frame = new taskper7();
					frame.setVisible(true);
	}
		
	public taskper7() {
		getContentPane().setBackground(new Color(153, 50, 204));
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\miko\\Downloads\\maxresdefault.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 600, 750);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		
		
		JLabel question = new JLabel("1.Who protects the Silver Crystal?");
		question.setForeground(new Color(255, 255, 255));
		question.setFont(new Font("Arial", Font.BOLD, 14));
		question.setBounds(10, 52, 358, 42);
		getContentPane().add(question);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("A.Four\n");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(20, 228, 99, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox correct1 = new JCheckBox("B.Sailor Moon");
		correct1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (correct1.isSelected()) {
					score++;
				}
			}
		});
		correct1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		correct1.setBounds(20, 127, 99, 23);
		getContentPane().add(correct1);
		
		JCheckBox chckbxCluffy = new JCheckBox("C.Luffy");
		chckbxCluffy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxCluffy.setBounds(20, 153, 99, 23);
		getContentPane().add(chckbxCluffy);
		
		JLabel question2 = new JLabel(" ");
		
		question2.setText("2. How many Dragon Balls are there");
		question2.setForeground(Color.WHITE);
		question2.setFont(new Font("Arial", Font.BOLD, 14));
		question2.setBounds(10, 183, 358, 42);
		getContentPane().add(question2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("B.ten\n");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_1.setBounds(20, 254, 99, 23);
		getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox Correct2 = new JCheckBox("C.Seven.");
		Correct2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Correct2.isSelected()) {
					score++;
				}
			}
		});
		Correct2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Correct2.setBounds(20, 279, 99, 23);
		getContentPane().add(Correct2);
		
		JLabel question3 = new JLabel("3.Whose body gained the properties of rubber after unintentionally eating");
		question3.setForeground(Color.WHITE);
		question3.setFont(new Font("Arial", Font.BOLD, 14));
		question3.setBounds(10, 309, 564, 42);
		getContentPane().add(question3);
		
		JCheckBox Correct3 = new JCheckBox("A.Monkey D. Luffy.");
		Correct3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Correct3.isSelected()) {
					score++;
				}
				
			}
		});
		Correct3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Correct3.setBounds(20, 358, 131, 23);
		getContentPane().add(Correct3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("B.Nami");
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_4.setBounds(20, 384, 131, 23);
		getContentPane().add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("C.Crocrodile");
		chckbxNewCheckBox_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_5.setBounds(20, 410, 131, 23);
		getContentPane().add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("A.Zorro");
		chckbxNewCheckBox_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_6.setBounds(20, 101, 99, 23);
		getContentPane().add(chckbxNewCheckBox_6);
		
		JLabel question4 = new JLabel("4.In the anime \u2018Hunter X Hunter\u2019, which family is famous for being assassins?");
		question4.setForeground(Color.WHITE);
		question4.setFont(new Font("Arial", Font.BOLD, 14));
		question4.setBounds(10, 447, 539, 42);
		getContentPane().add(question4);
		
		JCheckBox chckbxNewCheckBox_5_1 = new JCheckBox("B.Gon");
		chckbxNewCheckBox_5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_5_1.setBounds(20, 514, 109, 23);
		getContentPane().add(chckbxNewCheckBox_5_1);
		
		JCheckBox Correct4 = new JCheckBox("A.Killua\u2019s family.");
		Correct4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Correct4.isSelected()) {
					score++;
				}
			}
		});
		Correct4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Correct4.setBounds(20, 488, 109, 23);
		getContentPane().add(Correct4);
		
		JCheckBox chckbxNewCheckBox_5_1_1 = new JCheckBox("C.King");
		chckbxNewCheckBox_5_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_5_1_1.setBounds(20, 540, 109, 23);
		getContentPane().add(chckbxNewCheckBox_5_1_1);
		
		JLabel question5 = new JLabel("5.Who was the first member of the First Levi Squad to die in \u2018Attack on Titan\u2019?");
		question5.setForeground(Color.WHITE);
		question5.setFont(new Font("Arial", Font.BOLD, 14));
		question5.setBounds(10, 558, 564, 42);
		getContentPane().add(question5);
		
		JCheckBox chckbxNewCheckBox_5_1_1_1 = new JCheckBox("A.Eren");
		chckbxNewCheckBox_5_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox_5_1_1_1.setBounds(20, 607, 99, 23);
		getContentPane().add(chckbxNewCheckBox_5_1_1_1);
		
		JCheckBox correct5 = new JCheckBox("B.Gunther");
		correct5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (correct5.isSelected()) {
					score++;
				}
				
				
			}
		});
		correct5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		correct5.setBounds(20, 633, 99, 23);
		getContentPane().add(correct5);
		
		JCheckBox lbl = new JCheckBox("C.Annie");
		
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbl.setBounds(20, 659, 99, 23);
		getContentPane().add(lbl);
		
		Name = new JTextField();
		Name.setBackground(Color.WHITE);
		Name.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Name.setEditable(false);
		Name.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Name.setBounds(10, 11, 235, 20);
		getContentPane().add(Name);
		Name.setColumns(10);
		
		Section = new JTextField();
		Section.setBackground(Color.WHITE);
		Section.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Section.setEditable(false);
		Section.setColumns(10);
		Section.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Section.setBounds(10, 34, 235, 20);
		getContentPane().add(Section);
		
		Date = new JTextField();
		Date.setBackground(Color.WHITE);
		Date.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Date.setEditable(false);
		Date.setColumns(10);
		Date.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		Date.setBounds(433, 11, 120, 20);
		getContentPane().add(Date);
		
		txtScore = new JTextField();
		txtScore.setBackground(Color.WHITE);
		txtScore.setText("Score:           /10");
		txtScore.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtScore.setEditable(false);
		txtScore.setColumns(10);
		txtScore.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtScore.setBounds(433, 34, 120, 20);
		getContentPane().add(txtScore);
		
		JLabel lblADevilFruit = new JLabel(" a Devil Fruit?");
		lblADevilFruit.setForeground(Color.WHITE);
		lblADevilFruit.setFont(new Font("Arial", Font.BOLD, 14));
		lblADevilFruit.setBounds(20, 333, 109, 30);
		getContentPane().add(lblADevilFruit);
		
		JButton Submitt = new JButton("Finish");
		Submitt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Score.setText(String.valueOf(score*2));
				Score.setBackground(Color.red);
				txtScore.setBackground(Color.red);
			}
		});
		
		Score = new JTextField();
		Score.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Score.setBorder(new MatteBorder(1, 0, 1, 0, (Color) new Color(0, 0, 0)));
		Score.setBounds(487, 34, 25, 20);
		getContentPane().add(Score);
		Score.setColumns(10);
		Submitt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Submitt.setBounds(235, 677, 89, 23);
		getContentPane().add(Submitt);
		
		
	}
}
