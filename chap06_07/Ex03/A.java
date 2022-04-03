package chap06_07.Ex03;

public class A {
	
	//1. 리턴 타입이 없는 메소드: void 메소드명(){}
	public void print() {						//다른 패키지에 import된 메소드들이 사용되기 위해 public이 필요하다
		System.out.println("안녕");
	}
	
	//2. 리턴 타입이 있는 메소드
	public int data() {
		return 3;
	}
	
	//3. 리턴 타입: double
	public double sum (int a, double b) {
		return a+b;
	}
	
	//4. 리턴 타입이 void + 메소드 내부에서 리턴을 포함: (함수 종료를 의미)
	public void printMethod(int m) {
		if(m<0 ||m>12) {
			System.out.println("잘못된 입력값입니다. 1 ~ 12 까지만 입력 가능합니다.");
			return;  //메소드 종료
		}
	}
	
}
