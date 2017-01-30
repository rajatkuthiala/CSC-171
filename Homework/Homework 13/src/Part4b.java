/*
 * Rajat Kuthiala
 * Homework 13 Part 4b
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

public class Part4b extends JPanel implements ActionListener
{
	Timer tm = new Timer(5000, this);
	int xstart;
	int ystart;
	int xend;
	int yend;
	Color c;
	Random r=new Random();
		
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(c);
    for (int i=1;i<=100;i++){
		  Random rn = new Random();
		  xstart=rn.nextInt(getWidth()+1) + 1;
		  ystart=rn.nextInt(getHeight()+1) + 1;
		  xend=rn.nextInt(getWidth()+1) + 1;
		  yend=rn.nextInt(getHeight()+1) + 1;
		  g.drawLine(xstart, ystart, xend, yend);
    }
    tm.start();
  }
  public void actionPerformed(ActionEvent e){
	  c=new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
	  repaint();
  }
  
  public static void main(String[] arg){
	  Part4b t = new Part4b();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Part4b");
	  jf.setSize(570, 600);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.add(t);
	  
  }
}