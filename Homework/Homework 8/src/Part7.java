/*
 * Rajat Kuthiala
 * Homework 8 Part 7
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


import java.util.Scanner;

public class Part7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter length of array: ");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int[] array = new int[x];
		int i;
		for(i=0; i<x; i++){
			System.out.print("Enter integer for array "+(i+1)+": ");
			Scanner integer = new Scanner(System.in);
			int a = integer.nextInt();
			array[i]=a;
			
		}
		for(i=0; i<array.length; i++){
			System.out.print(array[i]+" ");
			
		}
		
		if(array.length%2==0){
			int median1 = (array.length-1)/2;
			int median2 = (array.length+1)/2;
			System.out.println("\n"+ "Middle Index are "+median1+", "+median2);
			Double avg = (array[median1-1]+array[median2-1])/(2.0);
			System.out.println("Average of Middle index is: "+ avg);
			
		}
		else{
			int median= ((array.length+1)/2);
			System.out.println("\n"+ "Middle Index is "+median);
			System.out.println("Middle index value is: "+array[median-1]);
			

		}
		int minimum = array[0];
		for (int j=0; j<array.length; j++ ){
			if(minimum>array[j]){
				minimum=array[j];			
			}
		}
		System.out.println("Minimum value in array is :"+minimum);
		
		System.out.print("Enter integer to add into array: ");
		Scanner addition = new Scanner(System.in);
		int add = addition.nextInt();
		for(int k=0; k<array.length; k++){
			array[k]=array[k]+add;
		}
		System.out.print("New Array: ");
		for(i=0; i<array.length; i++){
		System.out.print(+array[i]+" ");
		}
		
		int[] array_shallow=array.clone();
		System.out.print("\n"+"First element of Copy: "+array_shallow[0]);
		System.out.print("\n"+"Last element of Copy: "+array_shallow[array_shallow.length-1]);
		
		for(i=0; i<array_shallow.length; i++){
			array[i]=array[i]+array_shallow[i];
		}
		if(array.length%2==0){
			int median1 = (array_shallow.length-1)/2;
			int median2 = (array_shallow.length+1)/2;
			Double avg = (array_shallow[median1-1]+array_shallow[median2-1])/(2.0);
			System.out.println("Average of Middle index is: "+ avg);
			
		}
		else{
			int median= ((array_shallow.length+1)/2);
			System.out.println("Middle index value is: "+array_shallow[median-1]);
		}
	}
		
	
}
