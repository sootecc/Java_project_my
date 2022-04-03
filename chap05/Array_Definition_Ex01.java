package chap05;

public class Array_Definition_Ex01 {

	public static void main(String[] args) {
		/*
		 * 배열 변수 선언 방법
		 *  - 하나의 배열 변수에 많은 데이터를 저장
		 *  - 선언시 동일한 자료형의 값을 저장(컬렉션은 여러 데이터 타입을 저장)
		 *  - 값을 저장할 배열 크기를 지정하면 크기를 수정할 수 없음(컬렉션은 자동으로 늘어남)
		 */
	
		
		//선언 방법 1
		int[] array1 = new int[3];	//배열 선언과 동시에 크기를 할당
	
		int[] array2;				//변수 선언
		array2 = new int [3];		//크기 지정
	

		
		//선언 방법 2
		int array3[] = new int[3];	//변수 선언과 동시에 크기 지정
		
		int array4[];
		array4 = new int [3];

		
		
		
		//다양한 배열 선언 (기본 자료형 배열, 참조 자료형 배열)
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9];
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
