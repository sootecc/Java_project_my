package chap05;

public class PrimaryAndReferenceType {

	public static void main(String[] args) {
		
		//1. 기본 자료형의 대입 연산 (stack 값을 복사)
		
		int value1 = 3;
		int value2 = value1;
		
		value2 = 7;
		System.out.println(value1);	
		System.out.println(value2);
		System.out.println("==================");
		
		
		//2. 참조 자료형의 대입 연산 (stack 값(힙 영역의 주소)을 복사)
		
		int[] array1 = new int[] {3,4,5,7};
		int[] array2 = array1;
		
		array2[0] = 7;
		System.out.println(array1[0]);	//7
		System.out.println(array2[0]);	//7
		System.out.println(array1);		//주소값 출력
		System.out.println(array2);		//주소값 출력
		

		
		
		
	}

}
