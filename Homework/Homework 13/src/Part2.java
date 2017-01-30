/*
 * Rajat Kuthiala
 * Homework 13 Part 2
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

public class Part2 extends JPanel implements ActionListener
{
	Timer tm = new Timer(30, this);
	int x=0;
	int y=0;
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.green);
    g.fillRect(x, y, 50, 50);
    tm.start();
    
    
  }
  public void actionPerformed(ActionEvent e){
	  if(x<0 || y<0 || y>getHeight()-50 || x>getWidth()-50){
		  x=0;
		  y=0;
	  }
	  else{
		  x=x+getWidth()/60;
		  y=y+getHeight()/60;
		  System.out.println(x+" "+y);
		  repaint();
	  }
  }
  
  public static void main(String[] arg){
	  Part2 t = new Part2();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Part2");
	  jf.setSize(570, 600);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.add(t);
	  
  }
}