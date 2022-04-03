package chap13.Ex10;

class AAA{
	
	BBB b ;			// BBB : 인터페이스 타입, b : 참조 변수
					// b => null 들어가 있음
	
					//값 할당 방법:
					// 1. 객체 생성 후 값을 할당.
					// 2. 생성자를 통해서 값을 할당.
					// 3. setter를 통해서 값을 할당.
					
	AAA(){}
	AAA(BBB b){
		this.b = b;
	}
	
	
	
	public void setBBB(BBB b) {
		this.b = b;
	} 
	
	interface BBB{
		
		void play();
		void stop();
		
	}		//interface를 오버라이딩 하는 과정이 무조건 필요하다.
	
	void abc() {
		b.play();
		b.stop();
	}
}


public class InnerInterface_1_1 {
	public static void main(String[] args) {
	
		
		//3. setter를 통하여 값을 할당
		AAA a = new AAA();
		a.setBBB(new AAA.BBB() {
			
			@Override
			public void stop() {
				System.out.println("멈춤");
			}
			
			@Override
			public void play() {
				System.out.println("재생");
			}
		});
	
		a.abc();
		System.out.println("===================================");
		
		
		// 1. 객체 생성 후 필드의 값을 할당
		AAA a1 = new AAA();
		a1.b = (AAA.BBB) new AAA.BBB() {
			@Override
			public void play() {
				System.out.println("짹짹");
			}
			@Override
			public void stop() {
				System.out.println("새는 하늘을 납니다.");
			}
		};			//인터페이스 AAA.BBB
		
		a1.abc();
		System.out.println("===================================");
		

		//2. 생성자를 통해서 값 할당
		AAA a2 = new AAA(
			new AAA.BBB(){
			@Override
			public void stop() {
				System.out.println("어흥 중지");
			}
			@Override
			public void play() {
				System.out.println("어흥 플레이 중지");
			}
		}		
				
		);				//생성자 내부에 AAA.BBB 타입의 객체 생성 후 넣음
		
		
		a2.abc();
		System.out.println("===================================");
		
		
		
		
	}
}
