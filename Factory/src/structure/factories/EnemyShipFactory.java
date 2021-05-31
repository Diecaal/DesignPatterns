package structure.factories;

import structure.hierarchy.*;

public class EnemyShipFactory {
	
	/*
	 * We can delete these if batteries to new sublclasses aimed just to the creation of
	 * one single concrete object per sub-factory class 
	 */
	public EnemyShip makeEnemy(String newShipType) { 
		EnemyShip newShip = null;
		if(newShipType.contentEquals("u")) {
			newShip = new UFOEnemyShip();
		} else if(newShipType.contentEquals("r")) {
			newShip = new RocketEnemyShip();
		} else if(newShipType.contentEquals("b")) {
			newShip = new BigUFOEnemyShip();
		}
		return newShip;
	}
}
