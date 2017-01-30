/*
 * Rajat Kuthiala
 * Homework 10 Part 6
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


import java.awt.*;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;
;

public class Part6 extends JPanel{

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    for(int k=0, i=80,j=80;k<12; i+=10, j+=10, k++)
    {
    	g.drawArc(250-(i/2), 250-(j/2), i, j, 0, 360);		
    }
  }
    

  public static void main(String[] arg){
	  Part6 t = new Part6();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Part6");
	  jf.setSize(617, 640);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.add(t);
	  
  }
}