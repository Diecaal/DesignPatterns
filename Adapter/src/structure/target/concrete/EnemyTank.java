package structure.target.concrete;

import java.util.Random;

import structure.target.EnemyAttacker;

public class EnemyTank implements EnemyAttacker {
	
	Random generator = new Random();
	
	@Override
	public void fireWeapon() {
		int attackDamage = generator.nextInt(10) + 1;
		
		System.out.println("Enemy tank dealing: " + attackDamage + " damage");
	}

	@Override
	public void driveForward() {
		int speed = generator.nextInt(5) + 1;
		
		System.out.println("Enemy tank moving at: " + speed + " speed");
	}

	@Override
	public void assignDriver(String driver) {
		 System.out.println(driver + " is driving the tank");
	}

}
