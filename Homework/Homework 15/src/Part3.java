/*
 * Rajat Kuthiala
 * Homework 15 Part 3
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a integer: ");
		
		Boolean prompt = true;
		while(prompt){
			try{
				Scanner number = new Scanner(System.in);
				int numb = number.nextInt();
				System.out.println("you Entered "+numb+" which is an integer");
				prompt = false;
				
				
			}
			catch(InputMismatchException e){
				System.out.print("Invalid Input! Enter a integer: ");
				continue;
				
			}
		}
	}

}
