/**
 * 
 */
package org.escoladeltreball.thirdAssignmentTopic;

/**
 * @author iaw26068632
 *
 */
public class WindowsBasedLaptop extends Laptop {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public WindowsBasedLaptop(String marca, String model, int speed) {
		super(marca, model, speed, LaptopType.HEAVY);
	}
	
	/**
	 * @param marca
	 * @param model
	 */
	public WindowsBasedLaptop(String marca, String model) {
		this(marca, model, 399);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdAssignmentTopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("Clickint inicio to turn off");
	}

}
