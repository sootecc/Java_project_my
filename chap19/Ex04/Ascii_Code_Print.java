package chap19.Ex04;


/*
 	ASCII 코드 값 출력: 1byte = 8bit , 첫 비트는 부호비트, 값은 7bit
 		1 ~ 32비트 까지는 출력할 수 없는 특수한 코드, null, 헤더의 시작, 경고음(7), 개행(10) 등..
 		127 : del
 		
 		실제 출력 가능 33 ~ 126
 		영문, 숫자, 특수문자
 		
 		출력
 		===================================
 		ASCII		문자		ASCII		문자
 		===================================
 */
public class Ascii_Code_Print {

	public static void main(String[] args) {

		System.out.println("=============================");
		System.out.println("ASCII\t문자\t\tASCII\t문자");
		System.out.println("=============================");
		for(int i = 33; i<127; i+=2 ) {
			System.out.println(i+"\t"+(char)i+"\t\t"+(i+1)+"\t"+(char)(i+1));
			
		}
	}

}
