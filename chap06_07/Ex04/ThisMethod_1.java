package chap06_07.Ex04;


/* 1. this가 키워드로 사용되는 경우: this.m (필드의 m), this.init() (객체 자신의 메소드 init())
 * 2. this가 메소드로 사용되는 경우: this();	생성자(constructor) 내에서 다른 생성자를 호출할 때 사용
 * 										반드시 생성자 내부의 첫 줄에 와야 함
 * 										메소드 내부에서는 사용 불가
 * 
 */

class Abc{
	
	Abc(){	
		System.out.println("1st constructor");
	}
	Abc(int a){
		this();		//매개변수가 없는 constructor를 호출. this()는 constructor의 첫 라인에 와야 함
		System.out.println("2nd constructor");
	}
	Abc(int a, String b){
		this(30);
		System.out.println("3rd constructor");
	}
	/*void abc() {
		//this(); method 내에서는 사용불가
		
	}
	*/
}

public class ThisMethod_1 {

	public static void main(String[] args) {
		
		//1. 객체 생성
		Abc abc = new Abc();	//기본constructor
		System.out.println("=============================");
		Abc abc1 = new Abc(2);
		System.out.println("=============================");
		Abc abc2 = new Abc(2,"this");
		
	}

}
