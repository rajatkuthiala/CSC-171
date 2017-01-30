/*
 * Rajat Kuthiala
 * Project 2
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

class match{
	int minutes;
	int seconds=0;
	String toss;
	String offence;
	String defence;
	String time;
	int kickoff_distance;
	int kickoff_return;
	int x;
	int y;
	int ballPosition=35;
	public match(int time){
		this.minutes=time;
	}
	public void getTime() {
		this.secondsLeft();
		this.time=(this.minutes+":"+this.seconds);
	}
	public int secondsLeft(){
		Random rand = new Random();
		int random_time=rand.nextInt((20)+1) + 20;
		if(minutes>=1){
			if (seconds==0){
				minutes--;
				seconds=60-random_time;
			}
			else if(seconds-random_time<0){
				minutes--;
				seconds=60-Math.abs(random_time-seconds);
			}
			else{
				seconds=seconds-random_time;
			}
		}
		else{
			if (seconds-random_time<=0&&minutes==0){
				seconds=0;
			}
			else{
			seconds=seconds-random_time;
			}
		}
		return seconds;
	}
	public String toss(){
		String [] arr = {"Heads", "Tails"};
        Random random = new Random();
        int choose = random.nextInt(arr.length);
        this.toss=arr[choose];
        return arr[choose];
	}
	public int ballPosition(){
		return ballPosition;
	}
	public void kickoff_distance(){
		Random rand = new Random();
		this.kickoff_distance=rand.nextInt((40)+1) + 40;
		
	}
	public void kickoff_return(){
		Random rand = new Random();
		this.kickoff_return=rand.nextInt((20)+1) + 0;
	}
	public int actions(String a, String b){
		if(a.equalsIgnoreCase("run")&&b.equalsIgnoreCase("run")){
			if (Math.random()<=.1){
				Random rand = new Random();
				 x=rand.nextInt((6)+1) + (-3);
			}
			else{
				Random rand = new Random();
				 x=-(rand.nextInt((5)+1) + (0));
			}
		}
		if(a.equalsIgnoreCase("run")&&b.equalsIgnoreCase("pass")){
			if (Math.random()<=.05){
				Random rand = new Random();
				 x=rand.nextInt((12)+1) + (2);
			}
			else{
				Random rand = new Random();
				 x=-(rand.nextInt((5)+1) + (0));
			}
		}
		if(a.equalsIgnoreCase("run")&&b.equalsIgnoreCase("blitz")){
			if (Math.random()<=.1){
				Random rand = new Random();
				 x=rand.nextInt((10)+1) + (5);
			}
			else{
				Random rand = new Random();
				 x=-(rand.nextInt((5)+1) + (0));
			}
		}
		if(a.equalsIgnoreCase("run")&&b.equalsIgnoreCase("kick")){
			if (Math.random()<=.5){
				Random rand = new Random();
				 x=rand.nextInt((5)+1) + (this.ballPosition);
			}
			else{
				Random rand = new Random();
				 x=rand.nextInt((15)+1) + (0);
			}
		}
		if(a.equalsIgnoreCase("pass")&&b.equalsIgnoreCase("run")){
			if (Math.random()<=.8){
				Random rand = new Random();
				 x=rand.nextInt((15)+1) + (5);
			}
			else{
				Random rand = new Random();
				 x=-(rand.nextInt((10)+1) + (0));
			}
		}
		if(a.equalsIgnoreCase("pass")&&b.equalsIgnoreCase("pass")){
			if (Math.random()<=.3){
				Random rand = new Random();
				 x=rand.nextInt((7)+1) + (3);
			}
			else{
				Random rand = new Random();
				 x=-(rand.nextInt((40)+1) + (0));
			}
		}
		if(a.equalsIgnoreCase("pass")&&b.equalsIgnoreCase("blitz")){
			if (Math.random()<=.5){
				Random rand = new Random();
				 x=rand.nextInt((20)+1) + (10);
			}
			else{
				Random rand = new Random();
				 x=-(rand.nextInt((5)+1) + (10));
			}
		}
		if(a.equalsIgnoreCase("pass")&&b.equalsIgnoreCase("kick")){
			if (Math.random()>.5){
				Random rand = new Random();
				 x=rand.nextInt((10)+1) + (this.ballPosition);
			}
			else{
				Random rand = new Random();
				 x=rand.nextInt((40)+1) + (0);
			}
		}
		if(a.equalsIgnoreCase("punt")&&b.equalsIgnoreCase("run")){
			
				Random rand = new Random();
				 x=rand.nextInt((20)+1) + (40);
			
		}
		if(a.equalsIgnoreCase("punt")&&b.equalsIgnoreCase("pass")){
		
				Random rand = new Random();
				 x=rand.nextInt((20)+1) + (40);
			
		}
		if(a.equalsIgnoreCase("punt")&&b.equalsIgnoreCase("blitz")){
			if (Math.random()<=.2){
				Random rand = new Random();
				 x=rand.nextInt((10)+1) + (10);
			}
			else{
				Random rand = new Random();
				int back=rand.nextInt((10)+1) + (0);
				int gain=rand.nextInt((20)+1  +  (30));
				 x = gain-back;
			}
		}
		if(a.equalsIgnoreCase("punt")&&b.equalsIgnoreCase("kick")){
			if (Math.random()<=.05){
				Random rand = new Random();
				 x=-(rand.nextInt((10)+1) + (10));
			}
			else{
				Random rand = new Random();
				int gain=rand.nextInt((40)+1) + (0);
				int back = rand.nextInt((15)+1) + (10);
				 x = gain-back;
			}
		}
	
	if(a.equalsIgnoreCase("fg")&&b.equalsIgnoreCase("run")){
		
		Random rand = new Random();
		 x=rand.nextInt((20)+1) + (40);
	
}
	if(a.equalsIgnoreCase("fg")&&b.equalsIgnoreCase("pass")){

		Random rand = new Random();
		 x=rand.nextInt((20)+1) + (40);
	
}
if(a.equalsIgnoreCase("fg")&&b.equalsIgnoreCase("blitz")){
	if (Math.random()<=.2){
		Random rand = new Random();
		 x=rand.nextInt((10)+1) + (10);
	}
	else{
		Random rand = new Random();
		int back=rand.nextInt((10)+1) + (0);
		int gain=rand.nextInt((20)+1  +  (30));
		 x = gain-back;
	}
}
if(a.equalsIgnoreCase("fg")&&b.equalsIgnoreCase("kick")){
	if (Math.random()<=.05){
		Random rand = new Random();
		 x=-(rand.nextInt((10)+1) + (10));
	}
	else{
		Random rand = new Random();
		int gain=rand.nextInt((40)+1) + (0);
		int back = rand.nextInt((15)+1) + (10);
		x = gain-back;
	}
}

	
this.y=this.y+this.x;	
return x;	
}
}

class team{
	String name;
	int score;
	String position;
	String action;
	public team(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getScore(){
		return score;
	}
	public String position(){
		return position;
	}
	public void setPosition(String position){
		this.position=position;
	}
	
	
	
	
}
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How long are the quarters ( in minutes )?");
		Scanner input = new Scanner(System.in);
		int input_time = input.nextInt();
		match football = new match(input_time);
		System.out.println("Ok . "+football.minutes+" minute quarters .");
		
		System.out.print(" \nWhat is your team ’ s name : ");
		Scanner input_your = new Scanner(System.in);
		String input_yourteam = input_your.nextLine();
		
		System.out.print("What is my team ’ s name : ");
		Scanner input_my = new Scanner(System.in);
		String input_myteam = input_my.nextLine();
		
		team your = new team(input_yourteam);
		team my = new team(input_myteam);
		System.out.println("Ok . "+your.name+ " against "+my.name+". Here we go ...");
		
		System.out.print("\nI ’ ll let you call the coin toss . Heads or tails ? ");
		Scanner input_flip = new Scanner(System.in);
		String input_toss = input_flip.nextLine();
		football.toss();
		football.kickoff_distance();
		football.kickoff_return();
		
		if(football.toss.equalsIgnoreCase(input_toss)){
			System.out.print("It ’ s "+football.toss +" . You win . Kick or receive ? ");
			Scanner input_pos = new Scanner(System.in);
			String input_position = input_pos.nextLine();
			if(input_position.equalsIgnoreCase("kick")){
				your.setPosition("kick");
				my.setPosition("recieve");
				System.out.println(my.name+" will recieve the kickoff.");
				System.out.println(your.name+" kickoff from their own 35 - yard line .");
				System.out.println("The kick is "+football.kickoff_distance+" yards to the "+my.name+" "+(100-football.kickoff_distance-football.ballPosition));
				my.setPosition("Offencesive");
				your.setPosition("Defence");
			}
			else{
				your.setPosition("recieve");
				my.setPosition("kick");
				System.out.println(your.name+" will recieve the kickoff.");
				System.out.println(my.name+" kickoff from their own 35 - yard line .");
				System.out.println("The kick is "+football.kickoff_distance+" yards to the "+your.name+" "+(100-football.kickoff_distance-football.ballPosition));
				your.setPosition("Offencesive");
				my.setPosition("Defence");
			}
		}
		else{
			String [] arr = {"kick", "recieve"};
	        Random random_position = new Random();
	        int rand_position = random_position.nextInt(arr.length);
	        if(arr[rand_position].equalsIgnoreCase("kick")){
				your.setPosition("recieve");
				my.setPosition("kick");
				System.out.println("It ’ s "+football.toss +" . You loose . I choose "+my.position);
				System.out.println(your.name+" will recieve the kickoff.");
				System.out.println(my.name+" kickoff from their own 35 - yard line .");
				System.out.println("The kick is "+football.kickoff_distance+" yards to the "+your.name+" "+(100-football.kickoff_distance-football.ballPosition) );
				your.setPosition("Offencesive");
				my.setPosition("Defence");
	        }
			else{
				your.setPosition("kick");
				my.setPosition("recieve");
				System.out.println("It ’ s "+football.toss +" . You loose . I choose "+my.position);
				System.out.println(my.name+" will recieve the kickoff.");
				System.out.println(your.name+" kickoff from their own 35 - yard line .");
				System.out.println("The kick is "+football.kickoff_distance+" yards to the "+my.name+" "+(100-football.kickoff_distance-football.ballPosition));
				my.setPosition("Offencesive");
				your.setPosition("Defence");
			}
		}
	    System.out.println("Returned "+football.kickoff_return+" yards to the "+(100-football.kickoff_distance-football.ballPosition+football.kickoff_return));
		football.ballPosition=football.kickoff_distance-football.ballPosition+football.kickoff_return;
		
		String [] quarters = {"","First", "Second","Third","Fourth"};
		String [] choices_offence = {"run" , "pass" , "punt" , "fg"};
		String [] choices_defence = {"run" , "pass" , "blitz" , "kick"};
	    for(int i=1; i<=4; i++){
	    	football.getTime();
	    	
	    	while(football.minutes!=0 && football.seconds!=0){
	    		while(football.ballPosition>0&&football.ballPosition<100){
	    			
	    			while(your.position.equalsIgnoreCase("Offencesive") && football.ballPosition>0&&football.ballPosition<100){
	    				int downs=1;
	    				if(downs<=4||football.y<=10 && football.minutes!=0 && football.seconds!=0){
	    					if(football.y<10){
		    					System.out.println("\n"+football.time+" to go in the "+quarters[i]+" quarter.");
		    					System.out.println("Ball on the "+ your.name+" "+(100-football.ballPosition)+" - yard line ."+quarters[downs]+" down and "+(10-football.y)+" yards to go .");
		    					Random rand = new Random();
		    					int random_defence=rand.nextInt((choices_defence.length)) + 0;
		    					my.action=choices_defence[random_defence];
		    					System.out.print(your.name+" offense ( run , pass , punt , fg ):");
		    					Scanner inputoffence = new Scanner(System.in);
		    					String input_offence= inputoffence.nextLine();
		    					your.action=input_offence;
		    					football.actions(your.action, my.action);
		    					football.ballPosition=football.ballPosition-football.x;
		    					System.out.println(my.name+" play "+my.action+" defence");
		    					if(football.x>=0){
		    						System.out.println("Gain of "+football.x+" to the "+(100-football.ballPosition));
		    					}else{
		    						System.out.println("Return of "+Math.abs(football.x)+" to the "+(100-football.ballPosition));
	
		    					}
		    					downs++;
		    					football.getTime();
		    				}
	    					else if(football.y>=10){
	    						System.out.println("\nFirst down!");
	    						downs=1;
	    						football.y=0;
	    					}
	    					else{
		    					your.position="Defence";
		    					my.position="Offencesive";
		    					downs=1;
		    					football.y=0;
		    				}
	    				}
	    			}
	    			while(your.position.equalsIgnoreCase("Defence") && football.ballPosition>0&&football.ballPosition<100){
	    				int downs=1;
	    				if(downs<=4||football.y<=10 && football.minutes!=0 && football.seconds!=0){
	    					if(football.y<10){
		    					System.out.println("\n"+football.time+" to go in the "+quarters[i]+" quarter.");
		    					System.out.println("Ball on the "+ my.name+" "+football.ballPosition+" - yard line ."+quarters[downs]+" down and "+(10-football.y)+" yards to go .");
		    					Random rand = new Random();
		    					int random_offence=rand.nextInt((choices_offence.length)) + 0;
		    					my.action=choices_offence[random_offence];
		    					System.out.print(your.name+" defence ( run , pass , blitz , kick ):");
		    					Scanner inputdefence = new Scanner(System.in);
		    					String input_defence= inputdefence.nextLine();
		    					your.action=input_defence;
		    					football.actions(my.action, your.action);
		    					football.ballPosition=football.ballPosition-football.x;
		    					System.out.println(my.name+" play "+my.action+" ball");
		    					if(football.x>=0){
		    						System.out.println("Gain of "+football.x+" to the "+football.ballPosition);
		    					}else{
		    						System.out.println("Return of "+Math.abs(football.x)+" to the "+football.ballPosition);
	
		    					}
		    					downs++;
		    					football.getTime();
		    				}
	    					else if(football.y>=10){
	    						System.out.println("\nFirst down!");
	    						downs=1;
	    						football.y=0;
	    					}
	    					else{
		    					your.position="Offencesive";
		    					my.position="defence";
		    					downs=1;
		    				}
	    				}
	    			}
	    		}
	    		System.out.println("Touchback!");
	    		football.ballPosition=20;
	    		
	        }
	    }
			
		
		
	}
}

