/**
 * 
 */
package org.escoladeltreball.thirdAssignmentTopic;

/**
 * @author iaw26068632
 *
 */
public final class Samsung extends Tablet {

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public Samsung(String marca, String model, int speed) {
		super(marca, model, speed);
	}
	
	/**
	 * @param model
	 * @param speed
	 */
	public Samsung(String model, int speed) {
		this("Samsung", model, speed);
	}

	@Override
	public void turnOn() {
		System.out.println("Android: Hello Samsung");
		
	}
	
	

}
