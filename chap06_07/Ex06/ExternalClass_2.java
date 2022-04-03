package chap06_07.Ex06;

import chap06_07.Ex05.Bb;

//import chap06_07.Ex05.B;		//class B는 클래스 접근 제어자가 default이기 때문에 접근 불가능



public class ExternalClass_2 {

	public static void main(String[] args) {
	
		//B b = new B();	//public 아니라 안돼
		//다른 패키지의 클래스에서 Bb 클래스를 접근 하는 경우
		
			//1. import를 먼저 사용
			//2. Bb 클래스의 클래스 접근 제어자는 public
			//3. 필드, 메소드의 접근 제한자에 따라서 접근이 가능(protected(상속관계), public), 불가능(private, default)
		
		Bb b = new Bb();	//public이라 import 가능
		
		//<<필드 접근>>
		//b.a = 10;			//private: 같은 클래스 내에서만 접근
		//b.b = 20;			//default: 같은 패키지 내에서만 접근 가능
		//b.c = 30;			//protected: default 포함 + 다른 패키지에서 접근 가능(상속)
		b.d = 40;			//public: protected + 다른 패키지에서 접근 가능
		
		
		//<<메소드 접근>>
		//b.print1();		//private
		//b.print2();		//default
		//b.print3();		//protected
		b.print4();			//public
	}

}
