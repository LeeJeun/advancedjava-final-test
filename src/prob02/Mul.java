package prob02;

public class Mul implements Arithmetic{
	int a, b;
	
	public Mul () {
	}
	public Mul (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate(int a, int b) {
		return a*b;
	}

}
