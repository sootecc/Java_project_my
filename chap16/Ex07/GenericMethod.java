package chap16.Ex07;

//제네릭 클래스: 클래스를 선언할 때 타입변수를 선언 <T> <<정의>> ,  객체를 생성시 T에 적용할 타입을 지정
//제네릭 메소드: 일반 클래스 내부의 메소드 선언시 제네릭 탕비 변수를 사용

class Genericmethod2{		//일반 클래스
	
	public <T> T method1 (T t) {				//제네릭 메소드: 1개
		return t;
	}
	public <T> boolean method2 (T t1, T t2) {	//제네릭 메소드: 1개
		return t1.equals(t2);					//두 값을 비교해서 true, false 리턴
												//기본 자료형일때는 값을 비교하고 참조자료형일 때는 주소를 비교한다.
												//String은 equals가 재정의 되어있어서 값을 비교한다.
		
	}
	
	public <K, V> void method3(K k, V v) {		//제네릭 메소드: 2개
		System.out.println(k+ " : "+v);
	}
	
	public <K, V> void method4() {
		System.out.println("dd");
	}
}



public class GenericMethod {

	public static void main(String[] args) {
		
		//1. 일반 클래스 객체 생성 후 제네릭 메소드 호출
		Genericmethod2 gm = new Genericmethod2();
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("안녕");		//타입을 알 수 있는 경우 생략 가능
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("============");
		
		Integer i = gm.<Integer>method1(100);
		Integer i2 = gm.<Integer>method1(200);
		System.out.println(i);
		System.out.println(i2);
		System.out.println("============");
		
		Boolean b1 = gm.<Boolean>method1(true);
		Boolean b2 = gm.<Boolean>method1(false);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("============");
		
		Boolean d1 = gm.<Double>method2(2.55,255.0);		//리턴 받을 타입이 Boolean
		Boolean d2 = gm.<Double>method2(250.5,255.0);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("============");
		
		
		gm.<String, Integer>method3("국어", 90);
		gm.method3("영어", 80);					//매개변수로 인풋 되는 데이터 타입을 추정할 수 있는 경우 생략 가능
		gm.<Integer, String>method3(500,"서버 에러입니다.");
		gm.method3(402,"파일을 찾을 수 없습니다.");
		System.out.println("============");
		
		gm.method4();
	}

}
