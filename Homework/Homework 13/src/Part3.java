/*
 * Rajat Kuthiala
 * Homework 13 Part 3
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

public class Part3 extends JPanel implements ActionListener
{
	Timer tm = new Timer(30, this);
	int x;
	int y;
	int change = 10;
	double radius = 200;
	double theta = 0;
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.green);
    g.fillRect(x, y, 50, 50);
    tm.start();
    
    
  }
  public void actionPerformed(ActionEvent e){
	  if(theta>=0 && theta <=360){
		  x=(((int) (radius*Math.cos(theta*Math.PI/180)))+getWidth()/2);
		  y=((int) (radius*Math.sin(theta*Math.PI/180))+getHeight()/2);
		  theta++;
		  repaint();
		  System.out.println(theta);

	  }
	  else{
		  theta = 0;
	  }
  }
  
  public static void main(String[] arg){
	  Part3 t = new Part3();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Part3");
	  jf.setSize(570, 600);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.add(t);
	  
  }
}