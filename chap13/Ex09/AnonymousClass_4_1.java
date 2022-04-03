package chap13.Ex09;

interface AA {
	void cry();
	void fly();
}

class CC{
	void abc(AA a) {
		a.cry();
		a.fly();
	}
}

public class AnonymousClass_4_1 {

	public static void main(String[] args) {
		
		CC c = new CC();
		
		
		//1. 클래스는 존재 X, 참조변수 O
		AA a = new AA() {
			@Override
			public void cry() {
				System.out.println("웁니다.");
			}
			@Override
			public void fly() {
				System.out.println("납니다");
			}
		};
		
		c.abc(a);
		System.out.println("======================");
		
		
		//2. 클래스 X, 참조변수 X
		c.abc(new AA() {
			@Override
			public void cry() {
				System.out.println("웁니다");
			}
			@Override
			public void fly() {
				System.out.println("납니다");
			}
		});
		
		
		
	}

}
