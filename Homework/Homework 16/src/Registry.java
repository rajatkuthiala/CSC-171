import java.util.ArrayList;
import java.util.List;

public class Registry<Z,T> {
	private Z owner;
	private List<T> elements = new ArrayList<T>();
	
	public Registry(Z name){
		this.owner=name;
		
	}
	public void add(T num){
		this.elements.add(num);
	}
	public T get(){
		return (T) elements;
	}
	public Z getName(){
		return this.owner;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Registry<String,Integer> Raj = new Registry("Rajat"); 
	System.out.println(Raj.getName());
	Raj.add(100);
	System.out.println(Raj.get());
	
	
	}

}
