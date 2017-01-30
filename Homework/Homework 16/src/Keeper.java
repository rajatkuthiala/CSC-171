
public class Keeper<T>{
	private T element;
	
	public T get(){
		return this.element;
	}
	public void set(T newelement){
		this.element=newelement;
		
	}
	public static void main(String args[]){
		Keeper<String> H = new Keeper<>();
		H.set("Hydrogen");
		System.out.println(H.get());
	}

}
