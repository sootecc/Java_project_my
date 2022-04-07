package chap18.Ex09;

@FunctionalInterface
interface A{
	B abc();		//리턴타입이 B 객체
}

class B {
	B(){
		System.out.printf("%s%s","첫 번째 생성자",System.lineSeparator());
	}
	B(int k){
		System.out.printf("%s%s","두 번째 생성자",System.lineSeparator());
	}
}



public class RefOfClassConstructor_1 {

	public static void main(String[] args) {

		//클래스 생성자 참조
		A a1 = new A() {
			@Override
			public B abc() {		//abc()메소드 호출 시 B 객체의 기본 생성자 호출 -> 생성자 참조
				return new B();		
			}
		};
		
		//람다식 표현
		
		A a2 = () -> new B();
		
		
		//클래스 생성자 참조
		A a3 = B::new;
		
		a1.abc();
		a2.abc();
		a3.abc();
		
		System.out.printf("%s%s","=======================",System.lineSeparator());
		
		
		
	}

}
