package chap18.Ex08;

//배열의 생성자에 참조
@FunctionalInterface
interface A{
	int[] abc (int len);
}

public class RefOfArrayConstructor {



	

	
	public static void main(String[] args) {

		//배열의 생성자 참조.
		//1. 익명 이너 클래스
		A a1 = new A() {		//배열 선언 int[] arr = new int[방의개수];
			@Override
			public int[] abc(int len) {	//정수로 len 값을 받아서
				return new int[len];	//정수를 받아서 배열 방의 크기를 리턴
			}
		};
		
		//람다식
		A a2 = (int len) -> {return new int[len];};
		A a3 = len -> new int[len];
		
		
		//배열의 생성자 참조 표현식
		A a4 = int[]::new;
		
		
		
		//배열 선언 구문
		//int[] array = new int[3];
		//int[] array = new int[] {1, 2, 3, 4, 5};	선언과 동시에 값 할당
		//int[] array = {1, 2, 3, 4, 5};			선언과 동시에 값 할당
		
		
		int[] array1 = a1.abc(3);		//abc메소드가 방 크기를 설정해준 것
		System.out.printf("%d%s",array1.length,System.lineSeparator());
		
		int[] array2 = a2.abc(4);		//abc메소드가 방 크기를 설정해준 것
		System.out.printf("%d%s",array2.length,System.lineSeparator());
		
		int[] array3 = a3.abc(5);		//abc메소드가 방 크기를 설정해준 것
		System.out.printf("%d%s",array3.length,System.lineSeparator());
		
		
	
	
	}

}
