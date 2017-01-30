/*
 * Rajat Kuthiala
 * Homework 10 Part 1
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

public class Part2 extends JPanel{

  public void paintComponent(Graphics g)
  {
	  PointerInfo a = MouseInfo.getPointerInfo();
	  Point b = a.getLocation();
	  int x = (int) b.getX();
	  int y = (int) b.getY();
	  
	  super.paintComponent(g);
	  g.drawLine(x, y, x+1, y+1);
    
  }
  
  public static void main(String[] arg){
	  Part2 t = new Part2();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Part2");
	  jf.setSize(617, 640);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
  }
}