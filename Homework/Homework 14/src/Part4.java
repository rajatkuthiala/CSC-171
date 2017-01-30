/*
 * Rajat Kuthiala
 * Homework 14 Part 4
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

public class Part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		List<String> duplicate = new ArrayList<String>();
		String status = "inserting";
		while(status.equalsIgnoreCase("inserting")){
			System.out.print("Enter name(type lookup to lookup duplicate names): ");
			Scanner input = new Scanner(System.in);
			String name = input.nextLine();
			if(name.equalsIgnoreCase("lookup")){
				status = "lookup";
			}
			else{
				names.add(name);
			}	
		}
		for(int i =0; i<names.size(); i++){
			for(int j=(i+1);j<names.size();j++){
				if(names.get(i).equalsIgnoreCase(names.get(j))){
					duplicate.add(names.get(j));
					names.remove(j);
				}
			}
		}
		System.out.print("Enter name to lookup: ");
		Scanner input = new Scanner(System.in);
		String look = input.nextLine();
		for(int i=0; i<duplicate.size();i++ ){
			if(look.equalsIgnoreCase(duplicate.get(i))){
				System.out.println(look+" in duplicate.");
			}
		}
		
	}

}
