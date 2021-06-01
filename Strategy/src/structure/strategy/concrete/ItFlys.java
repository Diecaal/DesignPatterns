package structure.strategy.concrete;

import structure.strategy.Flys;

public class ItFlys implements Flys {

	@Override
	public String fly() {
		return "I'm flying high";
	}

}
