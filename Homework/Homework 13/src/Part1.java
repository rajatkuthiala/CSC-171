/*
 * Rajat Kuthiala
 * Homework 13 Part 1
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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
;

public class Part1 extends JPanel implements ActionListener
{
	Timer tm = new Timer(30, this);
	int x=0;
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.green);
    g.fillRect(0+x, 0+x, 50, 50);
    tm.start();
    
    
  }
  public void actionPerformed(ActionEvent e){
	  
	  x=x+10;
	  repaint();
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