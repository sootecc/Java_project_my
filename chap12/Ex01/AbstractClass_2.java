package chap12.Ex01;


//2. 추상 메소드를 사용하는 두 번째 방법: 자식 클래스 생성 없이 익명 클래스를 활용하는 방법
	// 임시적으로 한 번만 사용할 때(이벤트 처리)
	// 장점: 자식 클래스 생성을 하지 않는다.
	// 단점: 여러 객체를 생성해야 할 경우 비효율적이다.
abstract class AAA{
	abstract void abc();	//추상 메소드
}





public class AbstractClass_2 {

	public static void main(String[] args) {
		
		//1. 익명 객체 생성
		AAA aaa = new AAA() {	//익명 객체를 활용한 추상 메소드를 클래스 생성없이 구현. 끝에 세미콜론 들어가는게 좀 특이하네
			void abc() {
				System.out.println("방법 2: 객체 생성 없이 익명클래스로 추상메소드 구현");
			}
		};
		
		//AAA aaa1 = new AAA(); 추상클래스는 객체 생성 불가, 익명 클래스 생성 후 메소드 재정의하여 출력
		AAA aaa1 = new AAA() {
			void abc() {
				System.out.println("방법 2: 객체 생성 없이 익명클래스로 추상메소드 구현");
			}
		};
		
		AAA aaa2 = new AAA() {
			void abc() {
				System.out.println("방법 2: 객체 생성 없이 익명클래스로 추상메소드 구현");
			}
		};			
		
		
		//2. 메소드 호출
		aaa.abc();		
		aaa1.abc();
		aaa2.abc();
	}

}
