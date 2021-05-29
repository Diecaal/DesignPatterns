package structure.decorator.concrete;

import structure.basic.Pizza;
import structure.decorator.TopingDecorator;

public class TomatoSauce extends TopingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding tomato sauce...");
	}
	
	public String getDescription() {
		return tempPizza.getDescription() + ", Tomato Sauce";
	}
	
	public double getCost() {
		return tempPizza.getCost() + 0.30;
	}
	
}
