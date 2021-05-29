package structure;

public abstract class Hoagie {

	/* Just a fix for better output visualization */
	boolean newCondimentLine = false;
	
	/* Template method execution structure */
	public void makeSandwich() {
		
		initialBanner();
		cutBun();
		
		if(customerWantsMeat()) {
			addMeat();
			newCondimentLine = true;
		}
		if(customerWantsCheese()) {
			if(newCondimentLine) System.out.print("\n");
			addCheese();
			newCondimentLine = true;
		}
		if(customerWantsVegetables()) {
			if(newCondimentLine) System.out.print("\n");
			addVegetables();
			newCondimentLine = true;
		}
		if(customerWantsCondiments()) {
			if(newCondimentLine) System.out.print("\n");
			addVegetables();
			newCondimentLine = true;
		}
		
		wrapTheHoagie();
		
	}
	
	/* To be implemented by each concrete class if needed */
	public abstract void addMeat();
	public abstract void addCheese();
	public abstract void addVegetables();
	public abstract void addCondiments();
	
	/* [HOOKS] Methods to be overdine in concretes class if we do not want some of these options */
	public boolean customerWantsMeat() { return true; }
	public boolean customerWantsCheese() { return true; }
	public boolean customerWantsVegetables() { return true; }
	public boolean customerWantsCondiments() { return true; }
	
	public void initialBanner() {
		System.out.println("Starting new hoagie preparation:");
	}
	
	public void cutBun() {
		System.out.println("Cutting the bun...");
	}
	
	public void wrapTheHoagie() {
		System.out.println("\nWrapping the hoagie :)");
	}
}
