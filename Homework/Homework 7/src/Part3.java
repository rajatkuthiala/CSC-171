

/*
 * Rajat Kuthiala
 * Homework 7 Part 3
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

import java.util.Scanner;
public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter 1st String: ");
		Scanner string1 = new Scanner(System.in);
		String string_1 = string1.nextLine();
		System.out.print("Enter 2nd String: ");
		Scanner string2 = new Scanner(System.in);
		String string_2 = string2.nextLine();
		
		//Condition statements to compare strings
		if (string_1.equals(string_2)){
			System.out.println("String 1 is equal to String 2");
		}
		
		else if (string_1.startsWith(string_2)){
			System.out.println("String 1 starts with String 2");
		}
		else if(string_1.endsWith(string_2)){
			System.out.println("String 1 ends with String 2");
		}
		else if (string_1.contains(string_2)){
			System.out.println("String 2 is in String 1");
		}
		
	}

}
