
// A generic class
class Vector2 <T> {

	// attributes
	private T x, y;

	// operation
	public Vector2() {
		x = 0;
		y = 0;
	}

	public Vector2(T x, T y) {
		this.x = x;
		this.y = y;
	}

	public Vector2 add(Vector2 othervec) {
		return null;
	}

	public T magnitude( ) {
		return (T) Math.sqrt(x*x + y*y);
	}

	public T dotprod(Vector2 othervec) {
		return 0;
	}

	// normalize
	// divide the vector (both x and y) by its magnitude
	public void normalize() throws Exception {
		T mag = magnitude();
		if (mag < 0.000001) // as good as 0 
			throw new Exception("0 magnitude");

		x /= mag;
		y /= mag;
	}

	public void display() {
		System.out.println("vec = <"+x+","+y+">");
	}

	// write code to test the class
	// test using at least 2 intances
	public static void main(String args[]) {
	 Vector2<float> vec0 = new Vector2<float>();	
	 Vector2<float> vec1 = new Vector2<float>(1,5);	

	 try {
	 	vec0.normalize();
	 } catch (Exception ex) {
		System.out.print("Problem here");
		ex.printStackTrace();
	 }

	 vec0.display(); 
	}

}



