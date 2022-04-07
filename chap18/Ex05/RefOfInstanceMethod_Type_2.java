package chap18.Ex05;

//메소드 참조 (정적 메소드 표현)
	//메소드 참조: 내가 구현하지 않고, 구현되어 있는 메소드를 참조해서 사용
	//정적 메소드 참조
@FunctionalInterface

interface A{
	void abc();
}

class B{
	static void bcd() {					//static method: 클래스 이름으로 호출 가능
		System.out.printf("%s%s","메소드",System.lineSeparator());
	}
}


public class RefOfInstanceMethod_Type_2 {

	public static void main(String[] args) {

		// 정적 메소드 참조
		A a = new A() {
			
			@Override
			public void abc() {
				B.bcd();		//static이 적용된 정적 메소드 호출, 객체 생성 없이 클래스명으로 호출
			}
		};
		// 람다식 표현
		A a2 = ()-> B.bcd();
		
		// 정적 메소드 참조
		A a3 = B::bcd;
		
		
		a.abc();
		a2.abc();
		a3.abc();
	}

}
