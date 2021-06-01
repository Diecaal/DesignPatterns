package structure.command.implementation;

import structure.command.Command;
import structure.receiver.ElectronicDevice;

public class VolumeDown implements Command {

	ElectronicDevice device;
	
	public VolumeDown(ElectronicDevice newDevice) {
		device = newDevice;
	}
	
	@Override
	public void execute() {
		device.volumenDown();
	}

	@Override
	public void undo() {
		device.volumeUp();
	}

}
