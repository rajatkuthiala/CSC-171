/*
 * Rajat Kuthiala
 * Homework 14 Part 3
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Part3 {
	static int index1 = 4;
	static int index2 = 7;
	static List<Integer> numbers = Arrays.asList(10,331,31,63,3635,34,89,13,6536,90,123,123); 

	public static void main(String[] args) {
		if(inList()){
			System.out.println("Numbers at these indexes are same");
		}
		else{
			System.out.println("Numbers at these indexes are not same");

		}
}


public static boolean inList(){
		if(numbers.get(index1)==numbers.get(index2)){
			return true;
		}
		else{
			return false;
		}
	}
}