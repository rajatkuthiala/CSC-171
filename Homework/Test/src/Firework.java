import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JSlider;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Button;
import java.awt.Canvas;
import javax.swing.JTextField;
import java.awt.Panel;
import java.awt.BorderLayout;

public class Firework extends JPanel {

	private JFrame frmAcmeFireworks;
	private JTextField txtSpeed;
	private JTextField txtAngle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Firework window = new Firework();
					window.repaint();
					window.frmAcmeFireworks.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	

	/**
	 * Create the application.
	 */
	public Firework() {
		initialize();
		
	}
	
	private void initialize() {
		frmAcmeFireworks = new JFrame();
		frmAcmeFireworks.setTitle("Firework Simulator- ACME");
		frmAcmeFireworks.setBounds(100, 100, 903, 525);
		frmAcmeFireworks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAcmeFireworks.getContentPane().setLayout(null);
		
		
		JComboBox shape = new JComboBox();
		shape.setModel(new DefaultComboBoxModel(new String[] {"Star", "Circle", "Triangle", "Square"}));
		shape.setToolTipText("");
		shape.setBounds(396, 363, 172, 32);
		frmAcmeFireworks.getContentPane().add(shape);
		
		JLabel lblColor = DefaultComponentFactory.getInstance().createLabel("Color");
		lblColor.setBounds(117, 333, 138, 20);
		frmAcmeFireworks.getContentPane().add(lblColor);
		
		JLabel lblR = DefaultComponentFactory.getInstance().createLabel("R");
		lblR.setBounds(15, 363, 23, 20);
		frmAcmeFireworks.getContentPane().add(lblR);
		
		JLabel lblB = DefaultComponentFactory.getInstance().createLabel("B");
		lblB.setBounds(15, 399, 26, 20);
		frmAcmeFireworks.getContentPane().add(lblB);
		
		JLabel lblG = DefaultComponentFactory.getInstance().createLabel("G");
		lblG.setBounds(15, 433, 23, 20);
		frmAcmeFireworks.getContentPane().add(lblG);
		
		JLabel lblShape = DefaultComponentFactory.getInstance().createLabel("Shape");
		lblShape.setBounds(451, 333, 59, 20);
		frmAcmeFireworks.getContentPane().add(lblShape);
		
		Button button = new Button("Simulate");
		button.setBounds(425, 412, 112, 41);
		frmAcmeFireworks.getContentPane().add(button);
		
		JSlider Blue = new JSlider();
		Blue.setMinorTickSpacing(10);
		Blue.setPaintTicks(true);
		Blue.setMaximum(255);
		Blue.setValue(0);
		Blue.setBounds(53, 399, 200, 26);
		frmAcmeFireworks.getContentPane().add(Blue);
		
		JSlider Green = new JSlider();
		Green.setMinorTickSpacing(10);
		Green.setSnapToTicks(true);
		Green.setPaintTicks(true);
		Green.setMaximum(255);
		Green.setValue(0);
		Green.setBounds(53, 433, 200, 26);
		frmAcmeFireworks.getContentPane().add(Green);
		
		JSlider Red = new JSlider();
		Red.setMinorTickSpacing(10);
		Red.setPaintTicks(true);
		Red.setSnapToTicks(true);
		Red.setMaximum(255);
		Red.setValue(0);
		Red.setBounds(53, 363, 200, 26);
		frmAcmeFireworks.getContentPane().add(Red);
		
		txtSpeed = new JTextField();
		txtSpeed.setBounds(710, 366, 146, 26);
		frmAcmeFireworks.getContentPane().add(txtSpeed);
		txtSpeed.setColumns(10);
		
		txtAngle = new JTextField();
		txtAngle.setBounds(710, 412, 146, 26);
		frmAcmeFireworks.getContentPane().add(txtAngle);
		txtAngle.setColumns(10);
		
		JLabel lblSpeedms = DefaultComponentFactory.getInstance().createLabel("Speed(m/s)");
		lblSpeedms.setBounds(619, 369, 82, 20);
		frmAcmeFireworks.getContentPane().add(lblSpeedms);
		
		JLabel lblAngledegree = DefaultComponentFactory.getInstance().createLabel("Angle(degree)");
		lblAngledegree.setBounds(602, 412, 112, 20);
		frmAcmeFireworks.getContentPane().add(lblAngledegree);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 16, 851, 303);
		frmAcmeFireworks.getContentPane().add(panel);
		
		
		
		
	}
	public void paintComponent( Graphics g) {
	    super.paintComponents(g);
	    this.setBackground(Color.CYAN);

	    g.setColor(Color.GREEN);
	    g.drawLine(21, 20, 60, 60);
	  }
}
