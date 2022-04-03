package chap12.Ex01;

abstract class Abc{
	abstract void cry();
	abstract void fly();
}

class Cat extends Abc{
	
	@Override
	void cry() {
		System.out.println("고양이는 야옹하고 웁니다.");
	}
	
	@Override
	void fly() {
		System.out.println("고양이는 날 수 없습니다.");
	}
}

class Eagle extends Abc{
	
	@Override
	void cry() {
		System.out.println("독수리는 끼엑 하고 웁니다.");
	}
	
	@Override
	void fly() {
		System.out.println("독수리는 날 수 있습니다.");
	}
}

public class Ex_AbstractClass {

	public static void main(String[] args) {
		
		//1. 자식 클래스 Cat, Eagle 클래스를 생성 후 출력 
		
		Abc cat = new Cat();
		Abc eagle = new Eagle();
		
		cat.cry();
		cat.fly();
		eagle.cry();
		eagle.fly();
		
		
		//2. 익명 클래스 생성 후 출력
		Abc tiger = new Abc() {
			void cry() {System.out.println("호랑이는 어흥 하고 웁니다.");}
			void fly() {System.out.println("호랑이는 날 수 없습니다.");}
		};
		tiger.cry();
		tiger.fly();
	}

}
