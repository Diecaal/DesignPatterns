package structure.command.implementation;

import structure.command.Command;
import structure.receiver.ElectronicDevice;

public class VolumeUp implements Command {

	ElectronicDevice device;
	
	public VolumeUp(ElectronicDevice newDevice) {
		device = newDevice;
	}
	
	@Override
	public void execute() {
		device.volumeUp();
	}

	@Override
	public void undo() {
		device.volumenDown();
	}

}