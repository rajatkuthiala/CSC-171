/*
 * Rajat Kuthiala
 * Homework 15 Part 4
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

public class Part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> object = Arrays.asList("hello",34,"waldo","+",100); 
		check(object,2);

	}
public static boolean check(List<Object> list,int x) {
	try{
		System.out.println(list.get(x));
	}
	catch(IndexOutOfBoundsException e){
		System.out.println("null");
	}
	return true;
}
}
