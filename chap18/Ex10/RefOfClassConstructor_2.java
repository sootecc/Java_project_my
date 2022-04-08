package chap18.Ex10;

@FunctionalInterface
interface A{
	B abc(int k);	//리턴타입이 B 객체를 리턴
}

class B {
	B(){
		System.out.printf("%s%s","첫 번째 생성자",System.lineSeparator());
	}
	B(int k){
		System.out.printf("%s%s","두 번째 생성자",System.lineSeparator());
	}
}

public class RefOfClassConstructor_2 {

	public static void main(String[] args) {
		//익명 이너클래스
		A a1 = new A() {
			@Override
			public B abc(int k) {
				return new B(k);
		}};
		
		//람다식 표현
		A a2 = (k) -> new B(k);
		
		//클래스 생성자 참조
		A a3 = B::new;			//int k가 들어가있네		//B의 두 번째 생성자 호출
		
		
		a1.abc(0);
		a2.abc(0);
		a3.abc(0);
		
	}

}
