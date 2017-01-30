/*
 * Rajat Kuthiala
 * Project 3
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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
;

public class Game extends JPanel implements ActionListener
{
	
	int x ;
	int y ;
	int r;
	int b;
	int g;
	Color c;
	int height;
	int distance;
	double t=10.0;
	
	private JTextField speed;
	private JTextField angle;
	JComboBox shapes;
	JLabel javaisfun;
	
	public Game(){
		setBackground(Color.BLACK);
 
		setLayout(null);
		JSlider blue = new JSlider();
		blue.setMinorTickSpacing(10);
		blue.setValue(0);
		blue.setPaintTicks(true);
		blue.setMaximum(255);
		blue.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent event) {
				b = blue.getValue();
			}
		});
		blue.setBounds(33, 460, 182, 26);
		add(blue);
		
		JSlider green = new JSlider();
		green.setMinorTickSpacing(10);
		green.setValue(0);
		green.setPaintTicks(true);
		green.setMaximum(255);
		green.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent event) {
				g = green.getValue();
			}
		});
		green.setBounds(33, 430, 182, 26);
		add(green);
		
		JSlider red = new JSlider();
		red.setMajorTickSpacing(255);
		red.setMinorTickSpacing(10);
		red.setValue(0);
		red.setMaximum(255);
		red.setPaintTicks(true);
		red.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent event) {
				r = red.getValue();
			}
		});
		red.setBounds(33, 400, 182, 26);
		add(red);
		
		shapes = new JComboBox();
		shapes.setModel(new DefaultComboBoxModel(new String[] {" ","JavaIsFun", "Square", "Triangle", "Circle", "Star"}));
		shapes.setBounds(284, 400, 98, 26);
		add(shapes);
		
		speed = new JTextField();
		speed.setBounds(514, 400, 98, 26);
		add(speed);
		speed.setColumns(10);
		
		angle = new JTextField();
		angle.setBounds(514, 441, 98, 26);
		add(angle);
		angle.setColumns(10);
		
		JButton btnNewButton = new JButton("Simulate");
		btnNewButton.addActionListener(this); 
		btnNewButton.setBounds(275, 457, 115, 29);
		add(btnNewButton);
		
		JLabel lblColor = DefaultComponentFactory.getInstance().createLabel("Color");
		lblColor.setBounds(96, 364, 52, 20);
		add(lblColor);
		
		JLabel lblShape = DefaultComponentFactory.getInstance().createLabel("Shape");
		lblShape.setBounds(307, 364, 52, 20);
		add(lblShape);
		
		JLabel lblR = DefaultComponentFactory.getInstance().createLabel("R");
		lblR.setBounds(15, 400, 16, 20);
		add(lblR);
		
		JLabel lblB = DefaultComponentFactory.getInstance().createLabel("B");
		lblB.setBounds(15, 430, 16, 20);
		add(lblB);
		
		JLabel lblG = DefaultComponentFactory.getInstance().createLabel("G");
		lblG.setBounds(15, 460, 16, 20);
		add(lblG);
		
		JLabel lblSpeed = DefaultComponentFactory.getInstance().createLabel("Speed(m/s)");
		lblSpeed.setBounds(424, 400, 88, 20);
		add(lblSpeed);
		
		JLabel lblAngle = DefaultComponentFactory.getInstance().createLabel("Angle");
		lblAngle.setBounds(466, 444, 46, 20);
		add(lblAngle);
		
		javaisfun= new JLabel("");
		javaisfun.setEnabled(false);
		javaisfun.setBounds(353, 68, 69, 20);
		add(javaisfun);
		
	}
	public void paintComponent(Graphics g)
	  {
		super.paintComponent(g);
		String SHAPE = (String) shapes.getSelectedItem();
	    g.setColor(c);
	    g.drawLine(getWidth()/2-100, getHeight()-300,getWidth()/2-100+distance, getHeight()-300-height);
	    if(SHAPE.equalsIgnoreCase("square")){
	    	g.fillRect(getWidth()/2-110+distance, getHeight()-310-height, 30, 30);
	    }
	    if(SHAPE.equalsIgnoreCase("Triangle")){
	    	g.drawPolygon(new int[] {getWidth()/2-120+distance, getWidth()/2-100+distance, getWidth()/2-80+distance}, new int[] {getHeight()-310-height, getHeight()-330-height, getHeight()-310-height}, 3);
	    }
	    if(SHAPE.equalsIgnoreCase("Circle")){
	    	g.drawOval(getWidth()/2-100+distance, getHeight()-300-height, 20, 20);
	    }
	    if(SHAPE.equalsIgnoreCase("JAVAISFUN")){
	    	javaisfun.setText("*JAVA IS FUN*");
	    	javaisfun.setBounds(getWidth()/2-130+distance, getHeight()-330-height, 100, 10);
	    	javaisfun.setForeground(c);
	    	javaisfun.setEnabled(true);
	    }
	    if(SHAPE.equalsIgnoreCase("STAR")){
	    	javaisfun.setText("********* \n *********");
	    	javaisfun.setBounds(getWidth()/2-130+distance, getHeight()-330-height, 100, 40);
	    	javaisfun.setForeground(c);
	    	javaisfun.setEnabled(true);
	    }
	    
	  }
		
	public void actionPerformed(ActionEvent e){
		String v = speed.getText();
		String theta = angle.getText();
		x= Integer.parseInt(v);
		y= Integer.parseInt(theta);
		c=new Color(r,b,g);
		System.out.println(r+" "+b+" "+g);
		
		distance = (int) (x*x*Math.sin(0.01745329252*y)*Math.cos(0.01745329252*y)/9.8);
		height = (int) (x*Math.sin(0.01745329252*y)*x*Math.sin(0.01745329252*y)/(2*9.8));
		System.out.println(distance+" "+height);
		repaint();
		
		repaint();
	}
	
  
  public static void main(String[] arg){
	  Game t = new Game();
	  
	  JFrame jf = new JFrame(); 
	  jf.setTitle("Fiework Simulator 5000- ACME");
	  jf.setSize(650, 550);
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.getContentPane().add(t);
	  
  }
}