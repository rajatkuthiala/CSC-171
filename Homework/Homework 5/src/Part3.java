/*
 * Rajat Kuthiala
 * Homework 5 Part 3
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
		int x, y, z, g;
		g=1;
		while (g==1){
			System.out.print("Enter First Number: ");
			Scanner first = new Scanner(System.in);
			x = first.nextInt();
			System.out.print("Enter Second Number: ");
			Scanner second = new Scanner(System.in);
			y = second.nextInt();
			System.out.print("Enter Third Number: ");
			Scanner third = new Scanner(System.in);
			z = third.nextInt();
			if (x!=0 && y!=0 && z!=0){
				while(x+z<y){
					x=x+z;
					System.out.println(x);}
				
			}
			else{
				System.out.println("Exitting");
				g=0;
			}
			
		}
		
			
			
			
		
	}

}
