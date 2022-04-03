package chap16.Ex07;

//제네릭 메소드 내부에서 사용 가능한 메소드: Object 클래스의 메소드만 사용 가능하다.

class A{
	public <T> void method(T t) {
		//System.out.println(t.length());			//t.length(): String 클래스에서 글자 수를 리턴해줌, 사용 불가
		System.out.println(t.equals("안녕"));		//t.equals: Object 클래스의 메소드는 사용 가능
	}
	public <T extends Object> void method2 (T t){	//extends Object가 생략되어 있다. <T> == <T extends Object>
		System.out.println(t.equals("반갑습니다."));	//Object 클래스의 메소드라 사용 가능
	}
	
	public <T extends String> void method3(T t){	//String을 상속 받은 T이기 때문에 String 클래스의 메소드 사용 가능
		System.out.println(t.length());
		
	} 
}


public class AvailableMethodinGenericMethod {

	public static void main(String[] args) {
		
		A a = new A();
		a.<String>method("안녕");
		
		
		
		 
	}

}
