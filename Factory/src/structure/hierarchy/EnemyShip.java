package structure.hierarchy;

public abstract class EnemyShip {

	private String name;
	private double amountDamage;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getAmountDamage() {
		return amountDamage;
	}
	
	public void setAmountDamage(double amountDamage) {
		this.amountDamage = amountDamage;
	}
	
	public void followHeroShip() {
		System.out.println(getName() + ", is following the hero");
	}
	
	public void displayEnemyShip() {
		System.out.println(getName() + ", is on the screen");
	}
	
	public void enemyShipShoots() {
		System.out.println(getName() + ", attacking dealing: " + getAmountDamage() + " of damage");
	}
}
