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

public class Part1 extends JPanel{

  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.red);
    g.drawRect(0, 0, 600, 600);
    g.setColor(Color.blue);
    g.drawLine(300,0 , 300, 600);
    g.drawLine(0,300 , 600, 300);
    g.setColor(Color.green);
    g.drawLine(0,0 , 600, 600);
    g.drawLine(0,600 , 600, 0);
    
  }
  
  public static void main(String[] arg){
	  Part1 t = new Part1();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Part1");
	  jf.setSize(617, 640);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.add(t);
	  
  }
}