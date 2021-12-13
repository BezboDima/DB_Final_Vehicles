package labproject.finall;

import java.util.Comparator;

public class CompareByPayLoad implements Comparator<Truck> {

	@Override
	public int compare(Truck o1, Truck o2) {
		if (o1.getPayloadCapacity() < o2.getPayloadCapacity()) {
			return -1;
		}
		else if (o1.getPayloadCapacity() > o1.getPayloadCapacity()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
