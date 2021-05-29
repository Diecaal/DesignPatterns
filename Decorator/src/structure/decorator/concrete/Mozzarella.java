package structure.decorator.concrete;

import structure.basic.Pizza;
import structure.decorator.TopingDecorator;

public class Mozzarella extends TopingDecorator {

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding mozzarella...");
	}
	
	public String getDescription() {
		return tempPizza.getDescription() + ", Mozzrella";
	}
	
	public double getCost() {
		return tempPizza.getCost() + 0.70;
	}
	
}
