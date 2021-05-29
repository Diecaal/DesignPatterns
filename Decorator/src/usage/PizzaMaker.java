package usage;

import structure.basic.Pizza;
import structure.basic.PlainPizza;
import structure.decorator.concrete.Bacon;
import structure.decorator.concrete.Mozzarella;
import structure.decorator.concrete.TomatoSauce;

public class PizzaMaker {

	public static void main(String[] args) {

		Pizza pizza = new TomatoSauce( new Mozzarella( new Bacon( new PlainPizza() ) ) );
		
		System.out.println("Ingredients: " + pizza.getDescription());
		
		System.out.println("Cost: " + pizza.getCost());
	}

}
