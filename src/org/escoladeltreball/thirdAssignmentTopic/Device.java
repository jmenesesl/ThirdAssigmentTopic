/**
 * 
 */
package org.escoladeltreball.thirdAssignmentTopic;

/**
 * @author iaw26068632
 *
 */
public interface Device extends Cloneable {

	/**
	 * Turns device on
	 */
	public abstract void turnOn();

	/**
	 * Turns device off
	 */
	public abstract void turnOff();
	
	/**
	 * Causes device to over clock
	 * @return
	 * @throws Exception
	 */
	public abstract int overClock() throws Exception;
}
