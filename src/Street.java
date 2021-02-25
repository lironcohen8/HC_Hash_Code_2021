import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Street {
	private String name;
	private int Incoming;
	private int Outcoming;
	private int length;
	private boolean greenLight;
	public ArrayDeque<Car> carQueue = new ArrayDeque<Car>();
	
	public Street() {
		
	}
	
	public Street(String str, int in, int out, int l) {
		this.name = str;
		this.Incoming = in;
		this.Outcoming = out;
		this.length = l;
	}

}
