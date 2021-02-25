import java.io.IOException;
import java.util.HashMap;

public class Main {
	
	private static HashMap<String, Street> streets;
	private static HashMap<Integer, Intersection> intersections;
	private static HashMap<Integer, Car> cars;
	
	public static void main(String[] args) throws IOException {
		HashMap[] hashArray = ReadInput.read(args);
		streets = hashArray[0];
		intersections = hashArray[1];
		cars = hashArray[2];
		int i =5;
	}
	

}
