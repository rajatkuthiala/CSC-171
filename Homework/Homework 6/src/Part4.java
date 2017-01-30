/*
 * Rajat Kuthiala
 * Homework 6 Part 4
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

class Baseball{
	int games;
	int at_bats;
	int hits;
	int runs;
	public Baseball(int games, int at_bats, int hits, int runs){
		this.games=games;
		this.at_bats=at_bats;
		this.hits=hits;
		this.runs=runs;
	}
	public int getBatavg(){
		return (this.hits/this.at_bats);
	}
	public int getRunavg(){
		return(this.runs/this.games);
	}
}
public class Part4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baseball person1 = new Baseball(4, 2, 31, 156);
		System.out.println("Batting Average of Person 1 is:  "+person1.getBatavg());
		System.out.println("Run Average of Person 1 is:  "+person1.getRunavg());
	}

}
