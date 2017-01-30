import java.awt.*;

public class test extends JApplet impliments ActionListener{
	Button b;
	Lable jl;
	public void init(){
		setLayout(new FlowLayout()); 
		b = new Button("push me"); 
		b.addActionListener(this); 
		add(b);
		jl = new Label("Welome to my applet");
		add(jl);
	}
}