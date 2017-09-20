package zooPack;

public abstract class Animal {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
 	
	public int getAge() {
		return age;
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	protected abstract void makeNoise(); 
	
	protected abstract void eat(Food food) throws Exception;
}
