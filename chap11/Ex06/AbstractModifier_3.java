package chap11.Ex06;

abstract class Animal{		//추상 클래스: 추상 메소드가 한 개 이상 포함되어 있는 경우
							//추상 클래스는 객체 생성 불가능, 타입 사용은 가능
	String name;			//자식클래스가 부모클래스의 메소드를 구현시 오류 방지(오타..) 
	int age;
	
	abstract void cry();		//추상메소드: 구현부가 없는 메소드
		//void cry(){}			<==일반 메소드: 리턴타입 메소드이름 (입력 매개변수){구현부} 
	abstract void run();
		
	@Override
		public String toString() {		//객체 자체를 출력시 메모리의 정보를 출력
			return "이름: "+name+", "+"나이: "+age;
		}
}

class Cat extends Animal{		//Animal의 일부만 상속한 경우 추상 클래스,
								// 모든 추상 메소드를 구현한 경우는 콘크리트 클래스
	
	
	Cat(){}
	Cat(String name, int age){
		super.name = name;
		this.age = age;
	}
	@Override
	void cry() {
		System.out.println("야옹");
	}
	@Override
	void run() {
		System.out.println("고양이는 사뿐사뿐 뜁니다.");
	}
	
}

class Tiger extends Animal{
	Tiger(){}
	Tiger(String name, int age){
		super.name = name;
		this.age = age;
	}
	@Override
	void cry() {		//추상 메소드를 구현한 메소드
		System.out.println("어흥");
	}
	@Override
	void run() {		//추상 메소드를 구현한 메소드
		System.out.println("호랑이는 덥석 덮칩니다.");
	}
	
}

class Eagle extends Animal{
	
	Eagle(){}
	Eagle(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	void cry() {
		System.out.println("??");
	}
	@Override
	void run() {
		System.out.println("독수리는 뛰지 않습니다.");
	}
	
}

public class AbstractModifier_3 {

	public static void main(String[] args) {
		Animal a1 = new Cat("고양이",10);
		Animal a2 = new Tiger("호랑이",5);
		Animal a3 = new Eagle("독수리",15);
	
		
		//1. Animal 배열 객체에 저장 후
		Animal[] array = {a1,a2,a3};
		
		//2. For문을 사용해서 객체를 출력시 이름과 나이를 출력, cry, run 메소드 출력
		System.out.println(" For문");
		for(int i =0 ;i<array.length;i++) {
			System.out.println(array[i]);					//객체 출력, Animal의 toString()
			array[i].cry();									//객체의 오버라이딩된 메소드 출력
			array[i].run();									//Animal의 cry(), run() ===> 오버라이딩(자식의 cry(), run())
			System.out.println("======================");
		}
		//3. enhanced for문 
		System.out.println(" enhanced for문 ");
		for(Animal k : array) {
			System.out.println(k);
			k.cry();
			k.run();
			System.out.println("======================");
		}
		
	}

}
