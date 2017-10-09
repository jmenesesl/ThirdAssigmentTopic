/**
 * 
 */
package org.escoladeltreball.thirdAssignmentTopic;

/**
 * @author iaw26068632
 *
 */
public abstract class Tablet extends DeviceImpl {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Tablet(String marca, String model, int speed) {
		super(marca, model, speed);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdAssignmentTopic.Device#turnOn()
	 */
	@Override
	public abstract void turnOn();
	
	@Override
	public void turnOff() {
		System.out.println("Power Off");

	}

}
