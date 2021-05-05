import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
	
	private static HashMap<String, Street> streets;
	private static HashMap<Integer, Intersection> intersections;
	private static HashMap<Integer, Car> cars;
	private static String path = "C:\\Users\\User1\\Desktop\\HashCode2021\\HashCode2021\\resource\\";
	
	public static void main(String[] args) throws IOException {
		char[] namesArray = {'a','b','c','d','e','f'};
		for (char letter : namesArray) {
		HashMap[] hashArray = ReadInput.read(path + letter + ".txt");
		streets = hashArray[0];
		intersections = hashArray[1];
		cars = hashArray[2];

		File outputFile = new File("C:\\Users\\User1\\Desktop\\HashCode2021\\HashCode2021\\resource\\" + letter + "output.txt");
		FileWriter fWriter = new FileWriter(outputFile);
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

			int totalLen = tempIntersection.getTotalOutstreetsLength();
			int maxLen = tempIntersection.longestStreet();
			if (tempIntersection.priorityInt!=0) {
				bufferedWriter.write(intersection+ "\n");
				bufferedWriter.write(tempIntersection.getPositiveStreets()+ "\n");
//				for (Street street : tempIntersection.incomingStreet) {
				for (Street street : tempIntersection.incomeOrder()) {
					if (street.priorityValue>0) {
						double lenRatio = (double) street.outTotalLength/totalLen;
						double priorityRatio = (double)street.priorityValue/tempIntersection.priorityInt;
						double periodRatio = (double) ReadInput.D/maxLen;
						int factor = (int) Math.ceil(( tempIntersection.getPositiveStreets() *  priorityRatio * lenRatio));
						factor = factor < 1? 1: factor;
//						int factor = (int) Math.ceil((tempIntersection.getPositiveStreets() *  priorityRatio));
//						int factor = (int) Math.ceil((0.5 *  priorityRatio * lenRatio * periodRatio));
//						int factor = (int) Math.ceil((priorityRatio * lenRatio
//								* tempIntersection.getPositiveStreets() * 10));
						bufferedWriter.write(street.name+ " " + factor +"\n");
					}
				}
			}
		}
		bufferedWriter.close();
	}
	
	}
}
