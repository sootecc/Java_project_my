package chap06_07.Ex04;

//묵시적 this 키워드 자동 추가
//1. 클래스 내부에서 field, method 이름 앞에 자동으로 this 키워드가 붙는다.
	// this 키는 자기 자신의 객체 field와 객체 method를 지칭, 

class A{
	int m;
	int n;
	
	A(){}
	
	
	void init(int a, int b) {
		int c;			//a,b,c 지역변수 (stack 영역안에 변수명과 값을 가진다.)
		c = 3;			//init() 메소드 생성시 stack에 생성, 메소드가 끝나는 시점에 할당 해제
		this.m = a;		//this 키를 생략했을 때, 컴파일러가 자동으로 추가
		this.n = b;		
	}
	void work() {
		this.init(2, 3);
		System.out.println(this.m+" , "+this.n);	//this는 생략 가능, 생략시 컴파일러가 자동으로 추가
	}
}

public class ThisKeyword_1 {

	public static void main(String[] args) {
		
		//2. 객체 생성
		A a = new A();
		
		//3. 메서드 호출
		a.work();
		
		
	}

}
