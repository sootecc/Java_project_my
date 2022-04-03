package chap13.Ex08;

//3. 메소드의 매개변수로 전달: 
//	3-1. 객체 생성 후 매개변수로 전달(클래스명 O, 참조변수 O)
//	3-2. 클래스명 O, 참조변수 X


interface AA{		//인터페이스, 추상메소드를 정의
	public abstract void cry();		//추상메소드, public abstract
	void fly();
}

class BB implements AA{				//BB는 AA인터페이스를 구현
	@Override
	public void cry() {
		System.out.println("멍멍: 매개변수 전달 후 출력");
	}
	@Override
	public void fly() {
		System.out.println("날지 못합니다: 매개변수 전달 후 출력");
	}
}

class CC {		//CC 객체의 abc 메소드 호출시 A타입을 매개변수로 받는다.
	void abc(AA a) {	//자식 클래스가 들어오면 자동 업캐스팅
		a.cry();
		a.fly();
	}
}



public class Anonymous_3_1 {	

	public static void main(String[] args) {
		
		// 클래스명 O, 참조변수 O
		CC c = new CC();
		AA a = new BB();		//B를 객체화해서 A타입으로 생성, a: 참조변수
		
		c.abc(a);
		System.out.println("====================================");
		
		// 클래스명 O, 참조변수 X
	
		c.abc(new BB());		//interface가 아닌 구현된 클래스, 자동 업캐스팅 된다.
		
	
	}

}
