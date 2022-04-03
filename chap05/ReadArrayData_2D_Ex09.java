package chap05;

public class ReadArrayData_2D_Ex09 {

	public static void main(String[] args) {
		//2차원 배열의 길이
		int[][] array1 = new int [2][3];
		System.out.println(array1.length);	//2차원 배열인 경우: .length (행의 개수를 출력)
		System.out.println(array1[0].length);//열의 개수
		System.out.println(array1[1].length);
		
		int[] array11 = new int [10];		//1차원 배열인 경우: .length (열의 개수를 출력)
		System.out.println(array11.length);
		
		
		//2차원 배열 출력 방법 1
		int [][] array2 = new int [][] {{1,2},{3,4,5}};
		System.out.println(array2.length);
		System.out.println(array2[0].length);
		System.out.println(array2[1].length);
		System.out.println("==========================");
		
		//배열의 index 번호로 출력하는 방법
		System.out.println(array2[0][0]+" "+array2[0][1]);
		System.out.println(array2[1][0]+" "+array2[1][1]+" "+array2[1][2]);
		
		//이중 for문을 사용해서 출력하는 방법
		System.out.println("==========================");
		for(int i= 0;i<array2.length;i++) {
			for(int j =0;j<array2[i].length;j++) {
				System.out.print(array2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		for(int[] array: array2) {				//2차원 배열 행의 값을 1차원 배열 변수에 담음
			for(int k: array) {					//1차원 배열의 값을 k에 담아 출력
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
