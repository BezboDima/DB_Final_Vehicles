package labproject.finall;

public class Motorcycle extends Vehicle {

	//instance variable for Windshield
	private boolean hasWindshield;
	
	//no-arg constructor
	public Motorcycle() {
		super();
		this.hasWindshield = false;
	}
	
	//constructor
	public Motorcycle(int topSpeed, int seats, boolean hasWindshield) {
		super(topSpeed,seats);
		this.hasWindshield = hasWindshield;
	}
	
	//generate getters and setters
	public boolean isHasWindshield() {
		return hasWindshield;
	}

	public void setHasWindshield(boolean hasWindshield) {
		this.hasWindshield = hasWindshield;
	}
	
	//create toString method
	public String toString() {
		String s = super.toString();
		return s + ", Has Windshield? " + this.hasWindshield;
	}
}
