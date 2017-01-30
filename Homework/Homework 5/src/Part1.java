/*
 * Rajat Kuthiala
 * Homework 5 Part 1
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */
import java.util.Scanner;

class Part1 {
    public static void main(String[] args){
        int x= 1;
    	do {
    		System.out.println("Enter number to find square of:(Enter 0 to quit) ");
    		Scanner number = new Scanner(System.in);
        	x = number.nextInt();
        	int y = x*x;
            System.out.println("Square of " +x+" is " + y);
        } while (x != 0);
    }
}