package chap03;

public class OperatorEx04 {

	public static void main(String[] args) {
		/*
		 * 대입 연산자 ( =, +=, -=, *=,	>>=, <<= >>>=)
		 * a = b;	b 변수의 값을 a 에 할당 
		 * a += b	a = a + b
		 * a -= b	a = a - b
		 * a *= b	a = a * b
		 * a /= b	a = a / b
		 * a &= b	a = a & b
		 * a |= b	a = a | b
		 * a <<= b	a = a << b
		 */
		
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		int value2;	//기본자료형인 경우 변수의 값을 넣지 않으면 기본값으로 0이 할당.
		value2 = 5;	//참조자료형인 경우 변수의 값을 넣지 않으면 기본값으로 NULL
		//축약 표현
		
		System.out.println(value2 += 2);	//value2 = value2 + 2	// 5+2 = 7
		System.out.println(value2 -= 2);	//value2 = value2 - 2	// 7-2 = 5
		System.out.println(value2 /= 2);	//value2 = value2 / 2	//
		value2 = 5; System.out.println(value2 %= 2);	
		value2 = 5;	System.out.println(value2 | 2);
		value2 = 5;	System.out.println(value2 & 2);
		
		value2 = 5; System.out.println(value2 <<= 2);	// 결과값은 20
		value2 = 5; System.out.println(value2 >>= 2);	
		value2 = 5; System.out.println(value2 >>>= 2);	//이건 부호비트까지 같이 움직임
														//그럼 음수일때 잘 봐야겠네.
		value2 = -128; System.out.println(value2 >>>= 2);
		
	
	}

}
