package usage;

import structure.CloneFactory;
import structure.Sheep;

public class TestCloning {

	public static void main(String[] args) {
		
		CloneFactory animalMaker = new CloneFactory();
		
		Sheep sally = new Sheep();
		Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
		
		System.out.println(sally);
		System.out.println(clonedSheep);
		
		System.out.println("Sally HashCode: " + sally.hashCode());
		System.out.println("Cloned Sally HashCode: " + clonedSheep.hashCode());
	}

}
