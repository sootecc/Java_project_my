package chap13.Ex07;

//2. 인터페이스의 추상메소드를 구현한 !익명 내부 클래스! 생성 후 호출: 한 번만 사용하는 경우


interface AA{		//인터페이스, 추상메소드를 정의
	public abstract void cry();		//추상메소드, public abstract
	void fly();
}

class BB{
	
	AA a = new AA() {	//인터페이스는 객체화 할 수 없다. 하지만 익명 내부 클래스를 생성하여 구현 가능
		//A 인터페이스를 구현한 자식 클래스 블록, 클래스 이름이 없다.(컴파일러가 랜덤으로 이름 할당)
		@Override
		public void cry(){
			System.out.println("멍멍");
		}
		@Override
		public void fly() {
			System.out.println("날지못합니다.");
		}
	};
	
	void abc() {
		a.cry();
		a.fly();
	}
	
	
}


public class AnonymousClass_2_1 {

	public static void main(String[] args) {
		
		BB b = new BB();
		b.abc();
	
	}

}
