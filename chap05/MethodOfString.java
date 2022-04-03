package chap05;

import java.util.Arrays;

public class MethodOfString {

	public static void main(String[] args) {
		
		// 1. 문자열 길이 (length()): int 타입으로 반환
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length());		//11글자
		System.out.println(str2.length());		//13글자
		//자바는 한글을 1글자로 쳐준다 다른 언어는 2byte로 치는 경우가 있음
		System.out.println();
		
		//2. 문자열 검색( charAt(), indexOf(), lastIndexOf())
		System.out.println(str1.charAt(1));			//1번 index의 문자를 출력
		System.out.println(str2.charAt(1));	
		System.out.println();
		
		//indexOf(): 0번째 index부터 마지막index까지 글자의 index를 출력
		//lastIndexOf(): 마지막index부터 0번째까지 글자의 index를 출력
		
		System.out.println(str1.indexOf('a'));		//앞에서부터 첫 a는 7번째 index
		System.out.println(str1.lastIndexOf('a'));	//뒤에서부터 첫 a는 9번째 index
		System.out.println(str1.indexOf('a',8));	//8번방에서부터 오른쪽으로 검색 시작
		System.out.println(str1.lastIndexOf('a',8));//8번방에서부터 왼쪽으로 검색 시작
		System.out.println(str1.indexOf("Java"));	//Java가 시작되는 문자열 index
		System.out.println(str1.lastIndexOf("Java"));//검색은 뒤부터
		System.out.println(str2.indexOf("하세요"));		//
		System.out.println(str2.lastIndexOf("하세요"));	//
		System.out.println(str1.lastIndexOf("bye"));	//중요! 값이 존재하지 않는 경우 -1
		System.out.println();
	
	
		//3. 문자열 변환 및 연결 (String.valueOf(),concat())
		// String.valueOf(기본자료형): 기본자료형 ==> String으로 변환
		String str3 = String.valueOf(2.3);		//실수 2.3을 String형으로 변환
		String str4 = String.valueOf(false);	//boolean type false를 String형으로 변환
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		
		//concat(): 문자열과 문자열을 연결: + 연산자와 같음
		String str5 = str3.concat(str4);		//2.3false
		System.out.println(str5);
		System.out.println();
		
		//concat() 메소드에서 String.valeOf() 사용
		String str6 = "안녕" + 3;		//안녕3		+ 연산자를 사용할때는 자동변환
		String str7 = "안녕".concat(String.valueOf(3));	//안녕3
				//concat을 사용할 때 String 타입으로 변환 필요
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println();
		

		//4. 문자열 => byte[] 변환, 입출력 값을 처리할 때 사용. 
			//getBytes()
			
			//문자열 => char[]	toCharArray()
			
		String str8 = "Hello Java";
		String str9 = "안녕하세요";
		
		//getBytes(): 문자열 => byte[]
		byte[] array1 = str8.getBytes();
		byte[] array2 = str9.getBytes();
		
		System.out.println(Arrays.toString(array1));		//아스키코드가 출력  
		System.out.println(Arrays.toString(array2));
		
		
		
		//toCharArray(): 문자열 => char[]
		char[] array3 = str8.toCharArray();
		char[] array4 = str9.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));
		
	
	}

}
