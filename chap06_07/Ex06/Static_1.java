package chap06_07.Ex06;

class Aaa {
	int m = 3;			//필드(인스턴스 필드) : 객체를 생성 후 사용가능
	static int n = 4;	//필드(static 필드)
						//모든 객체가 공유하는 변수
	
	void print1() {		//메소드(인스턴스 메소드) : 객체를 생성 후 호출 가능
		System.out.println("인스턴스 메소드 출력" );
		System.out.println("m: "+m);
		System.out.println("n: "+n);
	}
	
	static void print2() {	//메소드 (Static 메소드) : 객체 생성 없이 호출 가능, 객체 생성 후도 가능
		//static 메소는 객체 생성 없이 호출이 되므로 인스턴스 필드가 올 수 없다.
		//인스턴스 필드는 객체를 생성해야하기 때문
		
		System.out.println("static 메소드 출력");
		//System.out.println("m: "+m);    스태틱 메소드 내에서는 인스턴스 필드가 올 수 없다.
		
		System.out.println("n: "+n);
	}
	
	
	
}						 

public class Static_1 {

	public static void main(String[] args) {
		//1. 객체 생성 후 필드와 메소드 호출( 인스턴스 필드, static 필드, 인스턴스 메소드, static 메소드) 모두 호출
		Aaa aaa = new Aaa();
		aaa.m = 10;				//인스턴스 필드 호출
		aaa.n = 20;				//static 필드 호출
		aaa.print1();			//인스턴스 메소드 호출
		aaa.print2();			//static 메소드 호출
		
		//2. 객체 생성 없이 클래스명으로 static 필드와 메소드 호출(static 필드와 static 메소드만 호출 가능)
		Aaa.n = 100;
		Aaa.print2();
		
		Aaa bbb = new Aaa();
		System.out.println(bbb.n);	//100
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n);	//100
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n);	//100
		
		Aaa eee = new Aaa();
		System.out.println(eee.n);	//100
		
		eee.n= 300;
		System.out.println("======static 필드가 적용된 필드는 모든 객체에서 공통으로 바라보는 변수===========");
		System.out.println("aaa.n: "+aaa.n);
		System.out.println("bbb.n: "+bbb.n);
		System.out.println("ccc.n: "+ccc.n);
		System.out.println("ddd.n: "+ddd.n);
		System.out.println("eee.n: "+eee.n);
		
	}

}
