package chap12.Ex05;



//인터페이스 선언: 기업의 최고 프로그래머가 한다.(PM)
interface A{
	double PI = 3.14;	//public static final 생략되어 있음
	void run();			//public abstract 생략되어 있음
}


//인터페이스를 구현하는 2가지 방법
//1. 객체를 생성 후 구현 

class B implements A{

	@Override
	public void run() {		//public 주의
		System.out.println("달립니다.");
	}
	
}

public class Interface_5 {

	public static void main(String[] args) {
		//1. 객체 생성 후 출력
		A a1 = new B();
		a1.run();
		
		//2. 익명 객체로 출력
		A a2 = new A() {
			public void run() {
				System.out.println("훨훨 납니다.");
			}
		};
		
		a2.run();
		
	}

}
