import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Main {
	
	private static HashMap<String, Street> streets;
	private static HashMap<Integer, Intersection> intersections;
	private static HashMap<Integer, Car> cars;
	private static String path = "C:\\Users\\user\\HashCode2021\\resource\\f.txt";
	
	public static void main(String[] args) throws IOException {
		HashMap[] hashArray = ReadInput.read(path);
		streets = hashArray[0];
		intersections = hashArray[1];
		cars = hashArray[2];

		int i=5;
		File inputFile = new File("C:\\Users\\user\\HashCode2021\\resource\\output6.txt");
		FileWriter fWriter = new FileWriter(inputFile);
		BufferedWriter bufferedWriter = new BufferedWriter(fWriter);
		
		int intersectionCounter=0;
		for (Integer intersection : intersections.keySet()) {
			if (intersections.get(intersection).priorityInt!=0) {
				intersectionCounter++;
			}
		}
		
		bufferedWriter.write(intersectionCounter+ "\n");
		for (Integer intersection : intersections.keySet()) {
			Intersection tempIntersection = intersections.get(intersection);
			if (tempIntersection.priorityInt!=0) {
				bufferedWriter.write(intersection+ "\n");
				bufferedWriter.write(tempIntersection.getPositiveStreets()+ "\n");
				for (Street street : tempIntersection.incomingStreet) {
					if (street.priorityValue>0) {
						bufferedWriter.write(street.name+ " " +street.priorityValue +"\n");
					}
				}
			}
		}
		bufferedWriter.close();
	}
	

}
