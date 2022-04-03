package chap06_07.Ex05;

public class Ex_A {

	public static void main(String[] args) {
		
		//A class는 같은 패키지 내부에 존재하므로 import 없이 사용 가능
		
		A a = new A();	
		a.m = 10;		//A class
		a.n = 20;
		
		a.print();
	}

}
