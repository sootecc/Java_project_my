package chap18.Ex03;

import java.util.Scanner;

//1. 스캐너를 사용해서 double 두 수를 입력 받는다.
//2. 방법1. 람다식을 사용해서 인풋받은 두 값을 + , -, *, / 사칙연산 구현해서 출력.
//3. 방법2. 인터페이스를 구현한 자식 객체를 사용해서 인풋받은 두 값을 + , -, *, / 사칙연산 구현해서 출력.
//4. 방법3. 익명 이너클래스를 구현하여 인풋받은 두 값을 + , -, *, / 사칙연산 구현해서 출력.
//5. 0으로 나누면 예외 발생



@FunctionalInterface
interface Arithmetic{
	void arithmeticOpr(double a, double b);
}

class A implements Arithmetic{
	@Override
	public void arithmeticOpr(double aa, double bb) {
		double c = aa/bb;
		if(Double.isInfinite(c)){System.out.println("0으로 나눌 수 없습니다.");}
		else{System.out.printf("합: %f, 차: %f, 곱: %f, 나누기: %f%s",aa+bb,aa-bb, aa*bb, aa/bb,System.lineSeparator());}
	}
}

public class ArithmeticOperation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요.: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println("방법 1");
		Arithmetic one = (double aa,double bb) -> {
			double c = aa/bb;
			if(Double.isInfinite(c)){System.out.println("0으로 나눌 수 없습니다.");}
			else{System.out.printf("합: %f, 차: %f, 곱: %f, 나누기: %f%s",aa+bb,aa-bb, aa*bb, aa/bb,System.lineSeparator());}
			};
		one.arithmeticOpr(a, b);
		System.out.println("방법 2");
		Arithmetic two = new A();
		two.arithmeticOpr(a, b);
		
		System.out.println("방법 3");
		Arithmetic three = new Arithmetic() {
			
			@Override
		public void arithmeticOpr(double aa, double bb) {
			double c = aa/bb;
			if(Double.isInfinite(c)){System.out.println("0으로 나눌 수 없습니다.");}
			else{System.out.printf("합: %f, 차: %f, 곱: %f, 나누기: %f%s",aa+bb,aa-bb, aa*bb, aa/bb,System.lineSeparator());}
			}
		};
		three.arithmeticOpr(a, b);
		
	}
}
