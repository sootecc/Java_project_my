package chap18.Ex02;

//람다식 문법

@FunctionalInterface
interface A {				
	void method1();
}

@FunctionalInterface
interface B{
	void method2(int a);
}

@FunctionalInterface
interface C{
	int method3();
}

@FunctionalInterface
interface D{
	double method4(int a, int b);
}

public class FunctionToLambdaExpression {

	public static void main(String[] args) {

		//인터페이스의 구현되지 않은 함수를 구현 -> 람다식
		
		//1. A 입력x 리턴x
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.printf("%s%s","메소드 1",System.lineSeparator());
			}
		};
		//1-1. 람다식으로 처리
			//람다식은 리턴 타입, 메소드 이름까지 제거 가능
			//(인풋) -> {구현부};
		A a2 = () -> {System.out.printf("%s%s","메소드 1-1",System.lineSeparator());};
		A a3 = () -> System.out.println("메소드 1-2");	//구현부에 한 라인만 존재할 때 {}; 도 생략 가능
		a1.method1();
		a2.method1();
		a3.method1();
		
		
		
		
		//2. B 입력O 리턴x
		B b1 = new B () {
			@Override
			public void method2(int a) {
				System.out.printf("%s%s","메소드 2",System.lineSeparator());
			}
		};
		B b2 = (int a) -> {System.out.printf("%s%s","메소드 2-1",System.lineSeparator());};
		B b3 = (a) -> System.out.printf("%s%s","메소드 2-2",System.lineSeparator());		//입력 매개변수의 타입 생략 가능
		B b4 = a -> System.out.printf("%s%s","메소드 2-3",System.lineSeparator());		//입력 매개변수가 하나일 때 () 생략 가능
		b1.method2(0);
		b2.method2(0);
		b3.method2(0);
		b4.method2(0);
		
		
		
		
		
		
		//3. C 입력x 리턴O
		C c1 = new C() {
			@Override
			public int method3() {
				System.out.printf("%s%s","메소드 3",System.lineSeparator());
				return 0;
			}
		};
		C c2 = () -> {return 0;};		
		C c3 = () -> 0;				//리턴이 한 라인으로 적용된 경우: return을 생략 가능, 반드시 중괄호와 함께 생략		
		c1.method3();
		c2.method3();
		System.out.printf("%s%d%s","돌려 받은 값은: ",c3.method3(),System.lineSeparator());
		
		
		
		
		
		//4. D 입력O 리턴O
		D d1 = new D() {
			@Override
			public double method4(int a, int b) {
				return a+b;
			}
		};
		D d2 = (int a, int b) -> {return a+b;};	//전체 표현
		D d3 = (a, b) -> a+b;	//인풋 타입 생략 가능, 구문에 리턴 하나라 (반드시 중괄호와 함께) 생략 가능
		System.out.printf("%s%f%s","두 수의 합은: ",d1.method4(1, 2),System.lineSeparator());
		System.out.printf("%s%f%s","두 수의 합은: ",d2.method4(3, 4),System.lineSeparator());
		System.out.printf("%s%f%s","두 수의 합은: ",d3.method4(5, 4),System.lineSeparator());
	
	
	}

}
