import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadInput {
	public static int D; //Duration
	public static int I; //Intersections
	public static int S; //Streets
	public static int V; //Cars
	public static int F; //Bonus points
	
	public static HashMap[] read(String[] args) throws IOException{
		String inputPath = args[0];
		HashMap<String, Street> streetHash = new HashMap<String, Street>();
		HashMap<Integer, Intersection> interHash = new HashMap<Integer, Intersection>();
		HashMap<Integer, Car> carHash = new HashMap<Integer, Car>();
		File inputFile = new File(inputPath);
		FileReader fReader = new FileReader(inputFile);
		BufferedReader bufferedReader = new BufferedReader(fReader);
		
		String line;
		int lineNumber=0;
		while ((line = bufferedReader.readLine()) != null) {
			String[] words = line.split(" ");
			if (lineNumber==0) {
				D = Integer.parseInt(words[0]);
				I = Integer.parseInt(words[1]);
				S = Integer.parseInt(words[2]);
				V = Integer.parseInt(words[3]);
				F = Integer.parseInt(words[4]);
				
				
			}
			else {
				if (lineNumber<=S) {
					String streetName = words[2];
					int incomingIntersection = Integer.parseInt(words[0]);
					int outcomingIntersection = Integer.parseInt(words[1]);
					Street tempStreet = new Street(streetName,incomingIntersection,outcomingIntersection,Integer.parseInt(words[3]));
					streetHash.put(words[2], tempStreet);
					
					
					if (!interHash.containsKey(incomingIntersection)) {
						interHash.put(incomingIntersection, new Intersection(incomingIntersection));
					} 
						
					Intersection tempIntersection = interHash.get(incomingIntersection);
					tempIntersection.outcomingStreet.add(tempStreet);
					
					if (!interHash.containsKey(outcomingIntersection)) {
						interHash.put(outcomingIntersection, new Intersection(outcomingIntersection));
					} 
						
					Intersection tempIntersection2 = interHash.get(incomingIntersection);
					tempIntersection.incomingStreet.add(tempStreet);
					
				}
				else {
					Integer size = Integer.parseInt(words[0]);
					Street[] pathList = new Street[size];
					for (int i=0;i<size;i++) {
						pathList[i] = streetHash.get(words[i+1]);
					}
					Car tempCar = new Car(pathList);
					carHash.put(lineNumber, tempCar);
				}
				
				
			}
			lineNumber++;
		}
		
		
		bufferedReader.close();
	}
	
	
	
}
