package zooPack;

public abstract class Omnivore extends Animal {
	
	public Omnivore(String name, int age) {
		super(name, age);
	}
	
	protected void eat(Food food) {
		System.out.println(this.getName() + " has eaten some " + food.getName());
	}
}
