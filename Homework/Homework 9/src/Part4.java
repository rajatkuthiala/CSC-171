/*
 * Rajat Kuthiala
 * Homework 9 Part 4
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


class Financial{
	double P;
	double B;
	double N;
	int t;
	double R;
	double r;
	public Financial(double amount, int time, double rate){
		this.N=amount;
		this.t=time;
		this.R=rate/100;
		this.r=(this.R/12);
	}
	public void payment(){
		P=N*(r*Math.pow((1+r), t))/(Math.pow((1+r), t)-1);
		System.out.println("Monthly Payment: "+P);
	}
	public void balance(){
		System.out.println("Months          Amount");
		for(int i=0; i<=t; i++){
			B=N*(Math.pow((1+r), t)-Math.pow((1+r), i))/(Math.pow(1+r, t)-1);
			System.out.println("  "+i+"             "+B);
		}
	}
}
public class Part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Financial rajat = new Financial(1000,24,5);
		rajat.payment();
		rajat.balance();
	}

}
