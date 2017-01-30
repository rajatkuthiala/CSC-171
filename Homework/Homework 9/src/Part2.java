/*
 * Rajat Kuthiala
 * Homework 9 Part 2
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


class realestate{
	double area;
	int rooms;
	double bathroom;
	public realestate(double area, int rooms, double bathroom){
		this.area = area;
		this.rooms=rooms;
		this.bathroom=bathroom;
	}
	void display(){
		System.out.println("Area: "+this.area+ ", Rooms: "+this.rooms+", Bathrooms: "+this.bathroom);
	}
}
public class Part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		realestate estate1 = new realestate(2400,4,2.5);
		realestate estate2 = new realestate(1550,2,1);
		realestate estate3 = new realestate(6400,7,7);
		estate1.display();
		estate2.display();
		estate3.display();

		

	}

}
