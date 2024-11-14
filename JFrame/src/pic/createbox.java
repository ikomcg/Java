package pic;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class createbox extends JPanel implements KeyListener {
	public Image car = new ImageIcon(miko.class.getResource("/pic/car.png")).getImage().getScaledInstance(100, 150, Image.SCALE_SMOOTH);
	int x = getX();
	int y = getY();
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;		
		
		Rectangle rec = new Rectangle(x,y,100,100);		
		g2.draw(rec);
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.y=y-10;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			this.y=y+10;
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			this.x=x-10;
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			this.x=x+10;
		}

	}

	
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
	
