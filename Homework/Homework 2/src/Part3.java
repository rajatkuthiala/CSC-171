/*
 * Rajat Kuthiala
 * Homework 2 Part 3
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
		System.out.println("Enter Seconds to Convert");
		Scanner seconds = new Scanner(System.in);
		int x = seconds.nextInt();
		int minutes = x/60;
		int second = x%60;
		int hours = minutes/60;
		System.out.println(hours+ " Hours "+ (minutes-(hours*60))+" Minutes "+ second +" Seconds" );
				
		
	}

}
