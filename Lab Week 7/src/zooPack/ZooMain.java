package zooPack;

public class ZooMain {

	public static void main(String[] args) {
		
		Wolf greyFang = new Wolf("Grey Fang", 13);
		Parrot polly = new Parrot("Polly", 17);
		Panda po = new Panda("Po", 23);
		
		System.out.println("Name of wolf: " + greyFang.getName());
		System.out.println(greyFang.getName() + " is " + greyFang.getAge() + " years old");
		System.out.println();
		
		System.out.println("Name of parrot: " + polly.getName());
		System.out.println(polly.getName() + " is " + polly.getAge() + " years old");
		System.out.println();
		
		System.out.println("Name of Panda: " + po.getName());
		System.out.println(po.getName() + " is " + po.getAge() + " years old");
		System.out.println();
		
		System.out.println();
		
		System.out.print("Wolves say: ");
		greyFang.makeNoise();
		
		System.out.print("Parrots say: ");
		polly.makeNoise();
		
		System.out.print("Pandas say: ");
		po.makeNoise();
		
		System.out.println();
		
		Meat steak = new Meat("Steak");
		Plant bamboo = new Plant("Bamboo");
		
		try {
			greyFang.eat(steak);
			po.eat(bamboo);
			po.eat(steak);
			greyFang.eat(bamboo);
		}
		catch(Exception e) {
			System.err.println(e);
		}
		
		System.out.println();
		polly.eat(bamboo);
		polly.eat(steak);
		
	}

}
