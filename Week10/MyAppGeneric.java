

import java.util.Scanner;
import java.util.ArrayList;

public class MyAppGeneric {

	public static void main(String args[]) {
		ArrayList<Vector2d> vecArray = new ArrayList<Vector2d> ();
		
		Scanner myScanner = new Scanner(System.in); 
		int index  = 0;
		while (true) {
			float x = (float) Math.random();
			float y = (float) Math.random();
			Vector2d vec = new Vector2d(x, y);

			System.out.println("Added a vector ");
			vec.display();
			vecArray.add(vec);

			System.out.println(vecArray.size() + " vec now.. Another one? ");
			String response = myScanner.nextLine();
			if (response.equals("yes") == false)
				break;
		}	
	}
}
