/**
 * 
 */
package org.escoladeltreball.thirdAssignmentTopic;

/**
 * @author iaw26068632
 *
 */
public final class MacBookAir extends Laptop {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public MacBookAir(String marca, String model, int speed) {
		super(marca, model, speed, LaptopType.ULTRALIGHT);
	}

	/**
	 * @param marca
	 * @param model
	 */
	public MacBookAir(String marca, String model) {
		this(marca, model, 367);
	}
	
	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdAssignmentTopic.Device#turnOff()
	 */
	@Override
	public void turnOff() {
		System.out.println("Clossing Mac Smoothly");

	}

}
