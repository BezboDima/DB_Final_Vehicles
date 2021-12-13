package labproject.finall;

import java.util.Comparator;

public class CompareByTow implements Comparator<Truck>{

	public int compare(Truck o1, Truck o2) {
		if (o1.getTowCapacity() < o2.getTowCapacity()) {
			return -1;
		}
		else if (o1.getTowCapacity() > o2.getTowCapacity()) {
			return 1;
		}
		else {
			return 0;
		}
		
	}

}
