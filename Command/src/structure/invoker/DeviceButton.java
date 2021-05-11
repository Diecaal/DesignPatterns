package structure.invoker;

import structure.command.Command;

public class DeviceButton {
	private Command command;
	
	public DeviceButton(Command newCommand) {
		command = newCommand;
	}
	
	public void press() {
		command.execute();
	}
}
