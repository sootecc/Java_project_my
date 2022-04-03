package chap10.Ex01;

class Dog_sub extends Dog{
	int dog_sub;
	void dog_sub() {
		System.out.println("Dog의 자식 클래스입니다.");
	}
}

class Tiger extends Animal{
	int leg;
	
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아먹습니다.");
	}
}

class Dog extends Animal{
	int dog;
	
	void dogEat() {
		System.out.println("개는 사료나 먹어");
	}
}

class Eagle extends Animal{
	int wing;
	
	void eagleFly() {
		System.out.println("독수리는 날아다닙니다.");
	}
}



public class Animal {
	String name;			//동물의 이름
	int age;				//동물의 나이
	String color;			//동물의 색
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹습니다. ");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다. ");
	}
	
	
	
	public static void main(String[] args) {
		
		//업캐스팅은 다형성으로 처리하기 때문에 효율적으로 코드를 처리할 수 있다.
			//다형성: 오버라이딩(상속)을 이용하여 상속에서 하나의 메소드로 여러 정보를 처리할 수 있다.
		
		// 1. Animal 클래스 객체화
		Animal a1 = new Animal();			//자신의 필드와 메소드만 접근
		
		// 2. Dog 클래스를 Dog 타입으로 객체화
		Dog d1 = new Dog();					//Animal, Dog의 필드와 메소드 접근
		
		// 3. Dog를 Animal 타입으로 업캐스팅
		Animal a2 = new Dog();				//a2는 Animal, Dog를 내포하고 있고 Animal에만 접근 가능
		
		// 4. Dog_sub를 Animal 타입으로 업캐스팅
		Animal a3 = new Dog_sub();			//a3는 Animal, Dog, Dog_sub를 내포하고 있고 Animal에만 접근 가능
		
			a3.name = "요크셔테리어";	//Animal의 필드
		//	a3.dog = 6;				//Dog 접근 불가		
		//	a3.dog_sub = 3;			//Dog_sub 접근 불가
		
		
		// 5. Dog_sub를 Dog 타입으로 업캐스팅
		Dog d2 = new Dog_sub();				//d2는 Animal, Dog, Dog_sub를 내포하고 있고 Animal, Dog에 접근 가능
			
			d2.name = "셰퍼드";		//Animal의 필드
			d2.dog = 5;				//Dog
		//	d2.dog_sub = 3;			//Dog_sub 접근 불가
		
		
		//Animal <- Dog <- Dog_sub
		// 6. Dog_sub를 Dog_sub 타입으로 객체화
		Dog_sub ds1 = new Dog_sub();			//ds1는 Animal, Dog, Dog_sub를 내포하고 있고 전부 접근 가능
				
			ds1.name = "진돗개";		//Animal 클래스의 필드
			ds1.age = 4;			//Animal
			ds1.dog = 3;			//Dog
			ds1.dog_sub = 2;		//Dog_sub
		
	
		/*
		 * 	**업캐스팅**: 자식 타입의 데이터 타입에서 부모 데이터 타입으로 변환하는 것 (자동 변환)

			→ 부모 타입의 필드와 메소드만 접근 가능
			
			자식 → 부모
			*/
			Dog ds1_c1 = ds1;	//업캐스팅: Dog_sub -> Dog 타입으로 업캐스팅
			Animal ds1_c2 = ds1;//업캐스팅: Dog_sub -> Animal 타입으로 업캐스팅
			
			//ds1: Dog_sub 데이터 타입
			//ds1_c1: Dog
			//ds1_c2: Animal
			
			
		/*	
			**다운캐스팅**: 부모 데이터 타입으로 업캐스팅 된 것을 자식 데이터 타입으로 변환하는 것 (수동(강제) 변환)
			
			부모 → 자식
			
			업캐스팅 된 것이 아닌 원래부터 최상위 부모였던 것을 쓰면 어떻게 되는거지?
			Dog_sub a1_c3 = (Dog_sub)a1;
			a1_c3.dog_sub();
			해봤더니 컴파일 오류
		 */
			Dog_sub a3_down1 = (Dog_sub)a3;
			Dog a3_down2 = (Dog)a3;
			
	}

}
