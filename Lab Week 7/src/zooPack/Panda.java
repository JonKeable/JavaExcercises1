package zooPack;

public class Panda extends Herbivore{

	public Panda(String name, int age) {
		super(name, age);
	}
	
	protected void makeNoise() {
		System.out.println("Achooo!");
	}

}
