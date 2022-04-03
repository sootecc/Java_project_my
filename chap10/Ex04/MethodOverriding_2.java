package chap10.Ex04;

class Animal2 {
	void run() {
		
	}
}

class Tiger extends Animal2{	//호랑이는 네 발로 달립니다.
	@Override
	void run() {
		System.out.println("호랑이는 네 발로 달립니다.");
	}
	void tigerEat() {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}

class Eagle extends Animal2{	//독수리는 하늘을 납니다.
	@Override
	void run() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	void eagleEat() {
		System.out.println("독수리는 동물을 먹습니다.");
	}
}
class Snake extends Animal2{	//뱀은 기어다닙니다.
	@Override
	void run() {
		System.out.println("뱀은 기어다닙니다.");
		}
	void snakeEat() {
		System.out.println("뱀은 동물을 먹습니다.");
	}
	
}


public class MethodOverriding_2 {

	public static void main(String[] args) {
		
		//1. 모든 객체는 Animal2 타입으로 업캐스팅해서 생성.
		
		
		Animal2 tiger = new Tiger();
		Animal2 eagle = new Eagle();
		Animal2 snake = new Snake();
		
		
		//2. Animal2 배열에 각 객체를 저장
		
		Animal2[] animals = {tiger, eagle, snake};
		
		
		//3. for문으로 배열의 객체를 출력. run
		System.out.println("for문=======================");
		for(int i=0; i<animals.length;i++) {
			animals[i].run();
		}
		
		//4. Enhanced for문을 사용해서 객체의 run() 메소드 출력
		System.out.println("Enhanced for문===============");
		for(Animal2 k: animals) {
			k.run();
		
		}
		
		
		//5. 다운캐스팅 (
		System.out.println("다운캐스팅===================");
		
			if(animals[0] instanceof Tiger) {
				Tiger tiger_down = (Tiger) tiger;
				tiger_down.tigerEat();
			}
			else {
				System.out.println("Tiger 다운캐스팅 실패");
			}
			if(animals[1] instanceof Eagle) {
				Eagle eagle_down = (Eagle) eagle;
				eagle_down.eagleEat();
			}
			else {
				System.out.println("Eagle 다운캐스팅 실패");
			}
			if(animals[2] instanceof Snake) {
				Snake snake_down = (Snake) snake;
				snake_down.snakeEat();
			}
			else {
				System.out.println("Snake 다운캐스팅 실패");
			}
		}
	

}
