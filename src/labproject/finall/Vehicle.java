package labproject.finall;

//Parent class vehicle
public class Vehicle implements Comparable{

	//instance variables top speed and seats
	private int topSpeed;
	private int seats;
	
	//No-arg constructor
	public Vehicle () {
		this.topSpeed = 0;
		this.seats = 0;
	}
	
	//Constructor
	public Vehicle(int topSpeed, int seats) {
		this.topSpeed = topSpeed;
		this.seats = seats;
	}

	//getters and setters
	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
		
	//Create toString method
	public String toString() {
		
		return getClass() +", Top Speed: " + this.topSpeed + ", Seats: " + this.seats;
	}

	//write compareTo method for interface
	public int compareTo(Object o) {
		if(o instanceof Vehicle) {
			Vehicle other = (Vehicle) o;
			
			if(this.topSpeed > other.topSpeed) {
				return 1;
			}
			else if(this.topSpeed < other.topSpeed) {
				return -1;
			}
			else {
				return 0;
			}
		}
		return 0;
	}
	
}
