
// A generic class
class Vector2 <T> {

	// attributes
	private T x, y;

	// operation
	public Vector2(T x, T y) {
		this.x = x;
		this.y = y;
	}

	public Vector2 add(Vector2 othervec) {
		return null;
	}

	// write code to test the class
	// test using at least 2 intances
	public static void main(String args[]) {
		// Float is a class that represents flot
	 Vector2<Float> vec0 = new Vector2<Float>(new Float(10), new Float(10));	
	 Vector2<Double> vec1 = new Vector2<Double>(new Double(10), new Double(10));	
	}

}



