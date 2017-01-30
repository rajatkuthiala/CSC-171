/*
 * Rajat Kuthiala
 * Homework 15 Part 1
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
		
		System.out.print("Enter a numeric String: ");
		Scanner	input = new Scanner(System.in);
		String str = input.nextLine();
		try{
			int number = Integer.parseInt(str);
			int sum = number+10;
			System.out.println("Adding 10 to that number is: "+sum);
		}
		catch(NumberFormatException e){
			System.out.println("Number Format Exception: Enter only numbers in string.");
			
		}
	}

}
