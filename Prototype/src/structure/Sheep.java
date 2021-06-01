package structure;

public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Sheep has been made");
	}
	
	@Override
	public Animal makeCopy() {
		System.out.println("Sheep is being cloned");
		
		Sheep sheepObject = null;
		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return sheepObject;
	}
	
	@Override
	public String toString() {
		return "Here you are watching a sheep";
	}

}
