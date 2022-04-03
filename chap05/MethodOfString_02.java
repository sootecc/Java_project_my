package chap05;

import java.util.Arrays;

public class MethodOfString_02 {

	public static void main(String[] args) {
		
		//5. 문자열 수정
		//toLowerCase(): 소문자로 변환, toUpperCase(): 대문자로 변환
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase());	
		System.out.println(str1.toUpperCase());
		System.out.println();
		
		//replace(old,new): old를 new로 바꿈
		System.out.println(str1.replace("Study", "공부"));	//원본(str1)이 바뀌진 않네
		
		//subString(시작index,자를 마지막 index): 문자열의 부분을 출력
		System.out.println(str1.substring(1,6));	//마지막 index는 미포함, 5번까지	ava S
		System.out.println(str1.substring(2));		//변수 하나만 쓰면 시작부터 끝까지	va Study
		
		//split(): 특정 문자를 기준으로 잘라서 String[] 배열에 저장
		String str11 = "abc/def-ghi jkl";
		String[] strArray = str11.split("/| |-");		//or 연산자가 먹히네    '/' , '-' , ' '요거 기준으로 자른다
		System.out.println(Arrays.toString(strArray));
		
		String str111 = "오늘의 날씨는 흐립니다. ";
		String[] strArray2 = str111.split(" ");			//공백을 기준으로 잘라서 strArray2 배열에 저장
		System.out.println(Arrays.toString(strArray2));
		
		String str1111 = "이름, 나이, 성별, 전화번호, 메일주소";
		String[] strArray3 = str1111.split(",");			
		System.out.println(Arrays.toString(strArray3));
		for(int i =0 ; i<strArray3.length;i++) {
			System.out.print(strArray3[i]+" ");
		}
		System.out.println();
		

		
		
		//trim(): 앞뒤의 공백을 제거
		System.out.println("      abc    d    ");
		System.out.println("      abc    d    ".trim());
		System.out.println();
	
	
	
		//6. 문자열의 내용 비교(equals(): 대소문자 구분하면서 값을 비교 ,equalsIgnoreCase(): 대소문자 구별 없이 값을 비교)
		
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		//메모리의 주소 값 비교 ( == )
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		System.out.println();
		
		//값을 비교(equals(), equalsIgnoreCase() )
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str2));
		System.out.println();
		
		System.out.println(str2.equalsIgnoreCase(str3));	
		System.out.println(str3.equalsIgnoreCase(str4));
		System.out.println(str4.equalsIgnoreCase(str2));
		
	}

}
