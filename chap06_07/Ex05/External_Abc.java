package chap06_07.Ex05;

import chap06_07.Ex06.Bcd;

// import chap06_07.Ex06.Abc;		//Abc 클래스의 접근지정자가 default

public class External_Abc extends Bcd{ 		//External_Abc 클래스는 Bcd 클래스를 상속 설정
	//Bcd: 부모 클래스, External_Abc: 자식 클래스
	
	public static void main(String[] args) {
		
		//Abc abc2 = new Abc();		//class 접근 지정자가 default. import불가
		
		Bcd bcd1 = new Bcd();					//부모 클래스
		External_Abc ext = new External_Abc();	//자식 클래스
		
		
		//다른 패키지에서 호출 할 때
		//1. import
		//2. 객체 생성
		//3. 접근 지정자 확인 후 접근(필드, 메소드)
				
		//다른 패키지에서 필드 호출
			bcd1.a = 1000;	//public		다른 패키지에서 접근 가능
			ext.b = 2000;	//protected		자식 클래스에서 부모 클래스의 protected를 접근
			
		//다른 패키지에서 메소드 호출
			bcd1.print1();	//public
			ext.print2();	//protected
		//	bcd1.print3();	//default(X)
		//	bcd1.print4();	//private(X)
				
		
	}

}
