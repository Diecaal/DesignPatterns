package structure.basic;

public class PlainPizza implements Pizza {

	public PlainPizza() {
		System.out.println("Starting pizza making...");
	}
	
	@Override
	public String getDescription() {
		return "Basic Pizza";
	}

	@Override
	public double getCost() {
		return 4.00;
	}

}
