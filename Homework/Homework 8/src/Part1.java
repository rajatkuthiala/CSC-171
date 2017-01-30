/*
 * Rajat Kuthiala
 * Homework 8 Part 1
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
		System.out.print("Enter length of array: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int[] array = new int[x];
		int i;
		for(i=0; i<x; i++){
			System.out.print("Enter integer for array: ");
			Scanner integer = new Scanner(System.in);
			int a = integer.nextInt();
			array[i]=a;
			
		}
	}

}
