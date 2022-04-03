package KOSMO;

public class Print {

	public static void main(String[] args) {
		System.out.println("화면출력");	//자바의 한 라인 주석
		
		/*
		 * 주석: 프로그램에서 해석되지 않는 코드. 프로그램에 대한 설명
		 * 여러 라인의 주석
		 */
		System.out.println("화면" + "출력"); //"+" 문자열일 때 연결연산자
		System.out.println(3.8); //정수, 실수를 출력할때는 ""를 넣지 않는다.
		System.out.println(3+5); //+는 정수나 실수일 때 +(더하기)
		System.out.println("3" + "5");
		System.out.println("화면: " + 3);
		System.out.println("화면 "+ 3 + 5); //문자열이 앞에 들어 있으면 뒤의 + 전부 연결연산자로 사용된다.
		System.out.println(3 + 5 + "화면"); //5 뒤의 +만 연결연산자로 사용된다.
		//+의 사용법
	}

}
