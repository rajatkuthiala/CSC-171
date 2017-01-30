import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


class PersonList{
	
	List<String> PersonList = Collections.<String>emptyList();
}


public class Person extends PersonList{
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person raj = new Person("Rajat", 20);
		Person bob = new Person("Bobbie", 18);
		Person umang = new Person("Umang", 20);
		
	}

}
