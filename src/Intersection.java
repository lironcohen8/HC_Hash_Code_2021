import java.util.List;

public class Intersection {
	
	private int id;
	private List<Street> incomingStr;
	private List<Street> outcomingStr;
	
	public Intersection() {
		
	}
	
	public Intersection(int id, List<Street> incoming, List<Street> outcoming) {
		this.id = id;
		this.incomingStr = incoming;
		this.outcomingStr = outcoming;
	}

}
