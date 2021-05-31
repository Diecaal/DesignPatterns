package usage;

import java.util.Scanner;

import structure.factories.EnemyShipFactory;
import structure.hierarchy.EnemyShip;

public class EnemyShipTesting {

	public static void main(String[] args) {
		EnemyShipFactory factory = new EnemyShipFactory();
		EnemyShip enemyShip = null;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Select ship desired: U / R / B ");
		if(userInput.hasNext()) {
			String typeOfShip = userInput.nextLine().toLowerCase();
			enemyShip = factory.makeEnemy(typeOfShip);
		}
		
		if(enemyShip != null) {
			doStuffWithTheEnemey(enemyShip);	
		}
		
		userInput.close();
	}

	private static void doStuffWithTheEnemey(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
	}

}
