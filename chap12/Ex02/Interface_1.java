package chap12.Ex02;
	
//인터페이스(interface): 외부와 내부를 연결시켜주는 접점...(콘센트) {외부 전기 장치 >> 콘센트 << 전기}
						//리모콘 (사람, TV), API
	//객체 생성 불가, 타입은 설정 가능
	//모든 필드는 반드시 public static final이 들어가있다.	(생략 가능)
	//모든 메소드는 public abstract 가 들어가있다.	(생략 가능 Java 1.8까지), default 메소드는 제외
	
interface A{			//정식 표현
	public static final int A = 3;			//interface 필드의 정식 표현
	public abstract void abc();				//interface 메소드의 정식 표현
}

interface B{			//생략된 구현
	int A = 3;		
	void abc();			//추상 메소드: 
	
}

abstract class C {					//추상 클래스일 때는 abstract key 생략 불가
	abstract void abc();			//생략시 오류
}



public class Interface_1 {

	public static void main(String[] args) {
		
		//인터페이스는 객체 생성 불가. 구현되지 않는 메소드가 포함돼있음
		
		//A a = new A();  A가 인터페이스이므로 객체 생성 불가
		
		//1. 인터페이스의 static 필드 내용을 출력
		System.out.println(A.A);		//인터페이스의 필드 출력, A <== static
		System.out.println(B.A);
		
		
		//2. final이 적용되어 있기 때문에 값의 수정 불가
//		A.A = 5;		final이 들어가 있기 때문에 수정 불가
//		B.A = 6;
		
		
		
	}

}
