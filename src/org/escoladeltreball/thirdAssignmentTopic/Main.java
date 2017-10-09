/**
 * 
 */
package org.escoladeltreball.thirdAssignmentTopic;

/**
 * @author iaw26068632
 *
 */
public class Main {


	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		MacBookAir mac = new MacBookAir("Apple", "Air turbo", 456);
		
		MacBookAir macClone = (MacBookAir) mac.clone();
		System.out.println(mac.equals(macClone));
		System.out.println(mac == macClone);
		
		Tablet samsung = new Samsung("note10.1", 130);
		Tablet ipad = new Ipad("Ipad", "air", 145);
		
		System.out.println(samsung.overClock());
		System.out.println(ipad.overClock());
		System.out.println(ipad.equals(samsung));
	}

}
