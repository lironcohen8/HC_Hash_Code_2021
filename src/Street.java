import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Street {
	public String name;
	public int IncomingIntersection;
	public int OutcomingIntersection;
	private int length;
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
