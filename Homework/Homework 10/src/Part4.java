/*
 * Rajat Kuthiala
 * Homework 10 Part 4
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

public class Part4 extends JPanel{

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.black);
    for(int i=0, j=0; i<=600; i+=10,j+=10)
    {
    	g.drawLine(0,j,i,600);
    }

    
    
    
  }
  public static void main(String[] arg){
	  Part4 t = new Part4();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Part4");
	  jf.setSize(617, 640);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.add(t);
	  
  }
}