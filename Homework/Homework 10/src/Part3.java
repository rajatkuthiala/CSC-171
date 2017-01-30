/*
 * Rajat Kuthiala
 * Homework 10 Part 3
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

public class Part3 extends JPanel{

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.black);
    for(int i=0, j=600; i<=600; i+=20, j-=20)
    {
    	g.drawLine(0,0 , i, j);
    }
    for(int i=600, j=600; i>=0; i-=20, j-=20)
    {
    	g.drawLine(0,600 , i, j);
    }
    for(int i=0, j=600; i<=600; i+=20, j-=20)
    {
    	g.drawLine(600,600 , i, j);
    }
    for(int i=600, j=600; i>=0; i-=20, j-=20)
    {
    	g.drawLine(600,0 , i, j);
    }
    
    
    
  }
  public static void main(String[] arg){
	  Part3 t = new Part3();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Part3");
	  jf.setSize(617, 640);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.add(t);
	  
  }
}