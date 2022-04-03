package chap06_07.Ex03;

//생성자 오버로딩: 하나의 생성자명에 데이터타입, 개수에 따라 다른 생성자가 호출
//주의) 메소드명, 데이터 타입, 개수 같은 경우 오류 발생
class Abc{
	int a, b, c;
	String d;
	
	Abc(){
		System.out.println(a+" , "+b+" , "+c);
		System.out.println("============");
		}
	Abc(String d){
		this.d = d;
		System.out.println(d);
		System.out.println("============");
	}
	Abc(int a){
		this.a = a;
		System.out.println(a);
		System.out.println("============");
	}
	Abc(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println(a+" , "+b);
		System.out.println("============");
	}
	Abc(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a+" , "+b+" , "+c);
		System.out.println("============");
	}
	
}


public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Abc abc = new Abc();
		Abc abc1 = new Abc(1);
		Abc abc2 = new Abc(1,2);
		Abc abc3 = new Abc(1,2,3);
		Abc abc4 = new Abc("overloading");	

	}

}
