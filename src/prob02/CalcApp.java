package prob02;

import java.util.Scanner;

public class CalcApp{
	static int a = 0;
	static int b = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "두 정수와 연산자를 입력하시오 >> " );

		a = scanner.nextInt();
		b = scanner.nextInt();
		String operation = scanner.next();

		/* operation에 따라 4칙 연산 객체를 생성하고 caculate 메서드를 호출합니다. */
		Arithmetic ari = null;
		
		switch (operation) {
		case "+":
			ari = new Add(a,b);
			break;
		case "-":
			ari = new Sub(a,b);
			break;
		case "*":
			ari = new Mul(a,b);
			break;
		case "/":
			ari = new Div(a,b);
			break;
		default:
			break;
		}

		System.out.println(calculate(ari));

	}
	
	public static int calculate(Arithmetic ari) {
		if(ari == null) {
			System.out.println("잘못됐습니다.");
		}
		return ari.calculate(a,b);
	}
}
