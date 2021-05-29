package structure.concrete;

import structure.Hoagie;

public class ItalianHoagie extends Hoagie {

	String[] meatUsed = {"Salami", "Pepperoni", "Capicola Ham"};
	String[] cheeseUsed = {"Provolone"};
	String[] vegetablesUsed = {"Lettuce","Tomatoes","Onions","Seet peppers"};
	String[] condimentsUsed = {"Oil","Vinegar"};
	
	@Override
	public void addMeat() {
		System.out.print("Adding the meat: ");
		for(String meat : meatUsed) {
			System.out.print(meat + " ");
		}
	}

	@Override
	public void addCheese() {
		System.out.print("Adding the cheese: ");
		for(String cheese : cheeseUsed) {
			System.out.print(cheese + " ");
		}
	}

	@Override
	public void addVegetables() {
		System.out.print("Adding the vegetables: ");
		for(String vegetable : vegetablesUsed) {
			System.out.print(vegetable + " ");
		}
	}

	@Override
	public void addCondiments() {
		System.out.print("Adding the condiments: ");
		for(String condiment : condimentsUsed) {
			System.out.print(condiment + " ");
		}
	}

}
