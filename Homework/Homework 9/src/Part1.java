/*
 * Rajat Kuthiala
 * Homework 9 Part 1
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


class fish{
	public String type;
    public Double weight;

	public void setType(String type){
		this.type=type;
	}
	public void setWeight(Double weight){
		this.weight=weight;
	}
	public void getDetails(){
		System.out.println("Type Of Fish: "+this.type+ "\n" + "Weight of Fish(lbs): "+this.weight);
	}
}
public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fish trout = new fish();
		trout.setType("Trout");
		trout.setWeight(30.0);
		trout.getDetails();
		

	}

}
