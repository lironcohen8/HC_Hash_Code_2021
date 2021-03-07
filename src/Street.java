import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Street {
	public String name;
	public int IncomingIntersection;
	public int OutcomingIntersection;
	public int length;
	public int outTotalLength;
	public int startingAmount;
	private boolean greenLight;
	public ArrayDeque<Car> carQueue = new ArrayDeque<Car>();
	public int priorityValue;
	
	public Street() {
		
	}
	
	public Street(String str, int in, int out, int l) {
		this.name = str;
		this.IncomingIntersection = in;
		this.OutcomingIntersection = out;
		this.length = l;
	}

}
