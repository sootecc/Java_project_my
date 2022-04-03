package chap03;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// ++ 는 1 증가, 
		int a = 3;
		++a;
		System.out.println(a);
		
		int b = 3;
		b++;
		System.out.println(b);
		
		System.out.println("=======================");
		
		int a1 = 3;
		int b1 = ++a1;			//++가 앞에 왔을 때. a1을 증가시킨 후 b1에 대입
		System.out.println(a1);
		System.out.println(b1);
		
		System.out.println("=======================");
		
		int a2 = 3;
		int b2 = a2++;			// ++가 뒤에 왔을 때. a2를 b2에 대입 후 a2증가 
		System.out.println(a2);
		System.out.println(b2);
			
		//a2의 값을 b2에 대입 후 a2가 증가되기 때문에 
		//a2는 4, b2는 3이 나온다.
	
		//증가 후 대입이냐, 대입 후 증가냐
	
		System.out.println("======================");
		
		//산술 연산자
		System.out.println( 2 + 3 );	
		System.out.println( 8 - 5 );
		System.out.println( 7 * 2 );
		System.out.println( 7 / 2 );	// 몫만 나타난다.
		System.out.println( 8 % 5 );	// 나머지만 나타난다.

		System.out.println("2" + "3");	// 두 문자열을 연결하는 연산자
	
	
		/**/
		
		
		int value10 = 9;
		System.out.println(++value10);
		System.out.println(value10++);
		
		
		
		
		
	
	
	}

}