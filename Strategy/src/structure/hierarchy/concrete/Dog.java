package structure.hierarchy.concrete;

import structure.hierarchy.Animal;
import structure.strategy.concrete.CantFly;

public class Dog extends Animal {

	public Dog(String name, double height, int weight) {
		super(name, height, weight);
		setSound("Bark!");
		setFlyingAbility(new CantFly());
	}
	
	public void digHole() {
		System.out.println("Digging a hole");
	}

}
