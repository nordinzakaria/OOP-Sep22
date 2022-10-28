
import java.io.File;
import java.util.Scanner; // Among the several classes available for high-level input, Scanner is probably the easiest
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadFromFile {

	public static void main(String[] args) {

		File file = new File("test.txt");

		try {
			Scanner sc = new Scanner(file); // may throw an Exception

			while (sc.hasNextLine()) {  // hasNextLine return boolean	
			       String line = sc.nextLine();
			       System.out.println("Read " + line);

				// Split the string into tokens
				//StringTokenizer tokenizer = new StringTokenizer(line);
				String[] tokens = line.split(" ");
				
				int tokenVal[] = new int[tokens.length];		
				// convert the string tokens to Integer
				for (int i=0; i<tokens.length; i++) {
				     tokenVal[i] = Integer.parseInt(tokens[i]);
				     System.out.println("Converted "+ tokenVal[i]);
				}
			}


		} catch (IOException ex) { // IO Error
			ex.printStackTrace();
			System.exit(1);
			}

	}
}
