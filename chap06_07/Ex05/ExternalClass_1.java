package chap06_07.Ex05;

class B{	//외부 클래스: public이 올 수 없다. default가 생략되어 있다.
			//다른 패키지에선 접근이 불가능, 같은 패키지 내에서만 접근 가능
	private int a = 1 ; 		//private: 같은 클래스 내에서만 사용 가능
	int b = 2;					//default: 같은 패키지내의 다른 클래스에서 접근 가능
	protected int c = 3;		//protected: default 포함 + 다른 패키지에 접근 가능(상속된 경우)
	public int d = 4;			//public: 다른 패키지에서 접근이 가능
	
	//private < default < protected < public
	
	private void print1() { //같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	void print2() { //같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	protected void print3() { //같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	public void print4() { //같은 클래스에 존재하는 메소드
		a = 10;
		b = 20;
		c = 30;
		d = 40;
	}
	
	
}



public class ExternalClass_1 {

	public static void main(String[] args) {
		
		B b = new B();		//default: 같은 패키지에 존재하므로 B class를 생성할 수 있다.
		Bb bb = new Bb(); 
		
		//필드 접근
		//bb.a = 10;	
		bb.b = 20;
		bb.c = 30;
		bb.d = 40;
	
		//메소드 접근
		//bb.print1();		private
		bb.print2();		//default
		bb.print3();		//protected
		bb.print4();		//public
	
	}

}
