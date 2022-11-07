public class GenericsType <T> {
	private T mydata;

	public void set (T mydata) {
		this.mydata = mydata;
		}

	public T getMyData () {
		return mydata;
		}

	public static void main(String args[]) {
		GenericsType<String> myobj = new GenericsType<String>();
		myobj. set("Ali");
		}
}
