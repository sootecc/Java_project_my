package chap10.Ex06;


//super: 부모 클래스를 지칭, 메소드 내부, 생성자 내부에서 사용
//super() : 생성자 내부에서만 사용, 부모생성자를 호출할 때 사용
		//반드시 첫 라인에 위치
//this 키워드: 자신의 객체를 지칭, 메소드 내부에서 사용, 생성자 내부에서도 사용, 필드 이름 앞, 메소드 이름 앞 
//this() : 생성자 내부에서만 사용, 자신의 클래스에 다른 생성자를 호출할 때 사용
		//반드시 첫 라인에 위치,

class AAA{
	AAA(){
		System.out.println("AAA 생성자");
	}
}
class BBB extends AAA{
	BBB(){
		super();
		System.out.println("BBB 생성자");
	}
}
class CCC{
	CCC(){}
	CCC(int a){
		System.out.println("CCC 생성자: "+a);
		
	}
}
class DDD extends CCC{
	DDD(){
		super();
	}
	DDD(int a){
		super(3);
		System.out.println("DDD 생성자 정수 1: "+a);
	}
	
}

public class SuperMethod_1 {

	public static void main(String[] args) {
		//1. 객체 생성
		AAA aaa = new AAA();							//기본 생성자 호출
		System.out.println("======================");
		BBB bbb = new BBB();							//기본 생성자 호출
		System.out.println("======================");
		DDD ddd = new DDD();
		System.out.println("======================");
		DDD eee = new DDD(5);
		System.out.println("======================");
		
	}

}
