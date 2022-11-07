

import java.util.Scanner;

public class MyApp {

	public static void main(String args[]) {
		
		Scanner myScanner = new Scanner(System.in); 
		while (true) {
			float x = (float) Math.random();
			float y = (float) Math.random();
			Vector2d vec = new Vector2d(x, y);

			System.out.println("Added a vector ");
			vec.display();

			System.out.println("Another one? ");
			String response = myScanner.nextLine();
			if (response.equals("yes") == false)
				break;
		}	
	}
}
