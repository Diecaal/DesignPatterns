package structure.strategy.concrete;

import structure.strategy.Flys;

public class CantFly implements Flys {

	@Override
	public String fly() {
		return "I'm not flying high";
	}

}
