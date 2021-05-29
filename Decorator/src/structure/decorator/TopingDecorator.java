package structure.decorator;

import structure.basic.Pizza;

public class TopingDecorator implements Pizza {

	protected Pizza tempPizza;
	
	public TopingDecorator(Pizza newPizza) {
		tempPizza = newPizza;
	}
	
	@Override
	public String getDescription() {
		return tempPizza.getDescription();
	}

	@Override
	public double getCost() {
		return tempPizza.getCost();
	}

}
