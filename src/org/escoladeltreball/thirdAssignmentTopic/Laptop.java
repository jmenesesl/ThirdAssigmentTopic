/**
 * 
 */
package org.escoladeltreball.thirdAssignmentTopic;

/**
 * @author iaw26068632
 *
 */
public abstract class Laptop extends DeviceImpl {

	private LaptopType type;
	
	public Laptop(String marca, String model, int speed, LaptopType type) {
		super(marca, model, speed);
		this.type = type; 
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdAssignmentTopic.Device#turnOn()
	 */
	@Override
	public void turnOn() {
	System.out.println("Turning on device");
	}


}
