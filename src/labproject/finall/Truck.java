package labproject.finall;

public class Truck extends Vehicle{

	//Instance variables for Payload Capacity and Tow Capacity 
	private int payloadCapacity;
	private int towCapacity;
	
	//No-arg Constructor
	public Truck() {
		super();
		this.payloadCapacity = 0;
		this.towCapacity = 0;
	}
	
	//Constructor
	public Truck(int topSpeed, int seats, int payloadCapacity, int towCapacity) {
		super(topSpeed, seats);
		this.payloadCapacity = payloadCapacity;
		this.towCapacity = towCapacity;
	}

	//getters and setters
	public int getPayloadCapacity() {
		return payloadCapacity;
	}

	public void setPayloadCapacity(int payloadCapacity) {
		this.payloadCapacity = payloadCapacity;
	}

	public int getTowCapacity() {
		return towCapacity;
	}

	public void setTowCapacity(int towCapacity) {
		this.towCapacity = towCapacity;
	}
	
	//create toString method
	
	public String toString() {
		String s = super.toString();
		return s + ", Payload Capacity: " + this.payloadCapacity + ", Tow Capacity: " + this.towCapacity;
	}
}
