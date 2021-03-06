package chap05;

public class ValueAssignment_Ex02 {

	public static void main(String[] args) {
		
		//배열에 값을 할당하는 3가지 방법
		//1.
		int[] array1 = new int[3];	//배열 변수: array1, 크기: 3, 인덱스: 0, 1, 2
									//array1[0], array1[1], array1[2]
		array1[0] = 3;
		array1[1] = 4;
		array1[2] = 5;
		
		System.out.println(array1[0]+" "+array1[1]+" "+array1[2]);
		
		System.out.println("=================");
		
		int[] array2;
		array2= new int[3];	
		
		array2[0] = 3;
		array2[1] = 4;
		array2[2] = 5;

		System.out.println(array2[0]+" "+array2[1]+" "+array2[2]);
		System.out.println("=================");
		
		//2.
		int[] array3 = new int[] {6,7,8,9,10};	//배열 변수 선언과 동시에 값 할당.
		System.out.println(array3[0]+" "+array3[1]+" "+array3[2]+" "+array3[3]+" "+array3[4]);
		System.out.println("=================");
		
		
		int[] array4;
		array4 = new int[] {3,4,5};
		System.out.println(array4[2]);
		
		
		//3.
		int[] array5= {11,12,13};
		System.out.println(array5[0]+" "+array5[1]+" "+array5[2]);
	
		/*
		int[] array6;
		array6 = {11,12,13};		이런 선언은 오류 발생
		System.out.println(array6[0]+" "+array6[1]+" "+array6[2]);
		*/
	
		
		
	}

}
