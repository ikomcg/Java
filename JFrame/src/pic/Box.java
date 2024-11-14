package pic;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

import javax.swing.*;

import javax.swing.ImageIcon;


public class Box extends Rectangle{
	
	ImageObserver color;
	Image image;
	Color color1;
	
	Box(int x, int y, int width, int height, Image car){
		this.x=x;
		this.y=y;
		this.width=width-40;
		this.height=height;
		this.image=car;
	}
	Box(int x, int y, int width, int height, Color color){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.color1 = color;
	}
	
	public void keyPressed(KeyEvent e) {
		
		int s = (int)(Math.random()*(10-1+1)+1); 
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			this.y=y-s;
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			if(this.y<=630) {
			this.y=y+10;
			}
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			if (this.x>=70) {
			this.x=x-10;
		    }
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (this.x<=230) {
			this.x=x+10;
		   }
		}
	}
	public void draw(Graphics g) {
	       
		g.fillRect(60,40,300,20);
		
	}
	public void drawImage(Graphics g) {
        g.drawImage(image, this.x, this.y, color1,null);
		
	}
	
}