package chap01;

public class Hello02 {
	//메소드 선언 (C, C++에서 함수라고 이야기 하는 것, 객체지향언어에선 메소드)
	
	public static int sum(int n, int m) {
		return n+m;
	}
	
	public static void main(String[] args) {
		//변수 선언
		
		int i = 20;		
		int s;
		char a;		//한 글자만 넣을 수 있음. (아스키값), '(작은따옴표를 사용해서 값을 할당)
		String b;
		
		b="오늘의 날씨는 맑습니다.";
		
		s = sum (i,10); //sum 메소드 호출
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
		System.out.println(b);
	}

}
