package structure.command.implementation;

import structure.command.Command;
import structure.receiver.ElectronicDevice;

public class TurnOff implements Command {

	ElectronicDevice device;
	
	public TurnOff(ElectronicDevice newDevice) {
		device = newDevice;
	}
	
	@Override
	public void execute() {
		device.off();
	}

}
