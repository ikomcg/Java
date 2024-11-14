package pic;


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
public class MyFrame2 extends JFrame{
	public Image car2 = new ImageIcon(miko.class.getResource("/pic/car.png")).getImage().getScaledInstance(50, 100, Image.SCALE_SMOOTH);
	public Image car02 = new ImageIcon(miko.class.getResource("/pic/car002.png")).getImage().getScaledInstance(105, 95, Image.SCALE_SMOOTH);
	Image image;
	Graphics graphics;
	Box player;
	Box enemy;
	Box finish;
	boolean gameOver;
	
	MyFrame2(){
		getContentPane().setBackground(new Color(46, 139, 87));
		finish = new Box(500,590,50,100,Color.black);
		enemy = new Box(100,640,50,100,car2);
		player = new Box(200,640,105,95,car02);
		gameOver = false;
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400,800);
		this.setLocationRelativeTo(null);
		this.addKeyListener(new AL());	
		this.setVisible(true);	
		
	}
	
	public void paint(Graphics g) {
		image = createImage(this.getWidth(),this.getHeight());
		graphics = image.getGraphics();
		g.drawImage(image,0,0,this);
		
		player.drawImage(g);
		enemy.drawImage(g);
		finish.draw(g);
		
		if(gameOver) {
			g.setColor(Color.black);
			g.setFont(new Font("Arial",Font.PLAIN,45));
			g.drawString("abanga", 80, 100);
		}
	}
	
	public void checkCollision() {
		if(enemy.intersects(player)) {
			System.out.println("abnaga");
			gameOver = true;
			
		}
		if(player.intersects(finish)) {
			gameOver = true;
			
		}
	}
	
	public class AL extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			player.keyPressed(e);
			//enemy.keyPressed(e);
			System.out.println(player.getLocation());
			checkCollision();
			repaint();
		}
	}
}

