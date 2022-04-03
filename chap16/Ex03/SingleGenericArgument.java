package chap16.Ex03;

//Object: 모든 객체를 저장할 수 있지만... 다운 캐스팅이 필요하고 캐스팅시 예외가 발생될 수 있다.(약한 타입 체크)

//제네릭 클래스: 하나의 클래스에서 다양한 데이터 타입을 처리할 수 있다.
	//제네릭 타입 변수: T(타입), K(Key), V(Value), N(Number), E(Element, 원소)
		// A ~ Z 까지 임의로 넣을 수 있다.
		//wrapper 클래스: 기본 타입을 객체화 시켜 놓은 클래스
			//int(기본타입) ==> Integer (객체), boolean ==> Boolean, char ==> Character
			//double ==> Double, float ==> Float
			//short ==> Short, byte ==> Byte, long ==> Long


//=> 제네릭 클래스 사용

class MyClass<T>{
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {	//setter 필드 값 할당
		this.t = t;
	}
	
	
}

public class SingleGenericArgument {

	public static void main(String[] args) {
		
		//1. 제네릭 클래스 객체 생성 <String>을 입력
		MyClass<String> mc1 = new MyClass<String>();
		mc1.set("안녕");
		System.out.println(mc1.get());
	
		//2. 제네릭 클래스 객체 생성 <Integer>를 입력
		MyClass<Integer> mc2 = new MyClass<Integer>();		//wrapper 클래스를 할당해야 한다.
		mc2.set(100);
		System.out.println(mc2.get());
		
		//3. 제네릭 클래스 객체 생성 <Double>를 입력
		MyClass<Double> mc3 = new MyClass();		//생성자의 자료형운 생략 가능하다.	
		mc3.set(333.33);
		System.out.println(mc3.get());
		
		//4. 강한 타입 체크(컴파일 단계에서 오류를 출력해준다.)
		MyClass<Boolean> mc4 = new MyClass<Boolean>();
		mc4.set(true);
		//mc4.set("ㅇ");		//강한 타입 체크, 실행시 오류를 방지시켜줌
		
	}

}
