/*
 * Rajat Kuthiala
 * Homework 13 Part 4a
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
;

public class Part4a extends JPanel 
{
	int xstart;
	int ystart;
	int xend;
	int yend;
	
		
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.black);
    for (int i=1;i<=100;i++){
		  Random rn = new Random();
		  xstart=rn.nextInt(getWidth()+1) + 1;
		  ystart=rn.nextInt(getHeight()+1) + 1;
		  xend=rn.nextInt(getWidth()+1) + 1;
		  yend=rn.nextInt(getHeight()+1) + 1;
		  g.drawLine(xstart, ystart, xend, yend);
    }
    
    
    
  	  
  }
  
  public static void main(String[] arg){
	  Part4a t = new Part4a();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Part4a");
	  jf.setSize(570, 600);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.add(t);
	  
  }
}