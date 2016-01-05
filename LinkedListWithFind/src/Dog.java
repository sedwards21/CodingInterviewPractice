
public class Dog implements Comparable {
	private String name;
	private String breed;
	private int weight;
	
	public Dog(String name ){
		super();
		this.name = name;
	}
	
	public Dog(String name, String breed, int weight){
		super();
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}
	
	@Override
	public String toString(){
		return "Dog [name="+name+",breed="+breed+"weight="+weight+"]"; 
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return name.compareTo( ((Dog) o).name);
	}	
}


