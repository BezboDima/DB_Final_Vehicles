package labproject.finall;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class VehicleTester {

	public static void main(String[] args) throws FileNotFoundException {
		
		//create 3 cars
		Car c1 = new Car(120, 5, "4WD",4);
		Car c2 = new Car(90, 4, "FWD", 2);
		Car c3 = new Car(180, 4, "RWD", 2);
		
		//create 3 Trucks
		Truck t1 = new Truck(100, 5, 1000, 5000);
		Truck t2 = new Truck(95, 5, 1500, 4000);
		Truck t3 = new Truck(120, 5, 2000, 6000);
		
		//create 2 Motorcycles
		Motorcycle m1 = new Motorcycle(220, 1, false);
		Motorcycle m2 = new Motorcycle(130, 2, true);
		
		//create array list and add values into it
		ArrayList<Vehicle> vehicleList = new ArrayList<>();
		
		vehicleList.add(c1);
		vehicleList.add(c2);
		vehicleList.add(c3);
		vehicleList.add(t1);
		vehicleList.add(t2);
		vehicleList.add(t3);
		vehicleList.add(m1);
		vehicleList.add(m2);
		
		//create array list of trucks and add values
		ArrayList<Truck> trucksList = new ArrayList<>();
		
		trucksList.add(t1);
		trucksList.add(t2);
		trucksList.add(t3);
		
		//create output file
		PrintWriter output = new  PrintWriter("C:\\Users\\Dmitry\\eclipse-workspace\\CS176_FINAL\\src\\labproject\\finall\\output.txt");
		
		//go through the list writing vehicles into the output
		for (Vehicle veh : vehicleList) {
			output.println(veh);
		}
		output.println("=======================================================================================================");
	
		//sort vehicle list and go through it again
		Collections.sort(vehicleList);
		
		for (Vehicle veh : vehicleList) {
			output.println(veh);
		}
		output.println("=======================================================================================================");
		
		//write list of trucks
		for (Truck t : trucksList) {
			output.println(t);
		}
		output.println("=======================================================================================================");
		
		//sort truck list by PayLoad and print it again
		trucksList.sort(new CompareByPayLoad());
		
		for (Truck t : trucksList) {
			output.println(t);
		}
		output.println("=======================================================================================================");
		
		//sort truck list by Tow and print it again
		trucksList.sort(new CompareByTow());
		
		for (Truck t : trucksList) {
			output.println(t);
		}
		output.println("=======================================================================================================");
		
		
		output.close();
	}

}
