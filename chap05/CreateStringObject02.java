package chap05;

import java.util.Arrays;

public class CreateStringObject02 {

	public static void main(String[] args) {

		//객체의 값을 복사한 후 수정했을때의 변화
		//1. 문자열 수정( 객체의 내용은 변경이 불가--> 새로운 객체가 생성)
		String str1 = new String("안녕");
		String str2 = str1;					//참조자료형일때는 Stack의 주소값을 복사
		
		str1 = "안녕하세요";					//별도의 메모리 공간(heap)에 "안녕하세요"가 생성 . 새로운 주소에 만든다.
		System.out.println(str2);			//기존의 "안녕"을 가리키고 있다.
		System.out.println(str1);			//새로운 "안녕하세요" 주소를 가리킨다.
		
		
		//배열인 경우 
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;
		
		array1[0] = 6;
		array1[1] = 7;
		array1[2] = 8;
		
		System.out.println(Arrays.toString(array1));		
		System.out.println(Arrays.toString(array2));
		
		//배열은 새로운 값을 대입했을 때 별도의 메모리공간을 만드는 것이 아니고
		//기존 주소에 있던 값이 수정된다.
	}

}
