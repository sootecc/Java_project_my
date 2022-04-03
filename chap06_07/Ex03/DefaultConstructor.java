package chap06_07.Ex03;


//기본생성자
//일반적으로 클래스 블록에 1. 필드, 2. 생성자, 3. 메소드 형식으로 작성한다. 
class Aaa{	
	int m;	//필드: 데이터타입 변수명
			//힙 영역에 저장, 객체화 시켜야 사용 가능. static 키워드 넣으면 객체화 하지 않아도 사용 가능
			//힙 영역의 메모리에는 반드시 초기값이 들어가야한다.		
	
	//A(){}	//기본 생성자: 클래스 이름과 동일하면서 리턴타입이 없는 메소드를 기본생성자라 호칭한다.
			//기본생성자는 생략 가능
			//기본 생성자는 매개변수도 없고, 실행부도 가지지 않는 생성자
	
	
	void work() {				//메소드: 리턴타입 메소드명 (input 매개변수){}
								//호출해야 작동 : work();
		System.out.println(m);	//메모리의 값을 가지고 온다.
		
		
	}
}
class B{
	int m;
	B(){}
	
	void work() {
		System.out.println(m);
	}
}
class C{
	int m;
	C(int c){
		m = c;
	}
	
	void work() {
		System.out.println(m);
	}
}

class D {
	int m,n,l;
	D(){}
	D(int m, int n){ //매개변수 2개
		this.m = m;	 //this: 자기 자신의 객체, 지역변수가 아니라 필드의 변수를 알려줌
		this.n = n;
	
	}
	D(int a, int b, int c){
		this.m = a;
		this.n = b;
		this.l = c;
	}
	
	void work() {
		System.out.println(m+" "+n+" "+l);
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		//클래스 내에 포함될 수 있는 것:
		//1. 필드
		//2. 메소드
		//3. 생성자
		//4. 이너클래스		

		// 생성자의 2가지 특징
		//1. 클래스 이름과 동일한 이름을 가진 메소드
		//2. 생성자는 리턴 타입이 없다.

		//생성자를 사용하는 이유: 객체를 만들 때 필드의 값을 초기화하며 생성할 때 사용
		//클래스 내에서 필드의 초기값은 일반적으로 할당하지 않는다.
		//객체를 만들 때 반드시 생성자를 호출		A a = new A();
		
		// 기본 생성자( Default Constructor): 
			//input 매개변수가 없는 생성자, 실행부의 값도 비어있는 상태
			//기본생성자는 생략 가능함
			//생략되어 있을 경우, 컴파일러가 자동으로 생성해서 컴파일
			//클래스 내 기본 생성자 이외의 생성자가 존재하는 경우, 기본 생성자 호출시 생략 불가능
		
		Aaa a = new Aaa();	//기본 생성자 호출
						//객체 생성시 반드시 생성자를 호출 해야 한다.
		a.work();
		
		B b = new B();
		b.work();
		
		C c  =new C(3);
		c.work();
		
		C cc  =new C(5);
		cc.work();
		
		C ccc  =new C(10);
		ccc.work();
		
		/* 		
		C cccc  =new C();		
		cc.work();
		class C의 기본생성자는 생략되어 있다.
		다른 생성자가 있으면 오류. 기본 생성자도 만들어줘야한다.
		*/
		D d = new D();
		D dd  = new D(5,6,7);
		D ddd = new D(1,2);			//매개변수가 정수 3개인 생성자를 호출
		
		d.work();
		dd.work();
		ddd.work();
		
		//객체 내의 필드 값을 초기화 할 때 오버로딩(Overloading)에 의해 해당 생성자가 호출
		//오버로딩: 메소드명(생성자명, 데이터 타입, 매개변수 개수)<= 시그니쳐
		//오류가 발생되는 경우: 동일한 데이터 타입과 동일한 매개변수 개수

	}

}
