/*
 * Rajat Kuthiala
 * Homework 2 Part 1
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

import java.util.Scanner;


public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x, y;
		System.out.println("Input two numbers");
		Scanner input = new Scanner(System.in);
		x = input.nextDouble();
		y = input.nextDouble();
		double sum= x+y;
		double subtraction = x-y;
		double multiplication = x*y;
		double division = x/y;
		System.out.println("Sum Of Numbers is "+sum);
		System.out.println("Subtraction Of Numbers is "+subtraction);
		System.out.println("Product Of Numbers is "+ multiplication);
		System.out.println("Division Of Numbers is "+ division);
				
		;
	}

}
