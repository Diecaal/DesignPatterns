package usage;

import structure.context.ATMMachine;

public class UsingATMMachine {

	public static void main(String[] args) {
		ATMMachine atm = new ATMMachine();
		
		atm.insertCard();
		atm.ejectCard();
		atm.insertCard();
		atm.requestCash(500);
		atm.insertPin(1234);
		atm.requestCash(200);
		atm.insertCard();
		
	}

}
