package structure.context;

import structure.state.ATMState;
import structure.state.concrete.HasCard;
import structure.state.concrete.HasCorrectPin;
import structure.state.concrete.NoCard;
import structure.state.concrete.OutOfMoney;

public class ATMMachine {
	
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	ATMState atmOutOfMoney;
	
	ATMState atmCurrentState;
	
	int cashInMachine = 200;
	boolean correctPinEntered = false;
	
	public ATMMachine() {
		hasCard = new HasCard(this);
		noCard = new NoCard(this);
		hasCorrectPin = new HasCorrectPin(this);
		atmOutOfMoney = new OutOfMoney(this);
	
		atmCurrentState = noCard;
		
		if(cashInMachine < 0) {
			atmCurrentState = atmOutOfMoney;
		}
	}

	public void setAtmCurrentState(ATMState atmCurrentState) {
		this.atmCurrentState = atmCurrentState;
	}

	public void setCashInMachine(int cashInMachine) {
		this.cashInMachine = cashInMachine;
	}
	
	public int getCashInMachine() {
		return cashInMachine;
	}

	public void setCorrectPinEntered(boolean correctPinEntered) {
		this.correctPinEntered = correctPinEntered;
	}

	public void insertCard() {
		atmCurrentState.insertCard();
	}
	
	public void ejectCard() {
		atmCurrentState.ejectCard();
	}
	
	public void requestCash(int cash) {
		atmCurrentState.requestCash(cash);
	}
	
	public void insertPin(int pin) {
		atmCurrentState.insertPin(pin);
	}
	
	public ATMState getYesCardState() { return hasCard; }
	public ATMState getNoCardState() { return noCard; }
	public ATMState getHasPin() { return hasCorrectPin; }
	public ATMState getNoCashState() { return atmOutOfMoney; }
}
