package structure.adaptee;

import java.util.Random;

public class EnemyRobot {
	
	Random generator = new Random();
	
	public void smashWithHands() {
		int attackDamage = generator.nextInt(10) + 1;
		
		System.out.println("Enemy robot dealing: " + attackDamage + " damage");
	}

	public void walkForward() {
		int speed = generator.nextInt(5) + 1;
		
		System.out.println("Enemy robot moving at: " + speed + " speed");
	}

	public void reactToHuman(String humanName) {
		 System.out.println("Enemy robot tramps on: " + humanName);
	}
}
