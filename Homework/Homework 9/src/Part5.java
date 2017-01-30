/*
 * Rajat Kuthiala
 * Homework 9 Part 5
 * TR 11:05AM-12:20PM
 * TA: Becky Everson
 * 
 * I affirm that I have not given 
 * or received any unauthorized help 
 * on this assignment, and that this 
 * work is my own.
 */

class planets{
	double x;
	public planets(double x){
		this.x=x;
	}
	
	public void Mercury(){
		System.out.println(0.06*(1/x));;
	}
	public void Venus(){
		System.out.println(0.82*(1/x));;
	}
	public void Earth(){
		System.out.println(1.0*(1/x));;
	}
	public void Mars(){
		System.out.println(0.11*(1/x));;
	}
	public void Jupiter(){
		System.out.println(317.8*(1/x));;
	}
	public void Satrun(){
		System.out.println(95.2*(1/x));;
	}
	public void Uranus(){
		System.out.println(14.6*(1/x));;
	}
	public void Neptune(){
		System.out.println(17.2*(1/x));;
	}
	
}

