import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {
	
	private int id;
	public Set<Street> incomingStreet = new HashSet<Street>();
	public Set<Street> outcomingStreet = new HashSet<Street>();
	public int priorityInt;
	
	public Intersection() {
		
	}
	
	public Intersection(int id) {
		this.id = id;
	}
	
	public int getPositiveStreets() {
		int counter = 0;
		for (Street street : incomingStreet) {
			if (street.priorityValue>0) {
				counter++;
			}
		}
		return counter;
	}
	

}
