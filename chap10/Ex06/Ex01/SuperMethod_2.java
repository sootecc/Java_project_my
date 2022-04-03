package chap10.Ex06.Ex01;


//자식 객체를 생성할 때 부모클래스의 기본 생성자를 먼저 호출: super()
//모든 자식 객체의 생성자에는 super(); 가 생략되어 있음

class A{
	A(){
		System.out.println("A 클래스의 기본 생성자");
	}
	A(int a){
		System.out.println("A class의 매개변수 정수 1 생성자: "+a);
	}
	A(int a, int b){
		System.out.println("A class의 매개변수 정수 2 생성자: "+ a + ", " + b);
	}
}
class B extends A{
	B(){
		//super(); 
		System.out.println("B 클래스의 기본 생성자");
	}
	B(String a){
		super(3, 5);
		System.out.println("B 클래스의 문자열 1 생성자: "+ a);
	}
	
}
class C extends B{
	C(){
		super("c에서 호출");	//super(); 가 숨어있음
		System.out.println("C 클래스의 기본 생성자");
	}
	
}

public class SuperMethod_2 {

	public static void main(String[] args) {
		C c = new C();
	
	}

}
