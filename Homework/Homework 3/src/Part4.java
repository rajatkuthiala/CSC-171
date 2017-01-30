/*
 * Rajat Kuthiala
 * Homework 3 Part 4
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


import java.util.Scanner;

public class Part4{

     public static void main(String []args){
        System.out.println("Press 1 for Female or 2 for Male: ");
        Scanner gender = new Scanner(System.in);
        int g = gender.nextInt();
        if (g==1){
            System.out.println("Do you Play Hockey (1 for yes 2 for no)");
            Scanner game = new Scanner(System.in);
            int h = game.nextInt();
            
            if (h==1){
                System.out.println("Awesome!"); }  
            else{
                System.out.println("You Should Try It Some Day.");
            
            }
        }
        else if (g==2){
            System.out.println("How Many Times You ate pizza last week? ");
            Scanner pizza = new Scanner(System.in);
            int p = pizza.nextInt();
            
            if (p>5){
                System.out.println("You Need To Eat Better!!"); }  
            else{
                System.out.println("OK");}
        }
     }   
}