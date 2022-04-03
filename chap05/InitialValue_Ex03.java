package chap05;

public class InitialValue_Ex03 {

	public static void main(String[] args) {
		//1. 메모리의 초기값
		int value1;						//기본 자료형에 초기값을 할당하지 않았을 때
		//System.out.println(value1);
		int [] value2;					//배열: 참조 자료형
		//System.out.println(value2);
		//초기값을 넣지 않으면 오류
		
		
		int value3 = 0;					//기본 자료형에 0으로 초기값을 할당
		System.out.println(value3);
		
		int[] value4 = null;			//참조 자료형은 초기값으로 null: 알 수 없는, 비어있는 상태
		System.out.println(value4);
		
		
		//2. Heap 메모리의 초기값 (강제 초기화)
		//heap영역에는 참조자료형의 값이 할당
		//기본 자료형 배열
		//boolean: false
		//int: 0 (정수형)
		//double: 0.0 (실수형)
		
		boolean array1[] = new boolean[10];
		System.out.println(array1[0]+" "+array1[1]+" "+array1[2]);	//false false false
		// 참조 자료형은 따로 변수 초기화를 해주지 않으면 기본값이 들어간다. 
		
		System.out.println("=============for 문을 사용하여 배열의 값을 출력===================");
		for(int i = 0 ; i<3; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		System.out.println("객체의 메모리 주소: "+array1);
		System.out.println("객체의 크기: "+array1.length);
		System.out.println("=============for 문 + .length===================");
		for(int i =0; i<array1.length;i++) {
			System.out.println("array1["+i+"]의 값은:"+array1[i]);
		}
		
		
		
		System.out.println("================int 배열 초기값================");
		int[] array2 = new int[3];		//0이 기본값으로 할당
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
		}
		
		System.out.println("\n=============double 배열 초기값================");
		double[] array3 = new double[3];	//0.0이 기본값으로 할당
		for(int i=0;i<array3.length;i++) {
			System.out.print(array3[i]+ " ");
		}
		
		System.out.println("\n=============String 배열 초기값================");
		//참조 자료형 배열인 경우 기본 값으로 null
		String[] array4 = new String[3];
		for(int i=0;i<array4.length;i++) {
			System.out.print(array4[i]+ " ");
		}
		
		
		
		
	}

}
