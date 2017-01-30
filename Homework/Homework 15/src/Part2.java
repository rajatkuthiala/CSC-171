/*
 * Rajat Kuthiala
 * Homework 15 Part 2
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
		String InputValue;
		int number1 = 0;
		int number2 = 0;
		String operation;
		
		System.out.print("Enter a arithmatic equation(Put space between operation): ");
		Scanner input = new Scanner(System.in);
		InputValue = input.nextLine();
		String value[] = InputValue.split(" ");
		try{
			number1 = Integer.parseInt(value[0]);
			number2=Integer.parseInt(value[2]);
		}
		catch(NumberFormatException e){
			System.out.println("Number Format Exception: Enter only numbers in string.");
		}
		
		operation = value[1];
		
		try{
			if(operation.equals("+")){
				System.out.println("Sum of numbers is: "+(number1+number2));
			}
			else if(operation.equals("-")){
				System.out.println("Difference of numbers is: "+(number1-number2));
			}
			else if(operation.equals("*")){
				System.out.println("Product of numbers is: "+(number1*number2));
			}
			else if(operation.equals("/")){
				System.out.println("Divisor of numbers is: "+(number1/number2));
			}
			else if(operation.equals("%")){
				System.out.println("Modulo of numbers is: "+(number1+number2));
			}
		}
		catch(ArithmeticException f){
			System.out.println("Arithmetic Exception: Invalid Opertion");
		}
		
	}

}
