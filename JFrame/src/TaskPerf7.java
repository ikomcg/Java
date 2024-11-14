import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class TaskPerf7 extends JFrame {

	
	private int mouseX , mouseY;
	private Image tll = new ImageIcon(TaskPerf7.class.getResource("/pic/title.png")).getImage().getScaledInstance(500, 50, Image.SCALE_SMOOTH);
	public static JTextField player1;
	public static JTextField player2;
	public static String scorelimit;
	private int turn = 2;
	
	
	int s1= 1, s2 = 1;
	
	private JButton tc1, tc2, tc3, tc4, tc5, tc6,tc7, tc8, tc9;
	private String px= "X";
	
	public static void main(String[] args) {
		
					TaskPerf7 frame = new TaskPerf7();
					frame.setVisible(true);
			
	}
	 int x [] = {0,0,0,0,0,0,0,0,0};
 	 int o [] = {0,0,0,0,0,0,0,0,0};
	 int bt [] = {0,0,0,0,0,0,0,0,0};
	 private JTextField score1;
	 private JTextField score2;
	int x() {
		
		if (x[0]==1 && x[1] == 1 && x[2] == 1) {
			
		
			return 1;
		}
        if (x[3]==1 && x[4] == 1 && x[5] == 1) {
			
			return 1;
		}
        if (x[6]==1 && x[7] == 1 && x[8] == 1) {
			
			return 1;
		}
        if (x[0]==1 && x[3] == 1 && x[6] == 1) {
			
			return 1;
		}
        if (x[1]==1 && x[4] == 1 && x[7] == 1) {
			
			return 1;
		}
        if (x[2]==1 && x[5] == 1 && x[8] == 1) {
			
			return 1;
		}
        if (x[0]==1 && x[4] == 1 && x[8] == 1) {
			
			return 1;
		}
        if (x[2]==1 && x[4] == 1 && x[6] == 1) {
			
			return 1;
		}
       
		return 0;
	} 
	
int o() {
		
		if (o[0]==1 && o[1] == 1 && o[2] == 1) {
			
			return 1;
		}
        if (o[3]==1 && o[4] == 1 && o[5] == 1) {
			
			return 1;
		}
        if (o[6]==1 && o[7] == 1 && o[8] == 1) {
			
			return 1;
		}
        if (o[0]==1 && o[3] == 1 && o[6] == 1) {
			
			return 1;
		}
        if (o[1]==1 && o[4] == 1 && o[7] == 1) {
			
			return 1;
		}
        if (o[2]==1 && o[5] == 1 && o[8] == 1) {
			
			return 1;
		}
        if (o[0]==1 && o[4] == 1 && o[8] == 1) {
			
			return 1;
		}
        if (o[2]==1 && o[4] == 1 && o[6] == 1) {
			
			return 1;
		}
       
		return 0;
	} 
	
	public TaskPerf7() {
		JFrame jf = new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 486);							
		getContentPane().setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		JLabel lblScore_1 = new JLabel("Score");
		lblScore_1.setForeground(Color.RED);
		lblScore_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblScore_1.setBounds(575, 280, 46, 14);
		getContentPane().add(lblScore_1);
		
		JLabel lblScore = new JLabel("Score");
		lblScore.setForeground(Color.RED);
		lblScore.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblScore.setBounds(575, 186, 46, 14);
		getContentPane().add(lblScore);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Front f = new Front();
				f.show();
				dispose();
			}
		});
		btnNewGame.setForeground(Color.BLACK);
		btnNewGame.setFont(new Font("Arial Black", Font.BOLD, 12));
		btnNewGame.setBackground(Color.YELLOW);
		btnNewGame.setBounds(508, 351, 113, 33);
		getContentPane().add(btnNewGame);
		
		score2 = new JTextField();
		score2.setBackground(Color.WHITE);
		score2.setEditable(false);
		score2.setFont(new Font("Arial", Font.PLAIN, 20));
		score2.setBorder(new MatteBorder(2, 0, 1, 0, (Color) new Color(0, 0, 0)));
		score2.setHorizontalAlignment(SwingConstants.CENTER);
		score2.setColumns(10);
		score2.setBounds(535, 294, 86, 30);
		getContentPane().add(score2);
		
		score1 = new JTextField();
		score1.setBackground(Color.WHITE);
		score1.setEditable(false);
		score1.setHorizontalAlignment(SwingConstants.CENTER);
		score1.setBorder(new MatteBorder(3, 0, 3, 1, (Color) new Color(0, 0, 0)));
		score1.setFont(new Font("Arial", Font.PLAIN, 20));
		score1.setBounds(535, 199, 90, 33);
		getContentPane().add(score1);
		score1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("V.S");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(468, 247, 62, 35);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblPlayerO = new JLabel("PLayer O");
		lblPlayerO.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		lblPlayerO.setForeground(Color.RED);
		lblPlayerO.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPlayerO.setBounds(373, 279, 68, 14);
		getContentPane().add(lblPlayerO);
		
		JLabel lblNewLabel = new JLabel("PLayer X");
		lblNewLabel.setBorder(new MatteBorder(1, 1, 0, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(373, 186, 68, 14);
		getContentPane().add(lblNewLabel);		

		player1 = new JTextField();
		player1.setBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 0, 0)));
		player1.setBackground(Color.WHITE);
		player1.setEditable(false);
		player1.setFont(new Font("Arial", Font.PLAIN, 20));
		player1.setBounds(373, 199, 251, 33);
		getContentPane().add(player1);
		player1.setColumns(10);
		
		player2 = new JTextField();
		player2.setBorder(new MatteBorder(3, 1, 3, 1, (Color) new Color(0, 0, 0)));
		player2.setBackground(Color.WHITE);
		player2.setFont(new Font("Arial", Font.PLAIN, 20));
		player2.setEditable(false);
		player2.setColumns(10);
		player2.setBounds(373, 293, 251, 33);
		getContentPane().add(player2);
		
		JButton tc1 = new JButton("");		
		tc1.setForeground(Color.BLACK);
		tc1.setFont(new Font("Arial Black", Font.BOLD, 30));
		
		tc1.addMouseListener(new MouseAdapter() {
			
			
			public void mouseClicked(MouseEvent e) {
			
				if (turn%2 == 0) {
					turn++;
					tc1.setText(px);			
					x[0]=1;
					
					int r1 = x();					
					if (r1==1){						
						score1.setText(Integer.toString(s1++));				
						
					}										
				}
				
				else  {
					turn++;
					tc1.setText("O");
					
					o[0]=1;
					int r2 = o();
					if (r2==1) {
						score2.setText(Integer.toString(s2++));	
			       }
			    }
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				tc1.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				tc1.setBackground(Color.GRAY);
			}
	
			
		});
		tc1.setBackground(Color.GRAY);
		tc1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tc1.setBounds(62, 156, 94, 65);
		getContentPane().add(tc1);
		
		JButton tc2 = new JButton("");
		tc2.setForeground(Color.BLACK);
		tc2.setBackground(Color.GRAY);
		tc2.setFont(new Font("Arial Black", Font.BOLD, 30));
		tc2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				
				
					if (turn%2 == 0) {
						turn++;
						tc2.setText(px);
						
						x[1]=1;
						int r1 = x();
					
						if (r1 == 1){
							score1.setText(Integer.toString(s1++));
							
						}
	
					}					
					else  {
						 turn++;
						tc2.setText("O");
						
						o[1]=1;
						int r2 = o();
						if (r2==1) {
							score2.setText(Integer.toString(s2++));
						}
					    
					}		
			}
			
				public void mouseEntered(MouseEvent e) {
					tc2.setBackground(Color.RED);
				}
				public void mouseExited(MouseEvent e) {
					tc2.setBackground(Color.GRAY);
				}
			
		});
		tc2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		tc2.setBounds(166, 156, 94, 65);
		getContentPane().add(tc2);
		
		JButton tc3 = new JButton("");
		tc3.setForeground(Color.BLACK);
		tc3.setFont(new Font("Arial Black", Font.BOLD, 30));
		tc3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				
					if (turn%2 == 0) {
						turn++;
						tc3.setText("X");
						
						x[2]=1;
						int r1 = x();
						
						
						if (r1 == 1){
							score1.setText(Integer.toString(s1++));
							
						}								
					}
					
					else  {
						 turn++;
						 tc3.setText("O");
						
							o[2]=1;
							int r2 = o();
							if (r2==1) {
								score2.setText(Integer.toString(s2++));
							}
					}	
			}
			public void mouseEntered(MouseEvent e) {
				tc3.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				tc3.setBackground(Color.GRAY);
			}
		});
		tc3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tc3.setBackground(Color.GRAY);
		tc3.setBounds(270, 156, 94, 65);
		getContentPane().add(tc3);
		
		JButton tc4 = new JButton("");
		tc4.setForeground(Color.BLACK);
		tc4.setFont(new Font("Arial Black", Font.BOLD, 30));
		tc4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				
				
					if (turn%2 == 0) {
						turn++;
						tc4.setText("X");
					
						x[3]=1;
						int r1 = x();
						
						if (r1 == 1){
							score1.setText(Integer.toString(s1++));
						}						
					}
					
					else  {
						 turn++;
						 tc4.setText("O");
						
							o[3]=1;
							int r2 = o();
							if (r2==1) {
								score2.setText(Integer.toString(s2++));
							}
					}	
			}
			public void mouseEntered(MouseEvent e) {
				tc4.setBackground(Color.RED);
				
			}
			public void mouseExited(MouseEvent e) {
				tc4.setBackground(Color.GRAY);
			}
		});
		tc4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tc4.setBackground(Color.GRAY);
		tc4.setBounds(62, 242, 94, 65);
		getContentPane().add(tc4);
		
		JButton tc5 = new JButton("");
		tc5.setForeground(Color.BLACK);
		tc5.setFont(new Font("Arial Black", Font.BOLD, 30));
		tc5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				
					if (turn%2 == 0) {
						turn++;
						tc5.setText("X");
						
						x[4]=1;
						int r1 = x();
						
						if (r1 == 1){
							score1.setText(Integer.toString(s1++));
						}
						
					}
					
					else  {
						 turn++;
						 tc5.setText("O");
						
						 o[4]=1;
						 
							int r2 = o();
							if (r2==1) {
								score2.setText(Integer.toString(s2++));
							}
					    
					}

			}
			public void mouseEntered(MouseEvent e) {
				tc5.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				tc5.setBackground(Color.GRAY);
			}
		});
		tc5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tc5.setBackground(Color.GRAY);
		tc5.setBounds(166, 242, 94, 65);
		getContentPane().add(tc5);
		
		JButton tc6 = new JButton("");
		tc6.setForeground(Color.BLACK);
		tc6.setFont(new Font("Arial Black", Font.BOLD, 30));
		tc6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)  {
				
				
					if (turn%2 == 0) {
						turn++;
						tc6.setText("X");
						
						x[5]=1;
						int r1 = x();
						
						if (r1 == 1){
							score1.setText(Integer.toString(s1++));
							
						}

					}
					
					else  {
						 turn++;
						 tc6.setText("O");
						
						 o[5]=1;
						 
							int r2 = o();
							if (r2==1) {
								score2.setText(Integer.toString(s2++));
							}
					    
					}

			}
			public void mouseEntered(MouseEvent e) {
				tc6.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				tc6.setBackground(Color.GRAY);
			}
		});
		tc6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tc6.setBackground(Color.GRAY);
		tc6.setBounds(270, 242, 94, 65);
		getContentPane().add(tc6);
		
		JButton tc7 = new JButton("");
		tc7.setForeground(Color.BLACK);
		tc7.setFont(new Font("Arial Black", Font.BOLD, 30));
		tc7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
					if (turn%2 == 0) {
						turn++;
						tc7.setText("X");
						
						x[6]=1;
						int r1 = x();
						
						
						if (r1 == 1){
							score1.setText(Integer.toString(s1++));
						}
						
						
					}
					
					else  {
						 turn++;
						 tc7.setText("O");
						
						 o[6]=1;
						 
							int r2 = o();
							if (r2==1) {
								score2.setText(Integer.toString(s2++));
							}
					}

					
			}
			public void mouseEntered(MouseEvent e) {
				tc7.setBackground(Color.RED);
				
			}
			public void mouseExited(MouseEvent e) {
				tc7.setBackground(Color.GRAY);
			}
		});
		tc7.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tc7.setBackground(Color.GRAY);
		tc7.setBounds(62, 327, 94, 65);
		getContentPane().add(tc7);
		
		JButton tc8 = new JButton("");
		tc8.setForeground(Color.BLACK);
		tc8.setFont(new Font("Arial Black", Font.BOLD, 30));
		tc8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					if (turn%2 == 0) {
						turn++;
						tc8.setText("X");
						
						x[7]=1;
						int r1 = x();						
						if (r1 == 1){
							score1.setText(Integer.toString(s1++));
						}
						

					}
					
					else  {
						 turn++;
						 tc8.setText("O");
						
						 o[7]=1;
						 
							int r2 = o();
							if (r2==1) {
								score2.setText(Integer.toString(s2++));
							}
					    
					}
					
			}
			public void mouseEntered(MouseEvent e ) {
				tc8.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				tc8.setBackground(Color.GRAY);
			}
		});
		tc8.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tc8.setBackground(Color.GRAY);
		tc8.setBounds(166, 327, 94, 65);
		getContentPane().add(tc8);
		
		JButton tc9 = new JButton("");
		tc9.setForeground(Color.BLACK);
		tc9.setFont(new Font("Arial Black", Font.BOLD, 30));
		tc9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					if (turn%2 == 0) {
						turn++;
						tc9.setText("X");
						
						x[8]=1;
						int r1 = x();
						
						if (r1 == 1){
							score1.setText(Integer.toString(s1++));
						}
						
						
					}
					
					else  {
						 turn++;
						 tc9.setText("O");
						 
						 o[8]=1;
						 
							int r2 = o();
							if (r2==1) {
								score2.setText(Integer.toString(s2++));
							}
					    
					}
					
			}
			public void mouseEntered(MouseEvent e) {
				tc9.setBackground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				tc9.setBackground(Color.GRAY);
			}
		});
		tc9.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tc9.setBackground(Color.GRAY);
		tc9.setBounds(270, 327, 94, 65);
		getContentPane().add(tc9);
				
		JLabel title = new JLabel("");
		title.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		title.setBackground(Color.YELLOW);
		title.setBounds(62, 55, 504, 48);
		getContentPane().add(title	);
		title.setIcon(new ImageIcon(tll));
		
		JPanel lbl1 = new JPanel();
            lbl1.addMouseMotionListener(new MouseMotionAdapter() {
			
			public void mouseDragged(MouseEvent e) {
				setLocation(getX() + e.getX() - mouseX, getY() + e.getY() - mouseY);
				
			}
		});
    
		lbl1.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		  JButton Nr = new JButton("Clear");
          Nr.setBackground(Color.YELLOW);
  		Nr.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				
  				 tc1.setText(""); 	 			 
  				 tc2.setText("");  
  				 tc3.setText("");  
  				 tc4.setText("");   
  				 tc5.setText("");   
  				 tc6.setText("");   
  				 tc7.setText("");   
  				 tc8.setText("");    
  				 tc9.setText("");    
  				 turn = 2;
  				 o[0]=0;  x[0]=0;  
  				 o[1]=0;  x[1]=0; 
  				 o[2]=0;  x[2]=0;
  				 o[3]=0;  x[3]=0;
  				 o[4]=0;  x[4]=0;
  				 o[5]=0;  x[5]=0;
  				 o[6]=0;  x[6]=0;
  				 o[7]=0;  x[7]=0;
  				 o[8]=0;  x[8]=0;
  				
  				}
  			
  		});
  		Nr.setForeground(Color.BLACK);
  		Nr.setFont(new Font("Arial Black", Font.BOLD, 12));
  		Nr.setBounds(373, 351, 113, 33);
  		getContentPane().add(Nr);
		
		lbl1.setForeground(Color.ORANGE);
		lbl1.setBackground(Color.WHITE);
		lbl1.setBounds(0, 0, 635, 33);
		getContentPane().add(lbl1);
		lbl1.setLayout(null);
		
		JLabel exit = new JLabel();
		exit.setAlignmentX(Component.RIGHT_ALIGNMENT);
		exit.setBounds(612, 5, 13, 23);
		lbl1.add(exit);
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					dispose();
				   
			}
		
			public void mouseEntered(MouseEvent e) {
				exit.setForeground(Color.RED);
			}
			public void mouseExited(MouseEvent e) {
				exit.setForeground(Color.BLACK);
			}
		});
		
		
		
		exit.setBorder(null);
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		exit.setFont(new Font("Arial", Font.BOLD, 19));
		exit.setText("X");
		exit.setForeground(Color.BLACK);
		exit.setBackground(Color.BLACK);			
		
		JLabel main = new JLabel("");
		main.setBounds(0, 0, 635, 486);
		getContentPane().add(main);
		main.setIcon(new ImageIcon("C:\\Users\\miko\\Downloads\\main.jpg"));

	}
}

