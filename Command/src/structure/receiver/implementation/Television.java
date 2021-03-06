package structure.receiver.implementation;

import structure.receiver.ElectronicDevice;

public class Television implements ElectronicDevice {

	private int volume = 0;
	
	@Override
	public void on() {
		System.out.println("TV is on");
	}

	@Override
	public void off() {
		System.out.println("TV is off");
	}

	@Override
	public void volumeUp() {
		volume++;
		System.out.println("TV volume: " + volume);
	}

	@Override
	public void volumenDown() {
		volume--;
		System.out.println("TV volume: " + volume);
	}

}
