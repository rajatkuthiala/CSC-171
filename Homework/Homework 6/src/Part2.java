/*
 * Rajat Kuthiala
 * Homework 6 Part 2
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

class Elements{
	String name;
	String symbol;
	int atomic_number;
	double atomic_weight;
	
	public Elements(String name, String symbol, int atomic_number, double atomic_weight){
		this.name=name;
		this.symbol=symbol;
		this.atomic_number=atomic_number;
		this.atomic_weight=atomic_weight;
	}
	public String toString(){
		return "Name of Element: " + this.name + "\n"
				+ "Symbol: "+this.symbol+ "\n"+
				"Atomic Number: "+this.atomic_number+ "\n"+
				"Atomic Weight[Ar]: "+this.atomic_weight+"\n";
	}
}

public class Part2{
	public static void main(String[] args) {
		Elements hydrogen = new Elements("Hydrogen", "H", 1, 1.008);
		Elements helium = new Elements("Helium", "He", 2, 4.002);
		Elements lithium = new Elements("Lithium", "Li", 3, 6.938);
		Elements beryllium = new Elements("Beryllium", "Be", 4, 9.012);
		
		System.out.println(hydrogen);
		System.out.println(helium);
		System.out.println(lithium);
		System.out.println(beryllium);
	}
}