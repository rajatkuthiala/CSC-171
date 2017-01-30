/*
 * Rajat Kuthiala
 * Homework 7 Part 4
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */
public class Part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 12345;
		double y = 546.67;
		int number=6757;
		//1st part of question to print integer and double with a space.
		System.out.printf("%-1s %s\n", x, y);
		//Print value of pi upto 3 decimple place
		System.out.printf("Pi: %.3f", Math.PI);
		//print a integer with comma after 3 places
		String comma = String.format("%,d", number);
		System.out.println("\n" +comma);
	}

}
