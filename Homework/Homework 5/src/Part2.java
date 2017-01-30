/*
 * Rajat Kuthiala
 * Homework 5 Part 2
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
		System.out.println("Enter Number Of Rows: ");
		Scanner rows = new Scanner(System.in);
		int x = rows.nextInt();
		System.out.println("Enter Number Of Column: ");
		Scanner column = new Scanner(System.in);
		int y = column.nextInt();
		
		for (int i = 1; i <= x; i++){
			System.out.println();
			   for (int j = 1; j <= y; j++){
				   System.out.print(i+"x"+j+" ");
			   }

		}
	}
}