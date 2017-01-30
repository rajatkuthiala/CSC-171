/*
 * Rajat Kuthiala
 * Homework 10 Part 5
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
;

public class Part5 extends JPanel{

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.black);
    for(int i=0, j=0; i<=600; i+=10,j+=10)
    {
    	g.drawLine(0,j,i,600);
    }
    for(int i=600, j=0; i>=0; i-=10,j+=10)
    {
    	g.drawLine(j,600,600,i);
    }
    for(int i=0, j=0; i<=600; i+=10,j+=10)
    {
    	g.drawLine(i,0,600,j);
    }
    for(int i=600, j=0; i>=0; i-=10,j+=10)
    {
    	g.drawLine(0,i,j,0);
    }

    
    
    
  }
  public static void main(String[] arg){
	  Part5 t = new Part5();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Part5");
	  jf.setSize(617, 640);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.add(t);
	  
  }
}