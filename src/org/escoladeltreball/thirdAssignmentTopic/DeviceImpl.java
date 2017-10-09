/**
 * 
 */
package org.escoladeltreball.thirdAssignmentTopic;

/**
 * @author iaw26068632
 *
 */
public abstract class DeviceImpl implements Device {

	private String marca;
	private String model;
	protected int speed;

	/**
	 * @param marca
	 * @param model
	 * @param speed
	 */
	public DeviceImpl(String marca, String model, int speed) {
		this.marca = marca;
		this.model = model;
		this.speed = speed;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.thirdAssignmentTopic.Device#overClock()
	 */
	@Override
	public int overClock() throws Exception {
		return (int) (speed * 1.5);
	}

	// ************************ Getters & Setters ***************************************
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	// ************************ To String *******************************************
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("DeviceImpl [marca=%s, model=%s, speed=%s]", marca, model, speed);
	}

	
	// ************************ HashCode And Equals *******************************************
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + speed;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeviceImpl other = (DeviceImpl) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
