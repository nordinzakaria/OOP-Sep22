

class Vector2d {

	// attributes
	private float x, y;

	// operation
	public Vector2d() {
		x = 0;
		y = 0;
	}

	public Vector2d(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Vector2d add(Vector2d othervec) {
		return null;
	}

	public float magnitude( ) {
		return (float) Math.sqrt(x*x + y*y);
	}

	public float dotprod(Vector2d othervec) {
		return 0;
	}

	// normalize
	// divide the vector (both x and y) by its magnitude
	public void normalize() {
		float mag = magnitude();
		x /= mag;
		y /= mag;
	}

	public void display() {
		System.out.println("vec = <"+x+","+y+">");
	}

	// write code to test the class
	// test using at least 2 intances
	public static void main(String args[]) {
	 Vector2d vec0 = new Vector2d();	
	 Vector2d vec1 = new Vector2d(1,5);	

	 vec0.normalize();
	 vec0.display(); 
	}

}



