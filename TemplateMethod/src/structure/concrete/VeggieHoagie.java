package structure.concrete;

import structure.Hoagie;

public class VeggieHoagie extends Hoagie {

	String[] vegetablesUsed = {"Lettuce","Tomatoes","Onions","Seet peppers"};
	String[] condimentsUsed = {"Oil","Vinegar"};
	
	/* No cheese or meat desired in veggie */
	@Override
	public boolean customerWantsMeat() { return false; }
	@Override
	public boolean customerWantsCheese() { return false; }
	
	@Override
	public void addMeat() {
		
	}

	@Override
	public void addCheese() {
		
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
