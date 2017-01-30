/*
 * Rajat Kuthiala
 * Homework 6 Part 3
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

class Animals{
	String name;
	String type;
	int found;
	
	public Animals(String name, String type, int found){
		this.name=name;
		this.type=type;
		this.found=found;		
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFound() {
		return this.found;
	}

	public void setFound(int found) {
		this.found = found;
	}

	public void add(int number){
		found=found+number;
	}
}

