package zooPack;

public class Parrot extends Omnivore {

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
	
	
	public Parrot(String name, int age) {
		super(name, age);
	}
	
	
	protected void makeNoise() {
		System.out.println("Squark!");
	}
}
