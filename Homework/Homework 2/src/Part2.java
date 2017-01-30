/*
 * Rajat Kuthiala
 * Homework 2 Part 2
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
		System.out.println("Input Tempratur In Farhenhite");
		Scanner temprature = new Scanner(System.in);
		double F=temprature.nextDouble();
		double convert = ((5.0/9.0)*(F-32.0) + 273.0);
		System.out.println("Temprature in Kelvin is "+ convert);
		
	}
}
