import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {
	
	private int id;
	public Set<Street> incomingStreet = new HashSet<Street>();
	public Set<Street> outcomingStreet = new HashSet<Street>();
	
	public Intersection() {
		
	}
	
	public Intersection(int id) {
		this.id = id;
	}
	

}
