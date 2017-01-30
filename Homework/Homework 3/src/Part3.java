/*
 * Rajat Kuthiala
 * Homework 3 Part 3
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
		System.out.println("Entey Your Age: ");
		Scanner x = new Scanner(System.in);
		int age = x.nextInt();
		if (age > 0 && age<13){
			System.out.println("You're just a kid");
			
		}
		else if (age >= 13 && age <20){
			System.out.println("You're a teenager!");
			
		}
		else if (age>=20 && age <30){
			System.out.println("You're getting older...");
		}
		else if (age>=30) {
			System.out.println("You're over the hill");
		}
		else{
			System.out.println("Invalid Entry");
		}
	}

}
