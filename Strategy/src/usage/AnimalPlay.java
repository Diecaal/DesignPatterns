package usage;

import structure.hierarchy.Animal;
import structure.hierarchy.concrete.Bird;
import structure.hierarchy.concrete.Dog;
import structure.strategy.concrete.ItFlys;

public class AnimalPlay {

	public static void main(String[] args) {
		Animal sparky = new Dog("Sparky",50,20);
		Animal bird = new Bird("Birdy", 10,2);
		
		System.out.println("Dog: " + sparky.tryToFly());
		System.out.println("Bird: " + bird.tryToFly());
		
		sparky.setFlyingAbility(new ItFlys());
		System.out.println("Dog on steroids: " + sparky.tryToFly());
	}

}
