package structure.state.concrete;

import structure.context.ATMMachine;
import structure.state.ATMState;

public class HasCorrectPin implements ATMState {

	ATMMachine atmMachine;
	
	public HasCorrectPin(ATMMachine atmMachine) {
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
		System.out.println("PIN has been already entered");
	}

	@Override
	public void requestCash(int cashToWithdraw) {
		if(cashToWithdraw > atmMachine.getCashInMachine()) {
			System.out.println("ATM does not have " + cashToWithdraw + " enough to be withdrawed");
			System.out.println("Card will be ejected");
			atmMachine.setAtmCurrentState( atmMachine.getNoCardState() );
		} else {
			System.out.println("Withdrawing " + cashToWithdraw + " from account");
			atmMachine.setCashInMachine( atmMachine.getCashInMachine() - cashToWithdraw); 
			System.out.println("Card will be ejected");
			atmMachine.setAtmCurrentState( atmMachine.getNoCardState() );
		}
		
		if(atmMachine.getCashInMachine() <= 0) {
			atmMachine.setAtmCurrentState( atmMachine.getNoCashState() );
		}
	}

}
