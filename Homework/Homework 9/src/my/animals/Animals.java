/*
 * Rajat Kuthiala
 * Homework 9 Part 6
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */



package my.animals;

public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		my.animals.Elephant elephant  = new Elephant("BUDDY", "LAND", 3);
		my.animals.Lion lion  = new Lion("UNKNOWN", "LAND", 1);
		my.animals.Penguin penguin  = new Penguin("HERE", "WATER & ICE", 213);
		my.animals.Tigers tigers  = new Tigers("HUNTER", "LAND", 10);
		elephant.setFound(5);
		lion.setFound(4);
		penguin.add(100);
		tigers.setType("Jungle");
		penguin.getFound();
		lion.getName();
		tigers.getType();
		
		
	}

}
