/*
 * Rajat Kuthiala
 * Homework 13 Part 4c
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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
;

public class Part4c extends JPanel implements ActionListener
{
	JTextField txt;
	int num;
	Timer tm = new Timer(5000, this);
	int xstart;
	int ystart;
	int xend;
	int yend;
	Color c;
	Random r=new Random();
	public Part4c(){
		 
		txt = new JTextField("Enter Number Of Lines");
		txt.setBounds(1, 1, 300, 30);
 
		JButton button = new JButton(" OK ");
		button.setBounds(40, 40, 200, 40);
 
		setLayout(null);
		add(txt);
		add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				String getTxt = txt.getText();
				num = Integer.parseInt(getTxt);
				System.out.println(num);
				repaint();
			}
			
		});
		
	}
	public void paintComponent(Graphics g)
	  {
	    super.paintComponent(g);
	    g.setColor(c);
	    for (int i=1;i<=num;i++){
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
	  Part4c t = new Part4c();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Part4");
	  jf.setSize(570, 600);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.add(t);
	  
  }
}