

import java.util.Scanner;
import java.util.ArrayList;

public class MyApp {

	public static void main(String args[]) {
		Vector2d vecArray[] = new Vector2d[10];
		
		Scanner myScanner = new Scanner(System.in); 
		int index  = 0;
		while (true) {
			float x = (float) Math.random();
			float y = (float) Math.random();
			Vector2d vec = new Vector2d(x, y);

			System.out.println("Added a vector ");
			vec.display();
			vecArray[index++] = vec;

			System.out.println(index + "vec now.. Another one? ");
			String response = myScanner.nextLine();
			if (response.equals("yes") == false)
				break;
		}	
	}
}
