package chap13.Ex06;

//1. 인터페이스의 추상메소드를 구현한 !클래스 생성! 생성 후 호출: 빈번히 사용하는 경우


interface AA{		//인터페이스, 추상메소드를 정의
	public abstract void cry();		//추상메소드, public abstract
	void fly();
}

class BB{
	
	AA a = new CC();
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	class CC implements AA{	//class C는 A인터페이스의 메소드를 구현한 클래스

		@Override
		public void cry(){
			System.out.println("멍멍");
		}
		@Override
		public void fly() {
			System.out.println("날지못합니다.");
		}
	}
}


public class AnonymousClass_1_1 {

	public static void main(String[] args) {

		BB b = new BB();
		b.abc();
	}

}
