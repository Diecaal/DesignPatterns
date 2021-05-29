package structure.state.concrete;

import structure.context.ATMMachine;
import structure.state.ATMState;

public class OutOfMoney implements ATMState {

	ATMMachine atmMachine;
	
	public OutOfMoney(ATMMachine atmMachine) {
		this.atmMachine = atmMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("There is not money in this ATM");
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
