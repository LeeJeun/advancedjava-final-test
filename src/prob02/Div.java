package prob02;

public class Div implements Arithmetic{
	
	int a, b;
	
	public Div () {
	}
	public Div (int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate(int a, int b) {
		return a/b;
	}

}
