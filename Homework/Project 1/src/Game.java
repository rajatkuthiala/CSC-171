/*
 * Rajat Kuthiala
 * Project 1
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


import java.util.Random;
import java.util.Scanner;


public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		// Setting while statement as valid
		int game=1;
		int score = 3;
		//Defining while statement which keeps game running 
			while (game==1){
				int retry=1;
				int random_distance = rand.nextInt((70 - 15) + 1) + 15;
		//Defining while statement which allows user to replay
				while (retry==1){
		//Check if score is not 0			
					if (score>0){
		//Remove 1 score for each try				
						score = score-1;
		//Display score and the randomly assigned distance of target.
						System.out.println("Points Left: "+score);
						System.out.println("Target Distance(m): "+random_distance);
						
		//Ask user for input speed and angle				
						System.out.print("Enter the speed(m/s): ");
						Scanner input_1 = new Scanner(System.in);
						double speed = input_1.nextDouble();
						System.out.print("Enter the angle(in degree): ");
						Scanner input_2 = new Scanner(System.in);
						double angle = input_2.nextDouble()* Math.PI/180;
		//Checking the answer by user
						double d = (Math.pow(speed, 2)* Math.sin(2*angle))/(9.8);
						System.out.println("Distance travelled by Projectile: "+ d);
		//Compare the user answer to specified conditions for scoring points
		//if it is within 1m
						if (Math.abs(random_distance-d)<1){
							System.out.println("Direct Hit");
							score = score + 5;
							System.out.println("Remaining Points: "+score);
							System.out.print("Do you want to play/quit? ");
							Scanner r = new Scanner(System.in);
							String replay = r.nextLine();
							if (replay.equalsIgnoreCase("play")){
								retry = 0;
		//Ask user if he wants to quit or play			
							}
							else if(replay.equalsIgnoreCase("quit")){
								System.out.println("*****Quitting*****");
								retry=0;
								game=0;
							}
						}
		//if the projectile is within 3m
						else if(Math.abs(random_distance-d)>=1 && Math.abs(random_distance-d)<3){
							System.out.println("Near Miss");
							score = score +1;
							System.out.println("Remaining Points: "+score);
							System.out.print("Do you want to retry/pass/quit? ");
							Scanner r = new Scanner(System.in);
							String replay = r.nextLine();
							if (replay.equalsIgnoreCase("retry")){
								retry = 1;
							}
							else if(replay.equalsIgnoreCase("pass")){
								System.out.println("*****Passing Round*****");
								retry=0;
								game=1;
							}
							else if(replay.equalsIgnoreCase("quit")){
								System.out.println("*****Quitting*****");
								retry=0;
								game=0;
							}
						}
			//If the projectile is far from 3m	
						else if(Math.abs(random_distance-d)>=3){
							System.out.println("Went far off");
							System.out.println("Remaining Points: "+score);
							System.out.print("Do you want to retry/pass/quit? ");
							Scanner r = new Scanner(System.in);
							String replay = r.nextLine();
							if (replay.equalsIgnoreCase("retry")){
								retry = 1;
							}
							else if(replay.equalsIgnoreCase("pass")){
								System.out.println("****Passing Round****");
								retry=0;
								game=1;
								
							}
							else if(replay.equalsIgnoreCase("quit")){
								System.out.println("*****Quitting*****");
								retry=0;
								game=0;
								
						}
					}
				}
					
			//If user looses all point, he gets game lost message
					else{
				System.out.println("You Loose, Game Over");	
				retry=0;
				game=0;
				break;}
				
			}
			
			
		}
		//If user quits game this will display his final Score	
		System.out.println("Your Final Score is: "+score);
		
	}

}





