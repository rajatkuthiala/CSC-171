/*
 * Rajat Kuthiala
 * Project 4
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */



import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Timer;

import javax.swing.JFrame;


public class Gameplay extends Canvas{
	
	int bullet1_x, bullet1_y, bullet1_radius;
	int ball_x,ball_y,speed_x,speed_y,ball_size;
	int pong1_x, pong1_y, pong1_move ,pong1_size;
	int pong2_x, pong2_y, pong2_move ,pong2_size;
	int score, lives;
	int level, level_score;
	int vx,vy,x,y;
	int time;
	int R1,R2,B1,B2,G1,G2;
	Color pong1, pong2;
	Timer t = new Timer(true);

public Gameplay(){
	enableEvents(java.awt.AWTEvent.KEY_EVENT_MASK);
	setBackground(Color.BLACK);
	score=0;
	lives=5;

	pong1_x = 250;
	pong1_y = 450;
	pong1_move = 20;
	pong1_size=50;
	
	pong2_x = 250;
	pong2_y = 0;
	pong2_move = 20;
	pong2_size=50;
	
	level=1;
	level_score=0;
	
	time=360;
	
	R1=255;
	B1=0;
	G1=0;
	pong1 = new Color(R1,G1,B1);
	
	
	R2=0;
	B2=0;
	G2=255;
	pong2 = new Color(R2,G2,B2);
	
	bullet1_x=0;
	bullet1_y=430;
	bullet1_radius = 0;


	
	t.schedule(new java.util.TimerTask()
	    {
	    public void run(){
	    	bounce();
	        repaint();
	        }
	    },0,20);
}

public void paint(Graphics g)
{
	
	g.setColor(pong1);
	g.fillRect(pong1_x,535, pong1_size,10);
	g.fillOval(bullet1_x, bullet1_y, bullet1_radius, bullet1_radius);
	
	g.setColor(pong2);
	System.out.println(pong2);
	g.fillRect(pong2_x,0, pong2_size,10);
	
	g.setFont(new Font("Aerial", Font.PLAIN, 20));
	
}
public void processKeyEvent(KeyEvent e)
{
    if ( e.getID() == KeyEvent.KEY_PRESSED )
    {
        if ( e.getKeyCode() == KeyEvent.VK_RIGHT && pong1_x<getWidth()-pong1_size)
        {
        pong1_x = pong1_x + pong1_move; 
        }

        if ( e.getKeyCode() == KeyEvent.VK_LEFT && pong1_x>0 )
        {
        pong1_x = pong1_x - pong1_move;
        }
        if (e.getKeyCode() == KeyEvent.VK_F1 && pong2_x>0){
        	pong2_x = pong2_x-pong2_move;
        }
        if (e.getKeyCode() == KeyEvent.VK_F2 && pong2_x<getWidth()-pong2_size){
        	pong2_x = pong2_x+pong2_move;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
        	bullet1_radius=20;
        	bullet1_x=pong1_x+25;
        }
        
        
    }
}
public void bounce()
	{
	
	if(bullet1_radius!=0&& bullet1_y>0){
	bullet1_y=bullet1_y-30;
	}
	if(bullet1_y<=0){
		bullet1_radius=0;
		bullet1_y=430;
	}
	if(bullet1_x>=pong2_x && bullet1_y<=10){
		R2=R2+30;
		B2=B2+30;
		repaint();
		System.out.println(R2+" "+B2+" "+G2);
	}
	
	
	System.out.println(bullet1_x+" "+ pong2_x);
    /* if(R1!=255&&G1 !=255 &&B1 !=255){
    	if(bullet1_radius==20){
    		bullet1_y=bullet1_y-10;
    		if(bullet1_y==0&&bullet1_x>=pong2_x&&x<=pong2_x+50){
    			R2=+30;
    			B2=+30;   
    		}
    	}
    }*/
    
}
    
public boolean isFocusable(){
	return true;							//Took Help From Google to implement it.
	}
public static void main(String[] args)
	{
	JFrame jf = new JFrame("Shooter Game");
	jf.setSize(600,600);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jf.add(new Gameplay());
	jf.setVisible(true);
}


}

