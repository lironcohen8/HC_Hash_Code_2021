import java.util.List;

public class Street {
	private String name;
	private int Incoming;
	private int Outcoming;
	private int length;
	private boolean greenLight;
	private List<Car> carQueue;
	
	public Street() {
		
	}
	
	public Street(String str, int in, int out, int l) {
		this.name = str;
		this.Incoming = in;
		this.Outcoming = out;
		this.length = l;
	}

}
