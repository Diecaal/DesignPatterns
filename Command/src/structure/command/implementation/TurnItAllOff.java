package structure.command.implementation;

import java.util.List;

import structure.command.Command;
import structure.receiver.ElectronicDevice;

public class TurnItAllOff implements Command {
	
	List<ElectronicDevice> devices;
	
	public TurnItAllOff(List<ElectronicDevice> newDevices) {
		devices = newDevices;
	}
	
	@Override
	public void execute() {
		for(ElectronicDevice device : devices)
			device.off();
	}

	@Override
	public void undo() {
		for(ElectronicDevice device : devices)
			device.on();
	}

}
