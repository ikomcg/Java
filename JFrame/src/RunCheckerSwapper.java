import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RunCheckerSwapper extends JFrame {
	
	public static void main(String[] args) {
		
			RunCheckerSwapper frame = new RunCheckerSwapper();
				
	}

	
	public RunCheckerSwapper() {
		
		
		JFrame jf = new JFrame("Checker and Swapper");
		jf.setSize(400,230);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextField txt1 = new JTextField(10);
		txt1.setBounds(33, 30, 194, 20);
		JTextField  txt2 = new JTextField(10);
		txt2.setBounds(32, 61, 195, 20);
		JButton btn1 = new JButton("Check");
		btn1.setBounds(243, 29, 89, 23);
		JButton btn2 = new JButton("Swap");
		btn2.setBounds(243, 60, 89, 23);
		JLabel result = new JLabel();
		
		jf.add(txt1);			
		jf.add(btn1);
		jf.add(btn2);
		jf.add(txt2);
       
        
		result.setFont(new Font("Arial", Font.BOLD, 20));
		result.setHorizontalAlignment(SwingConstants.CENTER);
		
		jf.add(result);		
		jf.setVisible(true);
		
		btn1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				 if (txt1.getText().equals(txt2.getText())) {
					 result.setText("SAME");
					 
				 }
				 else {
					 
					 result.setText("NOT THE SAME");
				 }
				
			}
			
			
		});
		
	   btn2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				
				String tx = txt1.getText();
				String tx1 = txt2.getText();
				txt1.setText(tx1);
				txt2.setText(tx);
				
				}
		});
		
		
	}
}
