import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int program = 0;
		ArrayList<Double> Resistance = new ArrayList<Double>();
		while(program == 0){
			System.out.print("Enter reststance in form( or Type 1234 to proceed): ");
			Scanner resistance = new Scanner(System.in);
			Double r = resistance.nextDouble();
				if (r!=1234){
					Double c = r;
					Resistance.add(c);
				}
				else{
					program = 1;
				}
		}
		System.out.print("Enter the Value of shunt: ");
		Scanner shunt = new Scanner(System.in);
		Double s = shunt.nextDouble();
		System.out.print("Enter the Error Value ");
		Scanner error = new Scanner(System.in);
		Double e = shunt.nextDouble();
		Collections.sort(Resistance);
		Double R = 0.00003;
		ArrayList<Double> Final = new ArrayList<Double>();
		Double shunt_cap= 1/s;
		Double shunt_upper= shunt_cap+(shunt_cap*e/100);
		Double shunt_under= shunt_cap-(shunt_cap*e/100);
		
		System.out.println("Resistances available: "+Resistance);
		
		for(int i = 0; i < Resistance.size(); i++){
			while(1/(Resistance.get(i))+R<=shunt_upper){
				Final.add(Resistance.get(i));
				R = R+(1/Resistance.get(i));
				System.out.println(R);
			}
		
			
		}
		System.out.println("Final Resistors Required: 100000, 100000, 100000, "+Final);	
		
		
		

	}

}
