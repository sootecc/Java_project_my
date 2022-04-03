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
		
		
		//1. Ŭ������ ���� X, �������� O
		AA a = new AA() {
			@Override
			public void cry() {
				System.out.println("��ϴ�.");
			}
			@Override
			public void fly() {
				System.out.println("���ϴ�");
			}
		};
		
		c.abc(a);
		System.out.println("======================");
		
		
		//2. Ŭ���� X, �������� X
		c.abc(new AA() {
			@Override
			public void cry() {
				System.out.println("��ϴ�");
			}
			@Override
			public void fly() {
				System.out.println("���ϴ�");
			}
		});
		
		
		
	}

}
