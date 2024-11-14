package pic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Racing extends JFrame {
    private static final long serialVersionUID = -198172151996959655L;

    //makes the screen size
    final int WIDTH = 900, HEIGHT = 650;

    //keeps track of player speed
    double plSpeed = .5, p2Speed = .5;

    //numbers that represent direction
    final int UP = 0, RIGHT = 1, DOWN = 2, LEFT = 3, STOP = 5;

    //keeps track of player direction
    int p1Direction = STOP;
    int p2Direction = STOP;

    //create rectangles
    Rectangle left = new Rectangle( 0, 0, WIDTH/9, HEIGHT );
    Rectangle right = new Rectangle( ( WIDTH/9 )*8, 0, WIDTH/9, HEIGHT );
    Rectangle top = new Rectangle ( 0, 0, WIDTH, HEIGHT/9 );
    Rectangle bottom = new Rectangle( 0, ( HEIGHT/9 ) * 8, WIDTH, HEIGHT/9 );
    Rectangle center = new Rectangle( (int) ((WIDTH/9) * 2.5), (int) ((HEIGHT/9) * 2.5), (int) ((WIDTH/9) * 5), (int) ((HEIGHT/9) * 4));

    //makes the obstacles
    Rectangle obstacle = new Rectangle ( WIDTH/2, (int) ((HEIGHT/9) * 7), WIDTH/10, HEIGHT/9 );
    Rectangle obstacle2 = new Rectangle ( WIDTH/3, (int) ((HEIGHT/9 ) * 5), WIDTH/10, HEIGHT/4 );
    Rectangle obstacle3 = new Rectangle ( 2 * (WIDTH/3), (int) ((HEIGHT/9) * 5),WIDTH/10, HEIGHT/4 );
    Rectangle obstacle4 = new Rectangle ( WIDTH/3, HEIGHT/9, WIDTH/30, HEIGHT/9 );
    Rectangle obstacle5 = new Rectangle ( WIDTH/2, (int) ((HEIGHT/9) * 1.5), WIDTH/30, HEIGHT/4 );

    //makes the finish line
    Rectangle finish = new Rectangle ( WIDTH/9, (HEIGHT/2)-HEIGHT/9, (int) ((WIDTH/9) * 1.5), HEIGHT/70 );

    //makes player 1's car
    Rectangle p1 = new Rectangle ( WIDTH/9, HEIGHT/2, WIDTH/30, WIDTH/30 );

    //makes player 2's car
    Rectangle p2 = new Rectangle ((( WIDTH/9 ) + ((int) ((WIDTH/9) * 1.5) /2)),(HEIGHT/2) + (HEIGHT/10), WIDTH/30, WIDTH/30);

    //constructor
    public Racing() {
        //define defaults for the JFrame
        super ("Racing");
        setSize( WIDTH, HEIGHT );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setBackground(Color.BLACK);

        //start the inner class
        Move2 m2 = new Move2();
        m2.start();
        Move1 m1 = new Move1();
        m1.start();
    }

    //draws the cars and race track
    public void paint(Graphics g) {

        //make borders green
        g.setColor(Color.GREEN);

        //rectangles for start lines (lineO = outer player, lineI = inner player)
        Rectangle lineO = new Rectangle( WIDTH/9, HEIGHT/2, (int) ((WIDTH/9) * 1.5)/2, HEIGHT/140 );
        Rectangle lineI = new Rectangle( ((WIDTH/9)+((int) ((WIDTH/9) * 1.5)/2)), (HEIGHT/2) + (HEIGHT/10), (int) ((WIDTH/9) * 1.5)/2, HEIGHT/140 );

        //fill the rectangles
        g.fillRect(left.x,left.y,left.width,left.height);
        g.fillRect(right.x,right.y,right.width,right.height);
        g.fillRect(top.x,top.y,top.width,top.height);
        g.fillRect(bottom.x,bottom.y,bottom.width,bottom.height);
        g.fillRect(center.x,center.y,center.width,center.height);
        g.fillRect(obstacle.x,obstacle.y,obstacle.width,obstacle.height);
        g.fillRect(obstacle2.x,obstacle2.y,obstacle2.width,obstacle2.height);
        g.fillRect(obstacle3.x,obstacle3.y,obstacle3.width,obstacle3.height);
        g.fillRect(obstacle4.x,obstacle4.y,obstacle4.width,obstacle4.height);
        g.fillRect(obstacle5.x,obstacle5.y,obstacle5.width,obstacle5.height);

        //make the starting line color white
        g.setColor(Color.WHITE);

        //draw starting line
        g.fillRect(lineO.x,lineO.y,lineO.width,lineO.height);
        g.fillRect(lineI.x,lineI.y,lineI.width,lineI.height);

        //make the finish line yellow
        g.setColor(Color.YELLOW);

        //draw the finish line
        g.fillRect(finish.x,finish.y,finish.width,finish.height);

        //make player one red
        g.setColor(Color.RED);
        //draw player 1
        g.fill3DRect(p1.x,p1.y,p1.width,p2.height,true);


        //make player two blue
        g.setColor(Color.BLUE);
        //now draw player two
        g.fill3DRect(p2.x,p2.y,p2.width,p2.height,true);
    }
    private class Move1 extends Thread implements KeyListener {
        public void run() {
            //makes the key listener "wake up"
            addKeyListener(this);

            //should be done in an infinite loop, so it repeats
            while (true) {
                //make try block, so it can exit if it errors
                try {
                    //refresh screen
                    repaint();

                    //check to see if car hits wall
                    //if so, slow down
                    if (p1.intersects(left) || p1.intersects(right) ||
                        p1.intersects(top) || p1.intersects(bottom) ||
                        p1.intersects(obstacle) || p1.intersects(obstacle2) ||
                        p1.intersects(obstacle3) || p1.intersects(obstacle4) ||
                        p1.intersects(obstacle5) || p1.intersects (center) ||
                        p1.intersects(p2)) {
                            plSpeed = -5;
                            Thread.sleep(128);
                            p1Direction = STOP;
                    }

                    //lets the car stop
                    if (plSpeed==0) {
                        p1Direction = STOP;
                    }

                    //moves player based on direction
                    if (p1Direction==UP) {
                        p1.y -= (int) plSpeed;
                    }
                    if (p1Direction==DOWN) {
                        p1.y += (int) plSpeed;
                    }
                    if (p1Direction==LEFT) {
                        p1.x -= (int) plSpeed;
                    }
                    if (p1Direction==RIGHT) {
                        p1.x += (int) plSpeed;
                    }
                    if (p1Direction==STOP) {
                        plSpeed = 0;
                    }

                    //delays refresh rate
                    Thread.sleep(75);
                }
                catch(Exception e) {
                    //if an error, exit
                    break;
                }
            }
        }

        //have to input these (so it will compile)
        public void keyPressed(KeyEvent event) {
            try {
                //makes car increase speed a bit
                if (event.getKeyChar()=='w' ||
                    event.getKeyChar()=='a' ||
                    event.getKeyChar()=='s' ||
                    event.getKeyChar()=='d') {
                        plSpeed += .2;
                        repaint();
                }
            } catch (Exception I) {}
        }
        public void keyReleased(KeyEvent event) {}

        //now, to be able to set the direction
        public void keyTyped(KeyEvent event) {
            if (event.getKeyChar()=='a') {
                if (p1Direction==RIGHT) {
                    p1Brake();
                } else {
                    if (p1Direction==LEFT) {
                    } else {
                        plSpeed = .5;
                        p1Direction = LEFT;
                    }
                }
            }
            if (event.getKeyChar()=='s') {
                if (p1Direction==UP) {
                    p1Brake();
                } else {
                    if (p1Direction==DOWN) {
                    } else {
                        plSpeed = .5;
                        p1Direction = DOWN;
                    }
                }
            }
            if (event.getKeyChar()=='d') {
                if (p1Direction==LEFT) {
                    p1Brake();
                } else {
                    if (p1Direction==RIGHT) {
                    } else {
                        plSpeed = .5;
                        p1Direction = RIGHT;
                    }
                }
            }
            if (event.getKeyChar()=='w') {
                if (p1Direction==DOWN) {
                    p1Brake();
                } else {
                    if (p1Direction==UP) {
                    } else {
                        plSpeed = .5;
                        p1Direction = UP;
                    }
                }
            }
            if (event.getKeyChar()=='z') {
                p1Brake();
            }
        }

        public void p1Brake () {
            try {
                while (plSpeed != 0) {
                    plSpeed -= .2;
                    Thread.sleep(75);
                }
            } catch (Exception e) {
                plSpeed = 0;
            }
        }
    }
    private class Move2 extends Thread implements KeyListener {
        public void run() {
            //makes the key listener "wake up"
            addKeyListener(this);

            //should be done in an infinite loop, so it repeats
            while (true) {
                //make try block, so it can exit if it errors
                try {
                    //refresh screen
                    repaint();

                    //check to see if car hits outside wall
                    //if so, slow down
                    if (p2.intersects(left) || p2.intersects(right) ||
                        p2.intersects(top) || p2.intersects(bottom) ||
                        p2.intersects(obstacle) || p2.intersects(obstacle2) ||
                        p2.intersects(obstacle3) || p2.intersects(obstacle4) ||
                        p2.intersects(obstacle5) || p2.intersects(p1) ||
                        p2.intersects(center)) {
                            plSpeed = -.25;
                            Thread.sleep(128);
                            p2Direction = STOP;
                    }

                    //makes car increase speed a bit
                    if (p2Speed <= 5) {
                        plSpeed += .2;
                    }

                    //lets the car stop
                    if (p2Speed == 0) {
                        p2Direction = STOP;
                    }

                    //moves player based on direction
                    if (p2Direction==UP) {
                        p2.y -= (int) p2Speed;
                    }
                    if (p2Direction==DOWN) {
                        p2.y += (int) p2Speed;
                    }
                    if (p2Direction==LEFT) {
                        p2.x -= (int) p2Speed;
                    }
                    if (p2Direction==RIGHT) {
                        p2.x += (int) p2Speed;
                    }
                    if (p2Direction==STOP) {
                        p2Speed = 0;
                    }

                    //delays refresh rate
                    Thread.sleep(75);
                }
                catch(Exception e) {
                    //if an error, exit
                    break;
                }
            }
        }

        public void keyPressed(KeyEvent event) {
            try {
                //makes car increase speed a bit
                if (event.getKeyChar()=='j' ||
                    event.getKeyChar()=='k' ||
                    event.getKeyChar()=='l' ||
                    event.getKeyChar()=='i') {
                        plSpeed += .2;
                }
            } catch (Exception I) {}
        }
        public void keyReleased(KeyEvent event) {}

        //now, to be able to set the direction
        public void keyTyped(KeyEvent event) {
            if (event.getKeyChar()=='j') {
                if (p2Direction==RIGHT) {
                    p2Brake();
                } else {
                    p2Direction = LEFT;
                    p2Speed = .4;
                }
            }
            if (event.getKeyChar()=='k') {
                if (p2Direction==UP) {
                    p2Brake();
                } else {
                    p2Direction = DOWN;
                    p2Speed = .4;
                }
            }
            if (event.getKeyChar()=='l') {
                if (p2Direction==LEFT) {
                    p2Brake();
                } else {
                    p2Direction = RIGHT;
                    p2Speed = .4;
                }
            }
            if (event.getKeyChar()=='i') {
                if (p2Direction==DOWN) {
                    p2Brake();
                } else {
                    p2Direction = UP;
                    p2Speed = .4;
                }
            }
            if (event.getKeyChar()=='m') {
                p2Brake();
            }
        }

        public void p2Brake () {
            try {
                while (p2Speed != 0) {
                    p2Speed -= .5;
                    Thread.sleep(75);
                }
            } catch (Exception i) {
                p2Speed = 0;
            }
        }
    }

    //finally, to start the program
    public static void main(String[] args) {
        Racing frame = new Racing();
        frame.setVisible( true );
        frame.setLocationRelativeTo( null );
        frame.setResizable( false );
    }
}