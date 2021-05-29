package structure.state.concrete;

import structure.context.ATMMachine;
import structure.state.ATMState;

public class HasCard implements ATMState {

	ATMMachine atmMachine;
	
	public HasCard(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}
	
	@Override
	public void insertCard() {
		System.out.println("Can not enter more than one card at a time");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card ejected");
		atmMachine.setAtmCurrentState( atmMachine.getNoCardState() );
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("PIN entered...");
		if(pinEntered == 1234) {
			System.out.println("Correct PIN");
			atmMachine.setCorrectPinEntered( true );
			atmMachine.setAtmCurrentState( atmMachine.getHasPin() );
		} else {
			System.out.println("Wrong PIN");
			atmMachine.setCorrectPinEntered( false );
			System.out.println("Card will be ejected");
			atmMachine.setAtmCurrentState( atmMachine.getNoCardState() );
		}
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		System.out.println("Enter PIN first");
	}

}
