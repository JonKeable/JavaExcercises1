package zooPack;

public abstract class Carnivore extends Animal {

	public Carnivore(String name, int age) {
		super(name, age);
	}

	protected void eat(Food food) throws Exception {
		if(food instanceof Plant) {
			throw new Exception("Carnivores can't eat plants.");
		}
		else {
			System.out.println(this.getName() + " has eaten some " + food.getName());
		}
	}
}
