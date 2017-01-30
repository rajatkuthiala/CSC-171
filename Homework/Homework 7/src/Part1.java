/*
 * Rajat Kuthiala
 * Homework 7 Part 1
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

//Same as homework 6 part 1 but with 2 new sub class mother and father.
class Person{
	String name;
	int age;
	int phone;
	String mother;
	String father;
	
	public Person(String name, int age, int phone){
		this.name=name;
		this.age=age;
		this.phone=phone;
		
	}
	public void setMother(String mother_name) {
		this.mother= mother_name;
	}
	public void setFather(String father_name){
		this.father=father_name;
	}
	
	public String getMother(){
		return this.mother;
	}
	public String getFather(){
		return this.father;
	}
	public String getName(){
		return this.name;
	}
}

public class Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person rajat = new Person("Rajat", 20, 585);
		rajat.setMother("Neeru");
		rajat.setFather("Rajan");
		System.out.println("PARENTS: ");
		System.out.println("- "+rajat.getFather());
		System.out.println("- "+rajat.getMother());
		System.out.println("KIDS: ");
		System.out.println("- "+rajat.getName());	
	}

}
