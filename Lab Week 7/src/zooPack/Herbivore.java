package zooPack;

public abstract class Herbivore extends Animal {
	
	public Herbivore(String name, int age) {
		super(name, age);
	}
	
	protected void eat(Food food) throws Exception{
		if(food instanceof Meat) {
			throw new Exception("Herbivores can't eat meat");
		}
		else{
			System.out.println(this.getName() + " has eaten some " + food.getName());
		}
	}
}
