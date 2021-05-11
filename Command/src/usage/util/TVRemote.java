package usage.util;

import structure.receiver.ElectronicDevice;
import structure.receiver.implementation.Television;

public class TVRemote {
	
	public static ElectronicDevice getDevice() {
		return new Television();
	}
}
