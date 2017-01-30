/*
 * Rajat Kuthiala
 * Homework 14 Part 5
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Part5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map phonebook = new HashMap();
		String status = "insert";
		String InputValue;
		while(status.equalsIgnoreCase("insert")){
			System.out.print("Name PhoneNumber(type lookup to switch to lookup mode): ");
			Scanner input = new Scanner(System.in);
			InputValue = input.nextLine();
			if(InputValue.equalsIgnoreCase("lookup")){
				status = "lookup";
			}
			else{
				String value[] = InputValue.split(" ");
				String name = value[0];
				int number = Integer.parseInt(value[1]);
				phonebook.put(name, number);
			}
			
			
		}
		System.out.print("Find Person: ");
		Scanner input = new Scanner(System.in);
		String look = input.nextLine();
		System.out.println(look+ " phone number is "+phonebook.get(look));
		
	}
}
