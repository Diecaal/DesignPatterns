package structure.adapter;

import structure.adaptee.EnemyRobot;
import structure.target.EnemyAttacker;

public class EnemyRobotAdapter implements EnemyAttacker {
	 
	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot newRobot) {
		this.theRobot = newRobot;
	}
	
	@Override
	public void fireWeapon() {
		theRobot.smashWithHands();
	}

	@Override
	public void driveForward() {
		theRobot.walkForward();
	}

	@Override
	public void assignDriver(String driver) {
		theRobot.reactToHuman(driver);
	}

}
