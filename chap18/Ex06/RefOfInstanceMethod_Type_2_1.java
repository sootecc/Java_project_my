package chap18.Ex06;

@FunctionalInterface
interface A{
	void abc(B b, int k);
}

class B{
	void bcd(int k) {
		System.out.println(k);
	}
}
public class RefOfInstanceMethod_Type_2_1 {

	public static void main(String[] args) {
		//인스턴스 메소드 참조 Type2
		//익명 이너 클래스
		
		A a1 = new A() {
		
			@Override
			public void abc(B b, int k) {
				b.bcd(k);
			}
		};
		
		A a2 = (B b,int k) -> {b.bcd(k);};
	
		A a3 = B::bcd;		//인스턴스 메소드이나 B객체를 인풋 받아서 bcd 메소드 호출
		//객체명::메소드명;
		//객체명이 대문자인 경우 두 가지
		//1. 정적메소드 호출일 때
		//2. 인스턴스 메소드지만 객체가 매개변수로 들어갈 때
		
		B b = new B();
		a1.abc(b, 7);
		a2.abc(b, 8);
		a3.abc(b, 9);
		
	}

}
