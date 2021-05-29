package structure.decorator.concrete;

import structure.basic.Pizza;
import structure.decorator.TopingDecorator;

public class Bacon extends TopingDecorator {

	public Bacon(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding bacon...");
	}
	
	public String getDescription() {
		return tempPizza.getDescription() + ", Bacon";
	}
	
	public double getCost() {
		return tempPizza.getCost() + 1.20;
	}
	
}
