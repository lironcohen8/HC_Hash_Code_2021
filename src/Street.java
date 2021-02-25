
public class Street {
	private String name;
	private Intersection Incoming;
	private Intersection Outcoming;
	private int length;
	private boolean greenLight;
	
	public Street() {
		
	}
	
	public Street(String str, Intersection in, Intersection out, int l, boolean light) {
		this.name = str;
		this.Incoming = in;
		this.Outcoming = out;
		this.length = l;
	}

}
