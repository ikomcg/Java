import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class practice extends JFrame implements MouseListener{
FlowLayout f1 = new FlowLayout();
Font aFont = new Font("Arial", Font.BOLD, 100);
Font bFont = new Font("Century", Font.BOLD, 20);
JLabel a = new JLabel("1");
JLabel b = new JLabel("2");
JLabel c = new JLabel("3");
JLabel d = new JLabel("4");
JLabel e = new JLabel("5");
JLabel f = new JLabel("6");
JLabel g = new JLabel("7");
JLabel h = new JLabel("8");
JLabel i = new JLabel("9");
JLabel j = new JLabel("");
int ran = 0;
int count = 0;
public practice()
{
 super("Number Finder");
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(f1);
 a.setFont(aFont);
 b.setFont(aFont);
 c.setFont(aFont);
 d.setFont(aFont);
 e.setFont(aFont);
 f.setFont(aFont);
 g.setFont(aFont);
 h.setFont(aFont);
 i.setFont(aFont);
 j.setFont(bFont);
 add(a);
 add(b);
 add(c);
 add(d);
 add(e);
 add(f);
 add(g);
 add(h);
 add(i);
 add(j);
 a.addMouseListener(this);
 b.addMouseListener(this);
 c.addMouseListener(this);
 d.addMouseListener(this);
 e.addMouseListener(this);
 f.addMouseListener(this);
 g.addMouseListener(this);
 h.addMouseListener(this);
 i.addMouseListener(this);
}
public void mouseClicked(MouseEvent event){

if(event.getSource()==a)
{
a.getText();
j.setText("Try Again!");
a.setEnabled(false);
count ++;
}
else if(event.getSource()==b)
{
b.getText();
j.setText("Try Again!");
b.setEnabled(false);
count++;
}
else if(event.getSource()==c)
{
c.getText();
j.setText("Try Again!");
c.setEnabled(false);
count++;
}
else if(event.getSource()==d)
{
d.getText();
j.setText("Try Again!");
d.setEnabled(false);
count++;
}
else if(event.getSource()==e){
e.getText();
j.setText("Try Again!");
e.setEnabled(false);
count++;
}
else if(event.getSource()==f){
f.getText();
j.setText("Try Again!");
f.setEnabled(false);
count++;
}
else if(event.getSource()==g){
g.getText();
g.setEnabled(true);
count ++;
j.setText("Correct! "+count+ "Attemp(s)");

}
else if(event.getSource()==h){
h.getText();
j.setText("Try Again!");
h.setEnabled(false);
count++;
}
else if(event.getSource()==i){
i.getText();
j.setText("Try Again!");
i.setEnabled(false);
count++;
}
}
public void mousePressed(MouseEvent e){
}
public void mouseReleased(MouseEvent e){
} 
public void mouseEntered(MouseEvent e){
}
public void mouseExited(MouseEvent e){ 

}
}