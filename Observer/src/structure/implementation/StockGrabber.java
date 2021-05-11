package structure.implementation;

import java.util.ArrayList;
import java.util.List;

import structure.Observer;
import structure.Subject;

public class StockGrabber implements Subject {
	
	/**
	 * Store the list of observers to be notified
	 */
	private List<Observer> observers;
	
	// In our case this simulate the STATE of the subject
	private double IBMPrice;
	private double AAPLPrice;
	private double GOOGLPrice;
	
	public StockGrabber() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void attach(Observer o) {
		System.out.println("Adding new observer");
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		System.out.println("Removing an observer");
		observers.remove(o);
	}

	/**
	 * Method trigered by methods that will change the state of this object
	 */
	@Override
	public void notifyObservers() {
		for(Observer o : observers)
			o.update(IBMPrice, AAPLPrice, GOOGLPrice);
	}

	/**
	 * Triggering method
	 * @param iBMPrice
	 */
	public void setIBMPrice(double iBMPrice) {
		IBMPrice = iBMPrice;
		
		this.notifyObservers();
	}

	/**
	 * Triggering method
	 * @param aAPLPrice
	 */
	public void setAAPLPrice(double aAPLPrice) {
		AAPLPrice = aAPLPrice;
		
		this.notifyObservers();
	}

	/**
	 * Triggering method
	 * @param gOOGLPrice
	 */
	public void setGOOGPrice(double gOOGLPrice) {
		GOOGLPrice = gOOGLPrice;
		
		this.notifyObservers();
	}
	
	

}
