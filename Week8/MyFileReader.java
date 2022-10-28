
import java.io.File;
import java.util.Scanner; // Among the several classes available for high-level input, Scanner is probably the easiest
import java.io.IOException;
import java.util.StringTokenizer;

public class MyFileReader {

		private File file;
		private Scanner sc; // may throw an Exception


		public boolean open(String fname) {	
			try {
				file = new File(fname);
				sc = new Scanner(file);
			} catch (IOException ex) { // IO Error
				ex.printStackTrace();
				return false;
				}

			return true;
			}


				// not complete
		public void process() {
			/*
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

				// calculate total value per line
				// store the total values in a different file
				*/
			}

}
