/**
 * 
 */
package org.escoladeltreball.thirdAssignmentTopic;

/**
 * @author iaw26068632
 *
 */
public final class Ipad extends Tablet {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Ipad(String marca, String model, int speed) {
		super(marca, model, speed);
	}
	/**
	 * @param model
	 * @param speed
	 */
	public Ipad(String model, int speed) {
		this("Apple", model, speed);
	}
	@Override
	public void turnOn() {
		System.out.println("Hello from Apple");
		
	}

}
