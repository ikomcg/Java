import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Drawing extends JFrame {
	
	public static void main(String[] args) {
		Drawing  dr = new Drawing();
		dr.setSize(508,604);
		dr.setVisible(true);
		dr.setLocationRelativeTo(null);
		
	}
	
	public void paint(Graphics g) {
		//Body
		g.setColor(Color.BLACK);
		g.fillRect(99,98, 287,277);
		g.setColor(Color.YELLOW);
		g.fillRect(101,100, 283,273);
		
		g.setColor(new Color(46, 139, 87));
		g.fillOval(102,117, 20,40);
		g.setColor(new Color(46, 139, 87));
		g.fillOval(105,155, 10,20);
		g.setColor(new Color(46, 139, 87));
		g.fillOval(360,101, 20,40);
		g.setColor(new Color(46, 139, 87));
		g.fillOval(121,289, 20,40);
		g.setColor(new Color(46, 139, 87));
		g.fillOval(326,295, 20,40);
		g.setColor(new Color(46, 139, 87));
		g.fillOval(350,324, 10,20);
		
//		EYES
		g.setColor(Color.BLACK);
		g.fillArc(149,138, 89,89,0,360);
		g.setColor(Color.WHITE);
		g.fillArc(151,139, 86,86,0,360);
		g.setColor(Color.BLACK);
		g.fillArc(235,137, 89,89,0,360);
		g.setColor(Color.WHITE);
		g.fillArc(237,139, 86,86,0,360);
		
		g.setColor(Color.BLACK);
		g.fillArc(173,163, 43,43,0,360);
		g.setColor(new Color(0, 153, 204));
		g.fillArc(175,165, 40,40,0,360);

		g.setColor(Color.BLACK);
		g.fillArc(260,163, 43,43,0,360);
		g.setColor(new Color(0, 153, 204));
		g.fillArc(262,165, 40,40,0,360);
		
		g.setColor(Color.BLACK);
		g.fillArc(187,175, 20,20,0,360);
		g.setColor(Color.BLACK);
		g.fillArc(273,175, 20,20,0,360);
		
		//nose
		g.setColor(Color.BLACK);
		g.fillArc(228,188,29,58,250,-320);
		g.setColor(Color.YELLOW);
		g.fillArc(230,190,25,55,250,-320);
	

		//mouth
		g.setColor(Color.BLACK);
		g.drawArc(140,90,200,200,-150,120);
		g.drawArc(140,91,200,200,-150,120);
		g.drawArc(140,92,200,200,-150,120);
		g.drawArc(140,93,200,200,-150,120);
		
		g.setColor(new Color(210, 105, 30));
		g.drawArc(126,215, 40, 30, -130, -200);
		g.setColor(new Color(210, 105, 30));
		g.drawArc(126,216, 40, 30, -130, -200);
		g.setColor(new Color(210, 105, 30));
		g.drawArc(126,217, 40, 30, -130, -200);
		
		g.setColor(new Color(210, 105, 30));
		g.fillArc(135,225, 7, 7, 0, 360);
		g.setColor(new Color(210, 105, 30));
		g.fillArc(145,230, 8, 8, 0, 360);
		g.setColor(new Color(210, 105, 30));
		g.fillArc(151,225, 7, 7, 0, 360);
		
		g.setColor(new Color(210, 105, 30));
		g.drawArc(317,215, 40, 30, 130, -200);
		g.setColor(new Color(210, 105, 30));
		g.drawArc(317,216, 40, 30, 130, -200);
		g.setColor(new Color(210, 105, 30));
		g.drawArc(317,217, 40, 30, 130, -200);
		
		g.setColor(new Color(210, 105, 30));
		g.fillArc(337,225, 7, 7, 0, 360);
		g.setColor(new Color(210, 105, 30));
		g.fillArc(329,228, 8, 8, 0, 360);
		g.setColor(new Color(210, 105, 30));
		g.fillArc(343,232, 7, 7, 0, 360);
		

		g.setColor(Color.BLACK);
		g.fillRect(202,293,31,38);
		g.setColor(Color.WHITE);
		g.fillRect(204,295,28,35);
		g.setColor(Color.BLACK);
		g.fillRect(248,292,31,38);
		g.setColor(Color.WHITE);
		g.fillRect(250,295,28,35);
		
		
		//pans
		g.setColor(Color.BLACK);
		g.fillRect(99,361, 287,54);
		g.setColor(Color.WHITE);
		g.fillRect(101,363, 283,51);
		g.setColor(Color.BLACK);
		g.fillRect(99,406, 287,67);
		g.setColor(new Color(210, 105, 30));
		g.fillRect(101,409, 283,63);
		g.setColor(Color.BLACK);
		g.fillRect(107,430, 55,15);
		g.setColor(Color.BLACK);
		g.fillRect(174,430, 55,15);
		g.setColor(Color.BLACK);
		g.fillRect(248,430, 55,15);
		g.setColor(Color.BLACK);
		g.fillRect(325,430, 55,15);

	}
}
