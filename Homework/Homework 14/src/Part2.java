/*
 * Rajat Kuthiala
 * Homework 14 Part 2
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

public class Part2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = new ArrayList<String>();
		String state="start";
		while(state.equalsIgnoreCase("start")){
			System.out.print("Enter String:(Type break to stop input) ");
			Scanner input = new Scanner(System.in);
			String word = input.nextLine();
			if(word.equalsIgnoreCase("break")){
				state="stop";
			}
			else{
				words.add(word);
				System.out.println(words);
			}
			
		}
		System.out.print("Enter string to look for ");
		Scanner input = new Scanner(System.in);
		String lookup = input.nextLine();
		for(int i=0; i<words.size();i++){
			if(lookup.equalsIgnoreCase(words.get(i))){
				System.out.println(lookup+" at index "+i);
				
			}
		}
	}
}
