package structure.hierarchy.concrete;

import structure.hierarchy.Animal;
import structure.strategy.concrete.ItFlys;

public class Bird extends Animal {

	public Bird(String name, double height, int weight) {
		super(name, height, weight);
		setSound("Tweet!");
		setFlyingAbility(new ItFlys());
	}

}
