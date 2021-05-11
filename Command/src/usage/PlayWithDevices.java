package usage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import structure.command.Command;
import structure.command.implementation.TurnItAllOff;
import structure.command.implementation.TurnOn;
import structure.command.implementation.VolumeDown;
import structure.command.implementation.VolumeUp;
import structure.invoker.DeviceButton;
import structure.receiver.ElectronicDevice;
import structure.receiver.implementation.Radio;
import usage.util.TVRemote;

public class PlayWithDevices {
	public static void main(String[] args) {
		LinkedList<Command> commandsList = new LinkedList<Command>();
		
		/* Device used */
		List<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
		ElectronicDevice television = TVRemote.getDevice(); devices.add(television);
		ElectronicDevice radio = new Radio(); devices.add(radio);
		
		/* Turning ON */
		TurnOn onCommand = new TurnOn(television); //Create ON COMMAND passing our device (TV)
		DeviceButton onPressed = new DeviceButton(onCommand); //Create INVOKER DeviceButton passing our command (ON) 
		onPressed.press(); //Call execute action on COMMAND (->Device)
		onCommand = new TurnOn(radio);
		onPressed = new DeviceButton(onCommand);
		onPressed.press();
		
		/* Volumen UP */
		VolumeUp upCommand = new VolumeUp(television);
		onPressed = new DeviceButton(upCommand);
		onPressed.press(); onPressed.press(); onPressed.press(); onPressed.press();
		upCommand = new VolumeUp(radio);
		onPressed = new DeviceButton(upCommand);
		onPressed.press(); onPressed.press(); 
		
		/* Volumen DOWN */
		VolumeDown downCommand = new VolumeDown(television);
		onPressed = new DeviceButton(downCommand);
		onPressed.press(); onPressed.press(); 
		downCommand  = new VolumeDown(radio);
		onPressed = new DeviceButton(downCommand);
		onPressed.press();
		
		/* Turning OFF */
		TurnItAllOff turnAllOff = new TurnItAllOff(devices);
		onPressed = new DeviceButton(turnAllOff);
		onPressed.press();
		
		/* Undo every command done? */
		// LinkedList -> addFirst() x eachCommand
		// linkedList.forEach( command.undo() )
	}
}
