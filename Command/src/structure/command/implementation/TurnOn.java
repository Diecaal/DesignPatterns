package structure.command.implementation;

import structure.command.Command;
import structure.receiver.ElectronicDevice;

public class TurnOn implements Command {

	ElectronicDevice device;
	
	public TurnOn(ElectronicDevice newDevice) {
		device = newDevice;
	}
	
	@Override
	public void execute() {
		device.on();
	}

}
