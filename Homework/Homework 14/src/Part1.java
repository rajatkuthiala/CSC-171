/*
 * Rajat Kuthiala
 * Homework 14 Part 1
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<Integer>();
		int num=1;
		while(num!=0){
			System.out.print("Enter the number: ");
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			numbers.add(num);
		}
		System.out.println("Enetr number to search in list: ");
		Scanner input = new Scanner(System.in);
		int look = input.nextInt();
		if(numbers.contains(look)){
			System.out.println(look + " is in the list.");
		}
		else{
			System.out.println("Number not in list");
		}
	}

}
