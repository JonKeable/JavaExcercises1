package zooPack;

public class Wolf extends Carnivore {

	//private String name;
	//private int age;
	
	/*
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	*/
	
	public Wolf(String name, int age) {
		super(name, age);
	}

	
	protected void makeNoise() {
		System.out.println("Hooooowl!");
	}
	
}
