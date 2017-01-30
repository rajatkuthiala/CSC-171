/*
 * Rajat Kuthiala
 * Homework 2 Part 4
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

import java.util.Scanner;


public class Part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		double C, mass;
		C=299792458;
		System.out.println("Enter Mass Of Object");
		Scanner m = new Scanner(System.in);
		mass=m.nextDouble();
		double Energy = (C*C)*(mass);
		System.out.println("Enery: "+Energy + " Joules"); 
		
		
	}

}
