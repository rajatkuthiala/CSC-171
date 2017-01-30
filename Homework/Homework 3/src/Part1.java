/*
 * Rajat Kuthiala
 * Homework 3 Part 1
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


import java.util.Scanner;

public class Part1{

     public static void main(String []args){
        int Secret = 96;
        
        System.out.println("Guess the value: ");
        Scanner guess = new Scanner(System.in);
        int g = guess.nextInt();
        if (g==Secret){
            System.out.println("You're a winner!");
        }
        else{
            System.out.println("You Lost");
            
        }
        
        
    }   
}