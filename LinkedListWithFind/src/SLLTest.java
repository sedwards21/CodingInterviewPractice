
public class SLLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLList<Dog> list = new SLList<Dog>();
		
		list.add(new Dog("Fido", "Spaniel", 25));
		list.add(new Dog("Hooch", "Mastiff", 25));
		list.add(new Dog("Shark", "Boxer", 25));
		list.add(new Dog("Lisa", "German Shepard", 25));
		list.add(new Dog("Tom", "Spaniel", 25));
		list.add(new Dog("Fido", "Cocker Spaniel", 25));
		
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		Dog fido = new Dog("Fido");
		int index = list.find(fido);
		System.out.print("Fido" + index);
		
		Dog rover = new Dog("Precious ");
		index = list.find(rover);
		System.out.println("Rover "+index);
	}

}
