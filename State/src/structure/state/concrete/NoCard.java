package structure.state.concrete;

import structure.context.ATMMachine;
import structure.state.ATMState;

public class NoCard implements ATMState {

	ATMMachine atmMachine;
	
	public NoCard(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Card has been inserted");
		atmMachine.setAtmCurrentState( atmMachine.getYesCardState() );
	}

	@Override
	public void ejectCard() {
		System.out.println("No card entered to be ejected");
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("No card entered to insert a PIN");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("No card entered to request money");
	}

}
