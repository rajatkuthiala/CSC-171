package my.animals;
class Penguin{
	String name;
	String type;
	int found;
	
	public Penguin(String name, String type,int found){
		this.name=name;
		this.type=type;
		this.found=found;
	}
	public void getName() {
		System.out.println(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getType() {
		System.out.println(type);
	}

	public void setType(String type) {
		this.type = type;
	}

	public void getFound() {
		System.out.println(found);
	}

	public void setFound(int found) {
		this.found = found;
	}

	public void add(int number){
		found=found+number;
	}
}
