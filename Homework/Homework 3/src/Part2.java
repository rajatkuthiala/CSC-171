/*
 * Rajat Kuthiala
 * Homework 3 Part 2
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		System.out.println("Enter the Number: ");
		Scanner num = new Scanner(System.in);
		x = num.nextDouble();
		if  (x > 0){
			System.out.println(x+ " is Positive.");
			
		}
		else if (x<0){
			System.out.println(x+ " is Negative.");
		}
		else{
			System.out.println(x+ " is Zero");
		}
		
	}

}
