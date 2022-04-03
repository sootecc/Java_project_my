package chap11.Ex04;

//추상 클래스를 사용하지 않으면?
	//자식 클래스에서 메소드 오버라이딩시 오버라이딩이 오타로 인해 잘못 구현될 위험성이 있다.

class Animal{
	void cry() {}		//팀장이 cry() 정의해주고 구현은 팀원에게 위임.
	
}
class Cat extends Animal{
	void cRy() {		//오버라이딩이 아닌 별개의 메소드
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	void Cry() {		//오타로 인해 새로운 메소드 정의
		System.out.println("멍멍");
	}
}


public class AbstractModifier_2 {

	public static void main(String[] args) {
		
		//1. 객체 생성
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		a1.cry();
		a2.cry();
	}

}
