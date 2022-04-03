package chap12.Ex04;

//인터페이스 상속시 자식 클래스 접근 지정자 오류 <<중요>>
//인터페이스의 메소드를 구현할 때 반드시 public을 넣어줘야 한다.
//자식은 부모보다 접근지정자의 범위가 같거나 더 넓어야 한다.
interface A{
	public abstract void abc();
}

class F implements A{				//F클래스는 완성된 메소드가 구현되어 있어야 한다.

	@Override
	public void abc() {
		
	}
	
	
}

interface B{
	void abc();		//public abstract가 생략 되어있다.
}

class C implements A{
	public void abc() {	//A 인터페이스의 abc()를 오버라이딩하여 구현한 메소드
					//자식은 부모보다 접근지정자의 범위가 같거나 더 넓어야 한다.
	}
}

class D implements B{
	public void abc() {	//인터페이스의 메소드를 구현할 때는 반드시 public 접근 지정자를 사용해야 한다.
		
	}
}

class E implements B{

	@Override
	public void abc() {
		
	}
	
}

public class Interface_04 {

	public static void main(String[] args) {
		
		
		
	}

}
