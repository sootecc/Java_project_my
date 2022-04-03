package chap06_07.EX02;

public class EffectOfPrimaryDataArgument {
		int abc; //필드: heap영역에 저장, 객체화를 시켜야 사용가능
	
	
	static int twice(int a){		//정수 매개변수
		a = a*2;
		return a;
	}
	
	
	public static void main(String[] args) {
		int a = 3;						//지역변수: stack 영역에 변수명과 함께 저장
		int result1 = twice(3);
		System.out.println(result1);
		
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);
		
	}

}
