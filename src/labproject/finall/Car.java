package labproject.finall;

public class Car extends Vehicle{

	//instance variables of Drive Train and Doors
	private String driveTrain;
	private int doors;
	
	//No-arg constructor
	public Car() {
		super();
		this.driveTrain = "";
		this.doors = 0;
	}
	
	//Constructor
	public Car(int topSpeed, int seats, String driveTrain, int doors) {
		super(topSpeed, seats);
		this.driveTrain = driveTrain;
		this.doors = doors;
	}

	//getters and setters
	public String getDriveTrain() {
		return driveTrain;
	}

	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	//Create toString method
	public String toString() {
		String s = super.toString();
		
		return s + ", Drive Train: " + this.driveTrain + ", Doors: " + this.doors;
	}
}
