package usage;

import structure.adaptee.EnemyRobot;
import structure.adapter.EnemyRobotAdapter;
import structure.target.concrete.EnemyTank;

public class TestEnemyAttackers {

	public static void main(String[] args) {
		EnemyTank leopard = new EnemyTank();
		
		EnemyRobot robot = new EnemyRobot();
		EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(robot);
		
		System.out.println("The Robot:");
		robot.reactToHuman("Human 1");
		robot.walkForward();
		robot.smashWithHands();
		
		System.out.println("The Tank:");
		leopard.assignDriver( "Soldier");
		leopard.driveForward();
		leopard.fireWeapon();
		
		System.out.println("The Robot Adapter:");
		robotAdapter.assignDriver("Soldier");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
	}

}
