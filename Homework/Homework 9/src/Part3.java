/*
 * Rajat Kuthiala
 * Homework 9 Part 3
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */


class triangle{
	int rows;
	public triangle(int n){
		this.rows=n;
	}
	public void TriangleTable(){
		for(int i=0; i<this.rows; i++){
			System.out.println();
			for(int j=i; j>-1; j-- ){
				System.out.print(j+" ");
			}
		}
		System.out.println();
	}
}

public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle Triangle1 = new triangle(1);
		Triangle1.TriangleTable();
		triangle Triangle2 = new triangle(2);
		Triangle2.TriangleTable();
		triangle Triangle3 = new triangle(3);
		Triangle3.TriangleTable();
		triangle Triangle4 = new triangle(4);
		Triangle4.TriangleTable();
		triangle Triangle5 = new triangle(5);
		Triangle5.TriangleTable();
		triangle Triangle6 = new triangle(6);
		Triangle6.TriangleTable();
		triangle Triangle7 = new triangle(7);
		Triangle7.TriangleTable();
		triangle Triangle8 = new triangle(8);
		Triangle8.TriangleTable();
		triangle Triangle9 = new triangle(9);
		Triangle9.TriangleTable();
		triangle Triangle10 = new triangle(10);
		Triangle10.TriangleTable();
	}

}
