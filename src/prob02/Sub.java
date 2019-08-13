package prob02;

public class Sub implements Arithmetic{
	int a, b;
	
	public Sub () {
	}
	public Sub (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate(int a, int b) {
		return a-b;
	}

}
