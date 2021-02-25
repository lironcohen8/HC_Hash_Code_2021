import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadInput {
	public static int D; //Duration
	public static int I; //Intersections
	public static int S; //Streets
	public static int V; //Cars
	public static int F; //Bonus points
	
	public static void main(String[] args) throws IOException{
		String inputPath = args[0];
		File inputFile = new File(inputPath);
		FileReader fReader = new FileReader(inputFile);
		BufferedReader bufferedReader = new BufferedReader(fReader);
		
		String line;
		boolean firstLine = true;
		while ((line = bufferedReader.readLine()) != null) {
			String[] words = line.split(" ");
			if (firstLine) {
				D = Integer.parseInt(words[0]);
				I = Integer.parseInt(words[1]);
				S = Integer.parseInt(words[2]);
				V = Integer.parseInt(words[3]);
				F = Integer.parseInt(words[4]);
				
				int[] intersections = new int[I];
				firstLine = false;
			}
			else {
				
			}
		}
		
		
		bufferedReader.close();
	}
	
	
	
}
