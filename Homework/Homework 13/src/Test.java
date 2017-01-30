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

import javafx.scene.transform.Rotate;
;

public class Test extends JPanel implements ActionListener
{
	Timer tm = new Timer(300, this);
	int x;
	int y;
	int change = 10;
	double radius = 200;
	double theta = 0;
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    g.setColor(Color.green);
    g.drawPolygon(new int[] {(getWidth()/2)-30+x, getWidth()/2, (getWidth()/2)+30-x}, new int[] {(getHeight()/2)-30-y, (getHeight()/2)+30, (getHeight()/2)-30+y}, 3);
    System.out.println(x+" "+y);
    tm.start();
    
    
  }
  public void actionPerformed(ActionEvent e){
	  if(theta>=0 && theta <=360){
		  y=(int) (30*Math.cos(theta));
		  x=(int) (30*Math.sin(theta));
		  theta++;
		  repaint();

	  }
	  else{
		  theta = 0;
	  }
  }
  
  public static void main(String[] arg){
	  Test t = new Test();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Test");
	  jf.setSize(570, 600);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.add(t);
	  
  }
}