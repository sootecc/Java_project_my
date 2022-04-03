package chap02;

public class NamingVariableAndConstant {

	public static void main(String[] args) {

		// 변수명
		boolean aBcD;	// 변수명 첫 글자는 소문자로 시작, 단어를 연결한 경우 첫 단어는 대문자로
		byte 가나다라; 	// 변수명은 한글을 넣을 수 있다. (권장하지 않음)
		short _abdc;	// 변수명에 특수문자 _를 사용 할 수 있다.
		char $ab_cd;	// 변수명에 특수문자 $를 사용 할 수 있다.
		//char ab cd;	// 공백이나 다른 특수문자는 변수명에 넣을 수 없다.
		long abcd3;		// 변수명에 숫자를 넣을 수 있다. 단, 첫 글자엔 올 수 없다.
		//long 3abcd;	// 오류발생
		//double main;
		//double class;	//자바에서 사용하는 예약어들은 변수명으로 사용 할 수 없다.
		int ABCD;		//변수명은 대문자로 사용가능 (권장하지 않음), 상수로 사용할때는 전체 대문자로 사용.
		
		// 상수: 값을 변경 할 수 없다. final 키워드를 사용, 대문자를 사용
		final double PI;
		final int MY_DATA;
		final float my_Data;	//권장하지 않는다.
		
		PI = 3.141592;
		
		System.out.println(PI);
		
		// PI = 123.4567;	// 상수는 값을 재할당 할 수 없다.
		
		abcd3 = 1234L;	// 정수 데이터타입 long 변수에 값을 할당 할 때, 리터럴 마지막에 l,L을 명시해 주어야 한다.
		System.out.println(abcd3);
		abcd3 = 56789l;	// 변수에 값을 재할당
		System.out.println(abcd3);
		
		aBcD = true; // boolean 타입은 true, false만 넣을 수 있다.
		
		가나다라 = 127;	// byte : 1byte (-128 ~ +127)
		System.out.println(가나다라);
		
		// 가나라다 = 128; 에러
	 	
		
		
	}

}
